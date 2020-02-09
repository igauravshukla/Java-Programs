/*

Create a package named Series having three different classes to print series:
a. Prime numbers 	b. Fibonacci series 	c. Squares of numbers
Write a program to generate ‘n’ terms of the above series.

*/

import java.util.*;

import Series.Square;
import Series.Prime;
import Series.Fibonacci;

public class Nseries
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n = sc.nextInt();
		Square S = new Square(n);
		S.calc(n);
		Prime P = new Prime(n);
		P.calc(n);
		Fibonacci F = new Fibonacci(n);
		F.calc(n);
	}
}

/*

$ javac Nseries.java

$ java Nseries

Enter the number : 5

Square of 1 is 1
Square of 2 is 4
Square of 3 is 9
Square of 4 is 16
Square of 5 is 25

5 is a prime number

Fibonacci Series :
1 1 2 3 5

*/