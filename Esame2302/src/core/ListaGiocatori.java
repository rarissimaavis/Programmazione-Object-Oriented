package core;

import java.util.ArrayList;

import interfacce.SquadraDiCalcio;

public abstract class ListaGiocatori implements SquadraDiCalcio
{
	private static int count = 0;
	
	protected int codiceSquadra;
	protected String nomeSquadra;
	protected int annoCampionato;
	protected int maxGiocatori;
	protected ArrayList<Giocatore> listaGiocatori;
	
	public ListaGiocatori(String nomeSquadra, int annoCampionato, int maxGiocatori)
	{
		this.codiceSquadra = count++;
		this.nomeSquadra = nomeSquadra;
		this.annoCampionato = annoCampionato;
		this.maxGiocatori = maxGiocatori;
		this.listaGiocatori = new ArrayList<Giocatore>();
	}
	
	public int getCodiceSquadra()
	{
		return codiceSquadra;
	}

	public void setCodiceSquadra(int codiceSquadra)
	{
		this.codiceSquadra = codiceSquadra;
	}

	public String getNomeSquadra()
	{
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra)
	{
		this.nomeSquadra = nomeSquadra;
	}

	public int getAnnoCampionato()
	{
		return annoCampionato;
	}

	public void setAnnoCampionato(int annoCampionato)
	{
		this.annoCampionato = annoCampionato;
	}

	public int getMaxGiocatori()
	{
		return maxGiocatori;
	}

	public void setMaxGiocatori(int maxGiocatori)
	{
		this.maxGiocatori = maxGiocatori;
	}
	
	public ArrayList<Giocatore> getListaGiocatori()
	{
		return listaGiocatori;
	}

	public void setListaGiocatori(ArrayList<Giocatore> listaGiocatori)
	{
		this.listaGiocatori = listaGiocatori;
	}

	@Override
	public String toString()
	{
		return "ListaGiocatori [codiceSquadra=" + codiceSquadra + ", nomeSquadra=" + nomeSquadra + ", annoCampionato="
				+ annoCampionato + ", maxGiocatori=" + maxGiocatori + "]";
	}

	public abstract void Modifica(int n);
}