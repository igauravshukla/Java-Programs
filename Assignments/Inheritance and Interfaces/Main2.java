

Skip to content
Using Gmail with screen readers

Conversations
9.99 GB (66%) of 15 GB used
Manage
Terms · Privacy · Program Policies
Last account activity: in 1 minute
Currently being used in 1 other location · Details

/*

Create an interface ? CreditCardInterface with methods to
viewCreditAmount,viewPin, changePin, useCard and payBalance. Create a class
Customer (name, card number, pin, creditAmount – initialized to 0). Implement
methods viewCreditAmount, viewPin, changePin and payBalance of the interface.
From Customer, create classes RegularCardHolder (maxCreditLimit) and
GoldCardHolder (String specialPrivileges) and define the remaining methods of the
interface Create n objects of the RegularCardHolder and GoldCardHolder classes and
write a menu driven program to perform the following actions:
• Use Card
• Pay Balance
• Change Pin

*/

import java.io.*;

interface CreditCard
{
	public void viewCreditAmount();
	public void viewPin();
	public void changePin();
	public void useCard();
	public void payBalance();
}

class Customer implements CreditCard
{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String name="";
	int ch=0,card_number=0, pin=0, creditAmount=0;

	public void accept() throws IOException
	{
		System.out.print("Enter customer name: ");
		name = br.readLine();
		System.out.print("Enter card number: ");
		card_number = Integer.parseInt(br.readLine());
		System.out.print("Enter pin number: ");
		pin = Integer.parseInt(br.readLine());
		System.out.print("Enter credit amount: ");
		creditAmount = Integer.parseInt(br.readLine());
	}

	public void show()
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Card Number : "+card_number);
		System.out.println("Credit Amount  : "+creditAmount);
		System.out.println("Card Pin : "+pin);
	}

	public void viewCreditAmount()
	{
		System.out.println("Credit Amount: "+creditAmount);
	}

	public void viewPin()
	{      
		System.out.println("Pin: "+pin);
	}

	public void changePin()
	{
		int old_pin,newpin=0,confirm_pin=0;
		try
		{
			System.out.print("Do you want to change pin? 1:TRUE 2:FALSE ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	do
						{
							System.out.print("Enter Old Pin number : ");
							old_pin = Integer.parseInt(br.readLine());
							if(old_pin == pin)
							{
								System.out.println("yes done");
								System.out.println("Enter New Pin Number : ");
								newpin = Integer.parseInt(br.readLine());
								System.out.println("Confirm your new pin : ");
								confirm_pin = Integer.parseInt(br.readLine());
							}
							else
								System.out.println("This is not your old pin!");
						}while(old_pin!=pin);
						if(newpin == confirm_pin)
						{
							pin = newpin;
							System.out.println("Pin Has Been Changed... ");
						}
						else
							System.out.println("Cannot Change Pin...Please Enter Correct pin number ");
						break;

				case 2:	System.out.println("Pin: "+pin);
						break;

				default:	System.out.println("Invalid Choice");
			}
		}
		catch(Exception ee){}
	}

	public void payBalance()
	{
		System.out.println("Your pay balance is : 20000");
	}

	public void useCard()
	{
		System.out.println("\n****USE CARD MENU****\nYou've choose to use your 	card.Now you can perform following actions:\n\n1)View Credit Amount\t2)View Pin\t3)Change Pin\t4)Exit\nEnter your choice:");
	}
}

class RegularCardHolder extends Customer
{
	double maxCreditLimit=50000.00;
	void regularshow()
	{
		super.show();
		System.out.println("Max Credit Limit: "+maxCreditLimit);
		System.out.println();
	}
}

class GoldCardHolder extends Customer
{
	String specialPrivileges = "Shop across many countries";
	void goldshow()
	{
		super.show();
		System.out.println("Special Privileges:  "+specialPrivileges);
		System.out.println();
	}
}

