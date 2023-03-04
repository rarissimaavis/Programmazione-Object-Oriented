package core;

public class Giocatore
{
	private static int count = 0;
	private int codiceCartellino;
	private String nome;
	private int eta;
	private float stipendio;
	
	public Giocatore(String nome, int eta, float stipendio)
	{
		this.codiceCartellino = count++;
		this.nome = nome;
		this.eta = eta;
		this.stipendio = stipendio;
	}

	public int getCodiceCartellino()
	{
		return codiceCartellino;
	}

	public void setCodiceCartellino(int codiceCartellino)
	{
		this.codiceCartellino = codiceCartellino;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getEta()
	{
		return eta;
	}

	public void setEta(int eta)
	{
		this.eta = eta;
	}

	public float getStipendio()
	{
		return stipendio;
	}

	public void setStipendio(float stipendio)
	{
		this.stipendio = stipendio;
	}

	@Override
	public String toString()
	{
		return "Giocatore [codiceCartellino=" + codiceCartellino + ", nome=" + nome + ", eta=" + eta + ", stipendio="
				+ stipendio + "]";
	}	
}