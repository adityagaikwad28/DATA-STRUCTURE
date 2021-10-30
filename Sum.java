class Sum
{
	
	static int display(int n)
	{
		if(n <= 1)
		
			return n;
		else
			return n + display(n-1);
	}
	public static void main(String args[])
	{
		
		System.out.println(display(6));
	}
}