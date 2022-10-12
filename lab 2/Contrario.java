class Contrario
{
	public static void main (String agrs[]) 
	{
		String s = new String("contrario");
		System.out.println(s);
		
		String s1 = new String();
		String s2 = new String();
		
		s1 = s.substring(0, 6);
		s2 = s.substring(6);
		
		s = s2 + s1;
		System.out.println(s);
	}
}