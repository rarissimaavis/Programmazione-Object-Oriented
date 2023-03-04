package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import core.Giocatore;
import core.Squadra;
import eccezioni.PlayerException;
import gui.GUI;
import interfacce.SquadraDiCalcio;

public class Test 
{
	public static void main(String[] args) throws PlayerException
	{
		ArrayList<Giocatore> listaGiocatori = new ArrayList<Giocatore>();
		Squadra squadra = new Squadra("Napoli", 2020, 15);
				
		Giocatore g1 = new Giocatore("Mario", 22, 200000);
		Giocatore g2 = new Giocatore("Luigi", 21, 150000);
		Giocatore g3 = new Giocatore("Mattia", 19, 99000);
		Giocatore g4 = new Giocatore("Marco", 23, 75000);
		
		((SquadraDiCalcio) squadra).Aggiungi(g1);
		((SquadraDiCalcio) squadra).Aggiungi(g2);
		((SquadraDiCalcio) squadra).Aggiungi(g3);
		((SquadraDiCalcio) squadra).Aggiungi(g4);
		
		//esercizio 1 
		
		GUI gui = new GUI(squadra);
		gui.setVisible(true);
		
		PrintWriter out = null;
		
		listaGiocatori = squadra.getListaGiocatori();
		
		try
		{	
			out = new PrintWriter(new BufferedWriter(new FileWriter("Giocatori.txt")));
			
			for(Giocatore g : listaGiocatori) out.println(g);
		
			out.close();
		}
		catch(EOFException e)
		{
			System.out.println(e.getMessage());
			out.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			out.close();
		}
		
		//esercizio 2
		
		System.out.println("\nStampa il cartellino di ogni giocatore in squadra");
				
		printCartellino(squadra);
		
		//esercizio 3
		
		System.out.println("\nNumero giocatori con meno di 24 anni e che guadagnano più di 100000 euro: " + countByCond(squadra));
		
		//esercizio 4
		
		token(squadra);
	}


	public static void printCartellino(Squadra s)
	{
		Predicate<Giocatore> pred = g -> g instanceof Giocatore;
			
		Consumer<Giocatore> block = g -> System.out.println(g.getCodiceCartellino());
		//versione con stampa completa: Consumer <Giocatore> block= g -> System.out.println(g.toString());
		
		for(Giocatore g : s.getListaGiocatori()) if(pred.test(g)) block.accept(g);
	}

	public static int countByCond(Squadra s)
	{
		Predicate<Giocatore> pred = g -> g.getEta() < 24 && g.getStipendio() > 100000;
		
		return (int) s.getListaGiocatori().stream().filter(pred).count();
	}
	
	public static void token(Squadra squadra) throws PlayerException
	{
        StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        while (true)
        {
            try
            {
                System.out.print("\nInserisci nome, età e stipendio del giocatore:\n");
                
                tokenizer.nextToken();
                String nome = tokenizer.sval;
                tokenizer.nextToken();
                int eta = (int) tokenizer.nval;
                tokenizer.nextToken();
                float stipendio = (float) tokenizer.nval;

                Giocatore g = new Giocatore(nome, eta, stipendio);
                squadra.Aggiungi(g);

                System.out.print("Continuare? (s/n) ");
                tokenizer.nextToken();
                String ans = tokenizer.sval;
                if (ans.equals("n")) break;
            } 
            catch (IOException e)
            {
            	System.out.println(e.getMessage());
            }
        }
    }
}