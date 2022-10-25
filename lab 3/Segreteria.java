/*
Definire una classe Studente:
- definire gli attributi necessari
- definire i metodi per leggere e scrivere gli attributi
Definire una classe Segreteria che permette la registrazione e la stampa
*/

import java.util.Scanner;
import java.util.Date;

public class Segreteria
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire nome, cognome, matricola: ");
		
		Studente s = new Studente(sc.nextLine(), sc.nextLine(), sc.nextLine());
		System.out.println("Dati studente: " + s.getNome() + " " + s.getCognome() + " " + s.getMatricola() + " " + s.getIscrizione());
	}
}

class Studente
{
	private String nome, cognome, matricola;
	private Date iscrizione;
	
	//rendo privato il costruttore di default così non può essere creato senza essere inizializzato
	private Studente(){}
	
	public Studente(String n, String c, String m)
	{
		nome = n;
		cognome = c;
		matricola = m;
		iscrizione = new Date();
	}
	
	public void setNome(String n)
	{
		nome = n;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setCognome(String c)
	{
		cognome = c;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public String getMatricola()
	{
		return matricola;
	}
	
	public Date getIscrizione()
	{
		return iscrizione;
	}
}