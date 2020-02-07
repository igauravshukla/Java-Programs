/*

Define an abstract class “Staff” with members name and address. Define two sub-classes of this class – “FullTimeStaff” (department, salary) and “PartTimeStaff” (number-of-hours, rate-perhour). Define appropriate constructors. Create n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user’s choice. Display details of all “FullTimeStaff” objects and all “PartTimeStaff” objects.

*/

import java.util.*;

abstract class Staff
{
	String name,addr;

	Staff(String n,String a)
	{
		name = n;
		addr = a;
	}

	abstract void disp();
}

class FullTimeStaff extends Staff
{
	String dept;
	double sal;

	FullTimeStaff(String n,String a,String d,double s)
	{
		super(n,a);
		dept = d;
		sal = s;
	}

	void disp()
	{
		System.out.println("\nName : "+name+"\n"+"Address : "+addr+"\n"+"Salary : "+sal);
	}
}

class PartTimeStaff extends Staff
{
	int hr;
	double rate;

	PartTimeStaff(String n,String a,int h,double r)
	{
		super(n,a);
		hr = h;
		rate = r;
	}

	void disp()
	{
		System.out.println("\nName : "+name+"\n"+"Address : "+addr+"\n"+"Hours worked : "+hr+"\n"+"Rate : "+rate);
	}
}

class Main11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String n,d,a;
		double s,r;
		int h,n1;
		String type;

		System.out.print("\nHow many members : ");
		n1 = sc.nextInt();
		Staff s1[] = new Staff[n1];
		for(int i=0;i<n1;i++)
		{
			System.out.print("\nEnter name : ");
			n = sc.next();
			System.out.print("Enter addr : ");
			a = sc.next();
			System.out.print("Enter type(F-FullTime P-PartTime) : ");
			type = sc.next();
			if(type.equalsIgnoreCase("F"))
			{
				System.out.print("Enter dept : ");
				d = sc.next();
				System.out.print("Enter Salary  : ");
				s = sc.nextDouble();
				s1[i] = new FullTimeStaff(n,a,d,s);
			}
			else
			{
				System.out.print("Enter no.of hrs : ");
				h = sc.nextInt();
				System.out.print("Enter rate : ");
				r = sc.nextDouble();
				s1[i] = new PartTimeStaff(n,a,h,r);
			}
		}
		System.out.print("\nDetails of staff:-");
		for(int i=0;i<n1;i++)
			s1[i].disp();
	}
}

/*output

$ javac Main11.java
$ java Main11

How many members : 2

Enter name : Gaurav
Enter addr : Nashik
Enter type(F-FullTime P-PartTime) : F
Enter dept : CS
Enter Salary  : 23000

Enter name : Tushar
Enter addr : Talegaon
Enter type(F-FullTime P-PartTime) : p
Enter no.of hrs : 20
Enter rate : 340

Details of staff:-
Name : Gaurav
Address : Nashik
Salary : 23000.0

Name : Tushar
Address : Talegaon
Hours worked : 20
Rate : 340.0

*/