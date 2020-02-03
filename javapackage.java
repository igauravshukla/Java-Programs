package MCA1;	
import java.util.*;
import java.io.*;

public class Mca1
{
	int sem1Total;
	int sem2Total; 
	public void acceptData() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter MCA1 SEM 1 Marks: ");
		sem1Total=sc.nextInt();
		System.out.print("Enter MCA1 SEM 2 Marks: ");
		sem2Total=sc.nextInt();
	}
	public int display()
	{
		return sem1Total+sem2Total;
	}
}


package MCA2;
import java.util.*;

public class Mca2
{
	int sem1Total;
	int sem2Total;
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter MCA2 SEM 1 Marks: ");
		sem1Total=sc.nextInt();
		System.out.print("Enter MCA2 SEM 2 Marks: ");
		sem2Total=sc.nextInt();
	}
	public int display()
	{
		return sem1Total+sem2Total;
	}
}


import MCA1.*;
import MCA2.*;
import java.util.Scanner;
import java.io.*;

public class StudentPackage
{
	int rno,t1,t2;
	String name;
	Mca1 m1= new Mca1();
		Mca2 m2= new Mca2();
	StudentPackage()
	{}
	StudentPackage(int r, String n)
	{
		rno=r;
		name=n;
//		this.t1=t1;
//		this.t2=t2;
	}
	public void display() 
	{
		System.out.println("Roll no is  :"+rno);
		System.out.println("Enter the Name :"+name);
		m1.acceptData();
		System.out.println("MCA1 Total :"+m1.display());
		m2.acceptData();
		System.out.println("MCA2 Total :"+m2.display());
	}
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		StudentPackage[] s=new StudentPackage[n];
//		Mca1 m1= new Mca1();
//		Mca2 m2= new Mca2();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Roll No: ");
			int rno=sc.nextInt();
			System.out.print("Enter Name: ");
			String name=sc.next();
//			m1.acceptData();
//			int t1=m1.display();
//			m2.acceptData();
//			int t2=m2.display();
			s[i]=new StudentPackage(rno,name);
			
		}
		System.out.println("Student's Information:");
		System.out.println("-------------------------------------");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}


*/
