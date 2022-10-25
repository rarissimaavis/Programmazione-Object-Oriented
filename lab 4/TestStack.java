/*
Implementare un oggetto che ha un'interfaccia (in modo tale da semplificarne l'utilizzo) per la gestione di uno stack
Struttura interna dello stack: vettore a dim fissata, puntatore elementi
*/
package strutture;

public class TestStack
{
	public static void main(String[] args)
	{
		Stack s = new Stack(10);
		int i = 1;
		while (i <= 5)
		{
			s.push(i);
			i++;
		}
		
		s.pop();
		s.push(4);
		
		while (!s.empty())
		{
			System.out.print(s.pop() + " ");
		}

		s = null;
		System.gc();
	}
}
