package Series;

public class Fibonacci
{
	int i,n;
	int a=1, b=1, c=0;

	public Fibonacci(int n)
	{
		this.n = n;
	}

	public void calc(int n)
	{
		System.out.println("Fibonacci Series :");
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++)
		{
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}
