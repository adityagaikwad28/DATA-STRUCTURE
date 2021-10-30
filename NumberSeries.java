
// Natural Numbers
/*
class NumberSeries
{
	static int n = 0;
	static void display()
	{
		n++;
		if(n <= 10)
		{
			System.out.println(n);
			display();
		}
	}
	public static void main(String args[])
	{
		
		display();
	}
}
*/

// Even Numbers


class NumberSeries
{
	static int  n = 20;
	static void display()
	{
		
		n++;
		if(n % 2  == 0)
		{
			System.out.println(n);
			display();
				
		}
	}
	public static void main(String args[])
	{
		
		display();
	}
}