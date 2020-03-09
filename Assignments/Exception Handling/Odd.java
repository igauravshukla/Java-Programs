/*

A program accepts two numbers as command line arguments. It displays all odd numbers in between. Using assertions validate the input for the following criteria:
Both should be positive integers. The second should be larger than the first.

*/

public class Odd
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		assert a>0 : "1st number is zero or negative\n";
		assert b>0 : "2nd number is zero or negative\n";
		assert b>a : "2nd number is greater than 1st number\n";
		System.out.print("The odd numbers between "+a+" and "+b+" are as follows: ");
		if(a%2==0)
			a++;
		for(int i=a;i<=b;i+=2)
			System.out.print(i+" ");
		System.out.println();
	}
}

/*output

$ javac Odd.java

$ java -ea Odd 23 67
The odd numbers between 23 and 67 are as follows: 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 

$ java -ea Odd 67 23
Exception in thread "main" java.lang.AssertionError: 2nd number is greater than 1st number at Odd.main(Odd.java:17)

$ java -ea Odd -23 45
Exception in thread "main" java.lang.AssertionError: 1st number is zero or negative at Odd.main(Odd.java:15)

$ java -ea Odd 23 -45
Exception in thread "main" java.lang.AssertionError: 2nd number is zero or negative at Odd.main(Odd.java:16)

*/
