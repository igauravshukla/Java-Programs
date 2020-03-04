package Series;
public class Square
{
	int n;
	public Square(int n)
	{
		this.n=n;
	}

	public static void calc(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Square of "+i+" is "+(i*i));
		}
	}
}
