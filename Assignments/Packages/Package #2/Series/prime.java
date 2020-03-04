package Series;
public class Prime
{
	int n;
	public Prime(int n)
	{
		this.n=n;
	}

	public static void calc(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is a prime number\n");
		else
			System.out.println(n+" is not a prime number\n");
	}
}
