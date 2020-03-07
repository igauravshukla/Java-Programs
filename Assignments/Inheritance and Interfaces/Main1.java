/*

Define a class Vehicle (company,price). Define a parameterized constructor for it. Define subclasses of this class -- Transport (validity_no, period) and -- Private (owner_name, owner_address). Define appropriate constructors. Create n objects which could be of either Transport or Private class by asking the user‘s choice. Display details of all -- Private objects and all -- Transport objects. 

*/

import java.io.*;

class Vehicle
{
	String company;
	double price;
	Vehicle(String c,double p)
	{
		this.company=c;
		this.price=p;
	}
	void display1()
	{
		System.out.println("Company name = "+company);
		System.out.println("Vehicle price = "+price);		
	}
}
class Transport extends Vehicle
{
	int val_no,period;
	Transport(String c,double p,int vn,int per)
	{
		super(c,p);
		val_no=vn;
		period=per;
	}
	void d2()
	{
		System.out.println("Validity No. = "+val_no);
		System.out.println("Period = "+period);
	}
}
class Private extends Vehicle
{
	String oname,oaddr;
	Private(String c,double p,String name,String addr)
	{
		super(c,p);
		oname=name;
		oaddr=addr;
	}
	void d3()
	{
		System.out.println("Owner Name = "+oname);
		System.out.println("Owner Address = "+oaddr);
	}
}

class Main1
{
	public static void main(String args[]) throws IOException
	{
		int n,ch;
		String comp,oname,oaddr;
		double price;
		int vno,period;
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n1.Transport Vehicle\n2.Private Vehicle\n3.Exit\n");
			System.out.print("Enter the type of vehicle: ");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	System.out.print("Number of vehicles: ");
						n=Integer.parseInt(br.readLine());
						Transport T[]=new Transport[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("Enter the company name : ");
							comp=br.readLine();
							System.out.print("Enter the Price: ");
							price=Double.parseDouble(br.readLine());
							System.out.print("Enter vaidity number: ");
							vno=Integer.parseInt(br.readLine());
							System.out.print("Enter period: ");
							period=Integer.parseInt(br.readLine());
							T[i]=new Transport(comp,price,vno,period);						
						}
						System.out.println("Details are \n");
						for(int i=0;i<n;i++)
						{
							T[i].display1();
							T[i].d2();
						}
						break;
				 case 2:	System.out.print("Number of vehicles: ");
						n=Integer.parseInt(br.readLine());
						Private P[]=new Private[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("Enter the company name : ");
							comp=br.readLine();
							System.out.print("Enter the Price: ");
							price=Double.parseDouble(br.readLine());
							System.out.print("Enter owner name: ");
							oname=br.readLine();
							System.out.print("Enter owner address: ");
							oaddr=br.readLine();
							P[i]=new Private(comp,price,oname,oaddr);						
						}
						System.out.print("\nDetails are:\n");
						for(int i=0;i<n;i++)
						{
							P[i].d1();
							P[i].d3();
						}
						break;
				case 3:System.exit(0);
				}
		}while(ch!=3);
	}
}

/*output

$ javac Main1.java
$ java Main1

1.Transport Vehicle
2.Private Vehicle
3.Exit

Enter the type of vehicle: 1
Number of vehicles: 2   
Enter the company name : Truck No. 1
Enter the Price: 23000
Enter vaidity number: 09876
Enter period: 3
Enter the company name : Truck No. 2
Enter the Price: 12000
Enter vaidity number: 876544
Enter period: 2
Details are 

Company name = Truck No. 1
Vehicle price = 23000.0
Validity No. = 9876
Period = 3
Company name = Truck No. 2
Vehicle price = 12000.0
Validity No. = 876544
Period = 2

1.Transport Vehicle
2.Private Vehicle
3.Exit

Enter the type of vehicle: 2
Number of vehicles: 2
Enter the company name : Maruti
Enter the Price: 34000
Enter owner name: Gaurav Shukla
Enter owner address: Jail Road, Nashik Road   
Enter the company name : Audi
Enter the Price: 89000
Enter owner name: Bhai Don Patil    
Enter owner address: Talegaon Rohi, Nashik

Details are:
Company name = Maruti
Vehicle price = 34000.0
Owner Name = Gaurav Shukla
Owner Address = Jail Road, Nashik Road
Company name = Audi
Vehicle price = 89000.0
Owner Name = Bhai Don Patil
Owner Address = Talegaon Rohi, Nashik

1.Transport Vehicle
2.Private Vehicle
3.Exit

Enter the type of vehicle: 3

*/