public class main2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n,ch=0,ch1=0,ch2=0,i;
		System.out.print("Which user are you \n1)Regular Card Holder\t2)Gold Card Holder\t3)No User\nEnter the user option: ");
		ch1 = Integer.parseInt(br.readLine());  
		System.out.print("How many objects you want to create? ");
		n = Integer.parseInt(br.readLine());
		switch(ch1)
		{
			case 1:	RegularCardHolder[] rch= new  RegularCardHolder[n];
					for(i=0;i<n;i++)
					{
						rch[i]=new RegularCardHolder();
						rch[i].accept();
					}
					System.out.println("\nREGULAR CARD HOLDERS:-\n");
					for(i=0;i<n;i++)
					{
						rch[i].regularshow();
					}
					do
					{
						System.out.print("\n\n****MAIN MENU****\n1)Use Card\t2)Pay Balance\t3)Change Pin\t4)Exit\nEnter your choice: ");
						ch = Integer.parseInt(br.readLine());  
						switch(ch)
						{
							case 1:	try
									{
										do
										{
											System.out.print("\n****USE CARD MENU****\nYou've choose to use the card.Now you can perform following actions:\n\n1)View Credit Amount\t2)View Pin\t3)Change Pin\t4)Exit\nEnter your choice: ");
											ch2=Integer.parseInt(br.readLine());
											switch(ch2)
											{
												case 1:	for(i=0;i<n;i++)
															rch[i].viewCreditAmount();
														break;
												case 2:	for(i=0;i<n;i++)
														{
															rch[i].viewPin();
														}
														break;
												case 3:	for(i=0;i<n;i++)
														{
															rch[i].changePin();
														}
														break;
												case 4:	System.out.println("YOU'VE EXITED FROM USE CARD MENU!!!");
														break;
											}
										}while(ch2!=4);
									}
									catch(Exception ee){}
									break;

							case 2:	try
									{
										for(i=0;i<1;i++)
										{
											rch[i].payBalance();
										}
									}
									catch(Exception ee){}
									break;

							case 3:	for(i=0;i<n;i++)
									{
										rch[i].changePin();
									}  
									break;

							case 4:	System.out.println("YOU'VE EXITED FROM MAIN MENU!!!");
									break;
						}
					}while(ch!=4);
					break;

			case 2:	GoldCardHolder[] gch = new GoldCardHolder[n];
					for(i=0;i<n;i++)
					{      
						gch[i]=new GoldCardHolder();
						gch[i].accept();        
					}
					System.out.println("\nGOLD CARD HOLDERS:-\n");
					for(i=0;i<n;i++)
					{
						gch[i].goldshow();
					}
					do
					{
						System.out.print("\n\n1)Use Card\t2)Pay Balance\t3)Change Pin\t4)Exit\nEnter your choice: ");
						ch =Integer.parseInt(br.readLine());  
						switch(ch)
						{
							case 1:	do
									{
										try
										{
											System.out.print("\n****USE CARD MENU****\nYou've choose to use your the card.Now you can perform following actions:\n\n1)View Credit Amount\t2)View Pin\t3)Change Pin\t4)Exit\nEnter your choice: ");
											ch2=Integer.parseInt(br.readLine());
											switch(ch2)
											{
												case 1:	for(i=0;i<n;i++)
														{
															gch[i].viewCreditAmount();
														}
														break;
												case 2:	for(i=0;i<n;i++)
														{
															gch[i].viewPin();
														}
														break;
												case 3:	for(i=0;i<n;i++)
														{
															gch[i].changePin();
														}
														break;
												case 4:	System.out.println("YOU'VE EXITED FROM USE CARD MENU!!!");
														break;
											}
										}
										catch(Exception ee){}
									}while(ch2!=4);
									break;
							case 2:	try
										{
											for(i=0;i<1;i++)
											{
												gch[i].payBalance();
											}
										}
										catch(Exception ee){}
										break;
							case 3:	for(i=0;i<n;i++)
									{
										gch[i].changePin();
									}  
									break;
							case 4:	System.out.println("YOU'VE EXITED FROM MAIN MENU!!!");
									break;
						}
					}while(ch!=4);      
					break;
			case 3:	System.exit(0);
					break;
		}
	}
}

/*

$ javac main2.java
$ java main2

Which user are you 
1)Regular Card Holder	2)Gold Card Holder	3)No User
Enter the user option: 1
How many objects you want to create? 2
Enter customer name: Anni
Enter card number: 123456    
Enter pin number: 1234
Enter credit amount: 2000
Enter customer name: Derek
Enter card number: 654321
Enter pin number: 4321
Enter credit amount: 3000

REGULAR CARD HOLDERS:-

Customer Name : Anni
Card Number : 123456
Credit Amount  : 2000
Card Pin : 1234
Max Credit Limit: 50000.0

Customer Name : Derek
Card Number : 654321
Credit Amount  : 3000
Card Pin : 4321
Max Credit Limit: 50000.0


****MAIN MENU****
1)Use Card	2)Pay Balance	3)Change Pin	4)Exit
Enter your choice: 1

****USE CARD MENU****
You've choose to use the card.Now you can perform following actions:

1)View Credit Amount	2)View Pin	3)Change Pin	4)Exit
Enter your choice: 1
Credit Amount: 2000
Credit Amount: 3000

****USE CARD MENU****
You've choose to use the card.Now you can perform following actions:

1)View Credit Amount	2)View Pin	3)Change Pin	4)Exit
Enter your choice: 2
Pin: 1234
Pin: 4321

****USE CARD MENU****
You've choose to use the card.Now you can perform following actions:

1)View Credit Amount	2)View Pin	3)Change Pin	4)Exit
Enter your choice: 3
Do you want to change pin? 1:TRUE 2:FALSE 1
Enter Old Pin number : 1234
yes done
Enter New Pin Number : 
5678
Confirm your new pin : 
5678
Pin Has Been Changed... 
Do you want to change pin? 1:TRUE 2:FALSE 2
Pin: 4321

****USE CARD MENU****
You've choose to use the card.Now you can perform following actions:

1)View Credit Amount	2)View Pin	3)Change Pin	4)Exit
Enter your choice: 4
YOU'VE EXITED FROM USE CARD MENU!!!


****MAIN MENU****
1)Use Card	2)Pay Balance	3)Change Pin	4)Exit
Enter your choice: 2
Your pay balance is : 20000

****MAIN MENU****
1)Use Card	2)Pay Balance	3)Change Pin	4)Exit
Enter your choice: 3
Do you want to change pin? 1:TRUE 2:FALSE 2
Pin: 5678
Do you want to change pin? 1:TRUE 2:FALSE 2
Pin: 4321


****MAIN MENU****
1)Use Card	2)Pay Balance	3)Change Pin	4)Exit
Enter your choice: 4
YOU'VE EXITED FROM MAIN MENU!!!

*/
