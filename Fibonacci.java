class Fibonacci
{
	
	
	static int fibo(int x)
	{
		
		if(x <= 1)
			return x;
		else
			return fibo(x-1) + fibo(x-2);
		
		
	}
	
	public static void main(String args[])
	{
		int n = 8;
		
		for(int i=0; i<=n; i++ )
		{
			System.out.print(" "+fibo(i));
		}
	}
}