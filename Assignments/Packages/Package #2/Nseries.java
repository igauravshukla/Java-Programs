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
		System.out.println("Enter the number\n");
		int n = sc.nextInt();
		Square S = new Square(n);
		S.calc(n);
		Prime P = new Prime(n);
		P.calc(n);
		Fibonacci F = new Fibonacci(n);
		F.calc(n);
	}
}




