package core;

import eccezioni.PlayerException;

public class Squadra extends ListaGiocatori 
{
	public Squadra(String nome, int annoCampionato, int maxGiocatori)
	{
		super(nome, annoCampionato, maxGiocatori);
	}
	
	public void Aggiungi(Giocatore g) throws PlayerException
	{
		if (super.getListaGiocatori().contains(g)) throw new PlayerException();
		else if (super.getMaxGiocatori() <= this.listaGiocatori.size()) throw new PlayerException("Num max raggiunto!");
		else super.getListaGiocatori().add(g);
	}
	
	public void Rimuovi(Giocatore g) throws PlayerException
	{
		if (!(super.getListaGiocatori().contains(g))) throw new PlayerException();
		else super.getListaGiocatori().remove(g);
	}
	
	public void Modifica(int n)
	{
		if (n > 0 && n >= this.listaGiocatori.size()) super.setMaxGiocatori(n);
	}
}