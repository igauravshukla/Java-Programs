/*

Define a class Staff with members id, name and salary. Define class TeachingStaff with members subjects[], experience and extends Staff also define class NonTeachingStaff with members department, shift and extends Staff. Now define Main class with members from TeachingStaff and NonTeachingStaff as per
requirement. Display details of all objects.

*/

import java.io.*;
import java.util.*;

class Staff
{
	int id;
	String name;
	double salary;

	Staff(int i,String n,double sal)
	{
		id = i;
		name = n;
		salary = sal;
	}
}

class TeachingStaff extends Staff
{
	String sub[];
	int experience;

	TeachingStaff(int id,String nm,double sal,String sub[],int e) throws IOException
	{
		super(id,nm,sal);
		this.sub = sub;
		experience = e;
	}

	void disp()
	{
		System.out.println("\nID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.print("Subjects : ");
		for(int i=0;i<sub.length;i++)
			System.out.print(sub[i]+", ");
		System.out.println("\nExperience : "+experience);
	}
}

class NonTeachingStaff extends Staff
{
	String dept,shift;

	NonTeachingStaff(int i,String n,double sal,String d,String sh)
	{
		super(i,n,sal);
		dept = d;
		shift = sh;
	}

	void disp()
	{
		System.out.print("\nID : "+id);
		System.out.print("Name : "+name);
		System.out.print("Salary : "+salary);
		System.out.print("Department : "+dept);
		System.out.print("Shift : "+shift);
	}
}

class Main4
{
	public static void main(String args[]) throws IOException
	{
		int ch,nots,nonts,i;
		do
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n1:Teaching Staffs\n2:Non-Teaching Staffs\n3:No More Staffs:\n");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	System.out.print("Number of Staffs: ");
						nots = Integer.parseInt(br.readLine());
						TeachingStaff ts[] = new TeachingStaff[nots];
						for(i=0;i<nots;i++)
						{
							System.out.print("\nEnter ID: ");
							int id = Integer.parseInt(br.readLine());
							System.out.print("Enter Name: ");
							String name = br.readLine();
							System.out.print("Enter Salary: ");
							double sal = Double.parseDouble(br.readLine());
							System.out.print("Enter the number of subjects: ");
							int nos = Integer.parseInt(br.readLine());
							String sub[] = new String[nos];
							System.out.println("Please enter the subjects:");
							for(int j=0;j<nos;j++)
								sub[j] = br.readLine();
							System.out.print("Enter experience: ");
							int e = Integer.parseInt(br.readLine());
							ts[i] = new TeachingStaff(id,name,sal,sub,e);
						}
						System.out.println("\nTeaching Staff Members are as follows:");
						for(i=0;i<nots;i++)
						{
							ts[i].disp();
						}
						break;

				case 2:	System.out.print("Number of Staffs: ");
						nonts = Integer.parseInt(br.readLine());
						NonTeachingStaff nts[] = new NonTeachingStaff[nonts];
						for(i=0;i<nonts;i++)
						{
							System.out.print("\nEnter ID: ");
							int id = Integer.parseInt(br.readLine());
							System.out.print("Enter Name: ");
							String name = br.readLine();
							System.out.print("Enter Salary: ");
							double sal = Double.parseDouble(br.readLine());
							System.out.print("Enter the Department Name: ");
							String dept = br.readLine();
							System.out.print("Enter Shift: ");
							String shif = br.readLine();
							nts[i] = new NonTeachingStaff(id,name,sal,dept,shif);
						}
						System.out.println("\nNon-Teaching Staff Members are as follows:");
						for(i=0;i<nonts;i++)
						{
							nts[i].disp();
						}
						break;

				case 3:	System.out.println("No more members..You are exiting.");
						System.exit(0);
						break;

				default : System.out.println("Invalid choice:");
						break;
			}
		}while(ch!=3);
	}
}

/*

$ javac Main4.java

$ java Main4

1:Teaching Staffs
2:Non-Teaching Staffs
3:No More Staffs:

Enter your choice: 1
Number of Staffs: 2

Enter ID: 101
Enter Name: Tushar Deshmukh
Enter Salary: 23000
Enter the number of subjects: 2
Please enter the subjects:
Python Programming
Data Mining & Data Warehousing
Enter experience: 12

Enter ID: 102
Enter Name: Dipita Dhande    
Enter Salary: 34000
Enter the number of subjects: 2
Please enter the subjects:
C Programming
Compiler Construction
Enter experience: 12

Teaching Staff Members are as follows:

ID : 101
Name : Tushar Deshmukh
Salary : 23000.0
Subjects : Python Programming, Data Mining & Data Warehousing
Experience : 12

ID : 102
Name : Dipita Dhande
Salary : 34000.0
Subjects : C Programming, Compiler Construction
Experience : 12

1:Teaching Staffs
2:Non-Teaching Staffs
3:No More Staffs:

Enter your choice: 2
Number of Staffs: 2

Enter ID: 1
Enter Name: Nawal Kaka
Enter Salary: 9000
Enter the Department Name: Computer Science
Enter Shift: Morning

Enter ID: 2
Enter Name: Nilesh Mama
Enter Salary: 10000
Enter the Department Name: Computer Science
Enter Shift: Evening

Non-Teaching Staff Members are as follows:

ID : 1
Name : Nawal Kaka
Salary : 9000
Department : Computer Science
Shift: Morning

ID: 2
Name: Nilesh Mama
Salary : 10000
Department : Computer Science
Shift : Morning

1:Teaching Staffs
2:Non-Teaching Staffs
3:No More Staffs:

Enter your choice: 3
No more members..You are exiting.

*/
