package interfacce;

import eccezioni.PlayerException;
import core.Giocatore;

public interface SquadraDiCalcio 
{
	void Aggiungi(Giocatore g) throws PlayerException;
	void Rimuovi(Giocatore g) throws PlayerException;
}