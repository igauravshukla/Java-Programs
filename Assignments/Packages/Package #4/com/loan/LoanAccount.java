/*

Create a package named com. Define subpackages; transact: with class Transaction with static methods credit() and debit() loan: with class LoanAccount with method doTransaction() which calls Transaction class mehods. Create one LoanAccount object in main to perform operations on it by accepting command line arguments.

*/

import JAVA.ASS3.SETB.com.transact.*;
import java.util.Scanner;

class LoanAccount
{
	int id;
	String name;
	static double amount;
	LoanAccount(int id,String name,double amount)
	{
		this.id=id;
		this.name=name;
		this.amount=amount;
	}
	void doTransaction()
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n***********MENU***********");
			System.out.println("1. Credit Amount");
			System.out.println("2. Debit Amount");
			System.out.println("3. Request to End the Transaction");
			System.out.print("\nSelect The option: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:	amount=Transaction.credit(amount);
						System.out.println("Your current balance is "+amount);
						break;
				case 2:	amount=Transaction.debit(amount);
						System.out.println("Your current balance is "+amount);
						break;
				case 3:	System.out.println("Request Accepted to end the transaction");
						System.out.println("Your current balance is "+amount);
						break;
			}
		}while(ch!=3);
	}
	public static void main(String args[])
	{
		int id=Integer.parseInt(args[0]);
		double amount=Double.parseDouble(args[2]);
		LoanAccount la=new LoanAccount(id,args[1],amount);
		la.doTransaction();
	}
}

/*output

$ javac LoanAccount.java
$ java LoanAccount 1 GAURAV 10000

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 1
Enter amount to be credited : 3000
Your current balance is 13000.0

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 1
Enter amount to be credited : 2000
Your current balance is 15000.0

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 2
Enter amount to be debited : 16000
Amount debit request failed...
Your current balance is 15000.0

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 2
Enter amount to be debited : 15000
Amount debit request failed...
Your current balance is 15000.0

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 2
Enter amount to be debited : 10000
Your current balance is 5000.0

***********MENU***********
1. Credit Amount
2. Debit Amount
3. Request to End the Transaction

Select The option: 3
Request Accepted to end the transaction
Your current balance is 5000.0

*/
