/*

Write a Java program to create a super class Vehicle having members Company and price. Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the information in appropriate form. While taking data, ask the user about the type of vehicle first.

*/

import java.util.*;

class Vehicle
{
	String comp;
	Double price;
	Vehicle(String c,double p)
	{
		this.comp = c;
		this.price = p;
	}
	void disp1()
	{
		System.out.println("\nCompany name is = "+comp);
		System.out.println("Vehicle price is = "+price);		
	}
}

class LMV extends Vehicle
{
	int mil;
	LMV(String c,double p,int m)
	{
		super(c,p);
		mil=m;
	}
	void disp2()
	{
	    System.out.println("Vehicle milage is = "+mil);
	}
}

class HMV extends Vehicle
{
        int cap;
        HMV(String c,double p,int cp)
        {
                super(c,p);
                cap=cp;
        }
        void disp3()
        {
            System.out.println("Vehicle capacity is = "+cap);
        }
}

class Main10
{
	public static void main(String args[])
	{
		int n,ch;
		String comp;
		double price;
		int mil,cap;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1.Light motor vehicle\n2.Heavy motor vehicle\n3.Exit");
			System.out.print("\nEnter the type of vehicle: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:	System.out.print("\nHow many vehicles?? : ");
						n = sc.nextInt();
						LMV L[] = new LMV[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("\nEnter the company name : ");
							comp = sc.next();
							System.out.print("Enter the price : ");
                                 	price = sc.nextDouble();
							System.out.print("Enter the milage : ");
							mil = sc.nextInt();
							L[i] = new LMV(comp,price,mil);
						}
						System.out.println("\nDetails are as follows");
						for(int i=0;i<n;i++)
						{
							L[i].disp1();
							L[i].disp2();
						}
						break;
				 case 2:	System.out.print("\nHow many vehicles?? : ");
						n = sc.nextInt();
						HMV H[] = new HMV[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("\nEnter the company name : ");
							comp = sc.next();
							System.out.print("Enter the price : ");
							price = sc.nextDouble();
							System.out.print("Enter the milage : ");
							mil = sc.nextInt();
							H[i] = new HMV(comp,price,mil);
						}
						System.out.println("Details are as follows:-");
						for(int i=0;i<n;i++)
						{
							H[i].disp1();
							H[i].disp3();
						}
						break;
				case 3:	System.exit(0);
			}
		}while(ch!=3);
	}
}

/*output

$ javac Main10.java
$ java Main10

1.Light motor vehicle
2.Heavy motor vehicle
3.Exit

Enter the type of vehicle: 1

How many vehicles?? : 2

Enter the company name : Mahindra
Enter the price : 34000
Enter the milage : 40

Enter the company name : Toyota
Enter the price : 33000
Enter the milage : 34

Details are as follows

company name is = Mahindra
vehicle price is = 34000.0
vehicle milage is = 40

company name is = Toyota
vehicle price is = 33000.0
vehicle milage is = 34

1.Light motor vehicle
2.Heavy motor vehicle
3.Exit

Enter the type of vehicle: 2

How many vehicles?? : 1

Enter the company name : Mahindra
Enter the price : 56000
Enter the milage : 50

Details are as follows:-

company name is = Mahindra
vehicle price is = 56000.0
vehicle capacity is = 50

1.Light motor vehicle
2.Heavy motor vehicle
3.Exit

Enter the type of vehicle: 3

*/