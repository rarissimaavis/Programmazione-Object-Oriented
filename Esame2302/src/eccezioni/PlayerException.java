package eccezioni;

public class PlayerException extends Exception 
{
	public PlayerException() 
	{
		super("Operazione sul giocatore non consentita!");
	}

	public PlayerException(String message) 
	{
		super(message);
	}
}