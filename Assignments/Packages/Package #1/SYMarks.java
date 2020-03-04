package SY;
public class SYMarks
{
	public int ct,mt,et;
	public SYMarks(int x,int y,int z)
	{
		ct = x;
		mt = y;
		et = z;
	}

	public void disp1()
	{
		System.out.println("Computer marks ="+ct);
		System.out.println("maths marks ="+mt);
		System.out.println("Electronics marks ="+et);
	}

	public int getct()
	{
	 	return (ct+mt+et);
	}
}
