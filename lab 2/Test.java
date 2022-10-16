/*
Definire una classe Triangolo ed una Classe Cerchio specificando:
- i metodi necessari al calcolo di area e perimetro (restituendo i risultati come valore)
- gli attributi necessari alla realizzazione dei metodi
Definire il costruttore che accetta i parametri in ingresso e inizializza gli oggetti
Definire una classe Test che utilizza oggetti delle classi Cerchio e Triangolo
*/

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire raggio: ");
		
		Cerchio c = new Cerchio(sc.nextFloat());
		System.out.println(c.Perimetro());
		System.out.println(c.Area());
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Inserire base e altezza: ");
		
		Triangolo t = new Triangolo(sc2.nextFloat(), sc2.nextFloat());
		System.out.println(t.Perimetro());
		System.out.println(t.Area());
	}
	
}

class Cerchio
{
	private float raggio = 0;
	
	public Cerchio(float r)
	{
		if (r > 0)
		{
			raggio = r;
		}
	}
	public void setRaggio(float r)
	{
		if (r > 0)
		{
			raggio = r;
		}
	}
	public float getRaggio()
	{
		return raggio;
	}
	public float Perimetro()
	{
		return (float) (3.14*2*raggio);
	}
	public float Area()
	{
		return (float) (3.14*raggio*raggio);
	}
}

class Triangolo
{
	private float base = 0, altezza = 0;
	
	public Triangolo(float b, float h)
	{
		if (b > 0)
		{
			base = b;
		}
		if (h > 0)
		{
			altezza = h;
		}
	}
	public void setBase(float b)
	{
		if (b > 0)
		{
			base = b;
		}
	}
	public void setAltezza(float h)
	{
		if (h > 0)
		{
			altezza = h;
		}
	}
	public float getBase()
	{
		return base;
	}
	public float getAltezza()
	{
		return altezza;
	}
	public float Perimetro()
	{
		return base*3;
	}
	public float Area()
	{
		return base*altezza/2;
	}
}