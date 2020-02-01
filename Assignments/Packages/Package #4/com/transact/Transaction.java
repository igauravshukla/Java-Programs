package JAVA.ASS3.SETB.com.transact;

import java.util.Scanner;

public class Transaction
{
	Scanner sc = new Scanner(System.in);

	public double credit(double amt)
	{
		System.out.print("Enter amount to be credited : ");
		double camt = sc.nextDouble();
		return amt += camt;
	}

	public double debit(double amt)
	{
		System.out.print("Enter amount to be debited : ");
		double damt = sc.nextDouble();
		while(true)
		{
			if((amt-damt)<1000)
			{
				System.out.println("Amount debit request failed...");
				return amt;
			}
			else
				return amt -= damt;
		}
	}
}
