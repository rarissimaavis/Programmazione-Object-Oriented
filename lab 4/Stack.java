package strutture;

public class Stack
{
	private int s[];
	private int first;
	
	public Stack(int n) //overloading costruttore
	{
		s = new int[n];
		first = 0;
	}
	
	public Stack() //costruttore di default
	{
		this(20); //fisso dimensione massima
	}
	
	public boolean push(int val)
	{
		if (first < s.length)
		{
			s[first] = val;
			first++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int pop()
	{
		if (first > 0)
		{
			first--;
			return s[first];
		}
		else
		{
			return 0;
		}		
	}
	
	public void reset()
	{
		first = 0;
	}
	
	public boolean empty()
	{
		return first == 0;
	}
	
	public boolean full()
	{
		return first == s.length;
	}
	
	/*
	public void finalize() //override finalize
	{
		if (first > 0) //stack vuoto -> informazioni perse
		{
			System.out.println("Distrutto Stack non vuoto");
		}
	}
	*/
}
			