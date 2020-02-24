/*

Define a class MyNumber having one private int data member. Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line arguments to pass a value to the object.

*/

class MyNumber
{
	private int no;
	MyNumber()
	{
		no = 0;
	}
	MyNumber(int no)
	{
		this.no = no;
     	}
	void ispositive()
	{
		if(no > 0)
			System.out.print("Given Number is positive\n");
	}
	void isnegative()
	{
		if(no < 0)
			System.out.print("Given Number is negative\n");
	}
	void iseven()
	{
		if(no%2 == 0)
			System.out.print("Given Number is Even\n");
	}
	void isodd()
	{
		if(no%2 != 0)
			System.out.print("Given Number is Odd\n");
	}
	void iszero()
	{
		if(no == 0)
			System.out.print("Given Number is zero\n");
	}
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		MyNumber n1 = new MyNumber(n);
		n1.ispositive();
		n1.isnegative();
		n1.iseven();
		n1.isodd();
		n1.iszero();
	}
}

/*

$ javac MyNumber.java

$ java MyNumber
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at MyNumber.main(MyNumber.java:45)

$ java MyNumber 2
Given Number is positive
Given Number is Even

$ java MyNumber 1
Given Number is positive
Given Number is Odd

$ java MyNumber 0
Given Number is Even
Given Number is zero

$ java MyNumber -3
Given Number is negative
Given Number is Odd

$ java MyNumber -4
Given Number is negative
Given Number is Even

*/