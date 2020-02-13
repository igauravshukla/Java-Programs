package TY;

public class TYMarks
{
	public int tm,pm;
	public TYMarks(int x,int y)
	{
		tm = x;
		pm = y;
	}

	public  void disp2()
	{
		System.out.println("Theory marks = "+tm);
		System.out.println("Practical marks = "+pm);
	}

	public int gettotal()
	{
		return (tm+pm);
	}
}                                                                
