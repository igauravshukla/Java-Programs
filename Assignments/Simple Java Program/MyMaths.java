/*

Define a class MyMaths having two private int data members. Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods additionIS, subtractionIs , divisionIs, and multiplicationIs. Create an object in main. Use command line arguments to pass a value to the object.

*/

class MyMaths
{
	private int m,n;
	MyMaths()
	{
	}
	MyMaths(int x,int y)
	{
		this.m = x;
		this.n = y;
	}
	void additionIs()
	{
		System.out.println("Addition = "+(m+n));
	}
	void subtractionIs()
	{
		System.out.println("Subtraction = "+(m-n));
	}
	void multiplicationIs()
	{
		System.out.println("Multiplication = "+(m*n));
	}
	void divisionIs()
	{
		System.out.println("Division = "+(m/n));
	}
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		MyMaths m = new MyMaths(a,b);
		m.additionIs();
		m.subtractionIs();
		m.multiplicationIs();
		m.divisionIs();
	}
}

/*

$ javac MyMaths.java

$ java MyMaths 3 4
Addition = 7
Subtraction = -1
Multiplication = 12
Division = 0

*/
