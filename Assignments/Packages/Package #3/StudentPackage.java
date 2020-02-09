/*

Write a program to create a Package “MCA_I” which has a class McaIMarks (members – SemITotal, SemIITotal). Create another package MCA_II which has a class McaIIMarks (members – SemITotal, SemIITotal ). Create n objects of Student class (having rollNumber, name, McaIMarks and McaIIMarks). Add the marks of McaI and McaII calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and display the result of the student in proper format. 

*/

import MCA1.*;
import MCA2.*;

import java.util.Scanner;

class StudentPackage
{
	int rno,t1,t2;
	String name;
	Mca1 m1= new Mca1();
	Mca2 m2= new Mca2();

	StudentPackage()
	{}

	StudentPackage(int r, String n)
	{
		rno = r;
		name = n;
		m1.acceptData();
		m2.acceptData();
	}

	public void display()
	{
		System.out.println("\nRoll no is : "+rno);
		System.out.println("Enter the Name : "+name);
		int t1 = m1.display();
		int t2 = m2.display();
		System.out.println("MCA1 Total : "+t1);
		System.out.println("MCA2 Total : "+t2);
		System.out.println("MCA + MCA2 Total Marks : "+(t1+t2));
		if(((t1+t2)/2) >= 70)
			System.out.println("Grade = A");
		else if(((t1+t2)/2) >= 60)
			System.out.println("Grade = B");
		else if(((t1+t2)/2) >= 50)
			System.out.println("Grade = C");
		else if(((t1+t2)/2) >= 40)
			System.out.println("Grade = You're PASS. Kaate Pe Pass Hua Naa Bhoo.");
		else
			System.out.println("Grade = You're FAIL. Better Luck Next Time");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of students : ");
		int n = sc.nextInt();
		StudentPackage[] s = new StudentPackage[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter Roll No : ");
			int rno = sc.nextInt();
			System.out.print("Enter Name : ");
			String name = sc.next();
			s[i] = new StudentPackage(rno,name);
		}
		System.out.println("\nStudent's Information:");
		System.out.println("-------------------------------------");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}


/*

$ javac StudentPackage.java

$ java StudentPackage

Enter the number of students : 4

Enter Roll No : 1
Enter Name : BhaiDon
Enter MCA1 SEM 1 Marks : 12
Enter MCA1 SEM 2 Marks : 23
Enter MCA2 SEM 1 Marks : 34
Enter MCA2 SEM 2 Marks : 45

Enter Roll No : 2
Enter Name : 22Kar
Enter MCA1 SEM 1 Marks : 90
Enter MCA1 SEM 2 Marks : 89
Enter MCA2 SEM 1 Marks : 78
Enter MCA2 SEM 2 Marks : 67

Enter Roll No : 3
Enter Name : Aashu
Enter MCA1 SEM 1 Marks : 34
Enter MCA1 SEM 2 Marks : 45
Enter MCA2 SEM 1 Marks : 56
Enter MCA2 SEM 2 Marks : 67

Enter Roll No : 4
Enter Name : Dabbu
Enter MCA1 SEM 1 Marks : 67
Enter MCA1 SEM 2 Marks : 56
Enter MCA2 SEM 1 Marks : 78
Enter MCA2 SEM 2 Marks : 89

Enter Roll No : 5
Enter Name : Ramya
Enter MCA1 SEM 1 Marks : 76
Enter MCA1 SEM 2 Marks : 65
Enter MCA2 SEM 1 Marks : 87
Enter MCA2 SEM 2 Marks : 34

Enter Roll No : 6
Enter Name : Smita
Enter MCA1 SEM 1 Marks : 12
Enter MCA1 SEM 2 Marks : 12
Enter MCA2 SEM 1 Marks : 11
Enter MCA2 SEM 2 Marks : 06

Student's Information:
-------------------------------------

Roll no is : 1
Enter the Name : BhaiDon
MCA1 Total : 35
MCA2 Total : 79
MCA + MCA2 Total Marks : 114
Grade = C

Roll no is : 2
Enter the Name : 22Kar
MCA1 Total : 179
MCA2 Total : 145
MCA + MCA2 Total Marks : 324
Grade = A

Roll no is : 3
Enter the Name : Aashu
MCA1 Total : 79
MCA2 Total : 123
MCA + MCA2 Total Marks : 202
Grade = A

Roll no is : 4
Enter the Name : Dabbu
MCA1 Total : 123
MCA2 Total : 167
MCA + MCA2 Total Marks : 290
Grade = A

Roll no is : 5
Enter the Name : Ramya
MCA1 Total : 141
MCA2 Total : 121
MCA + MCA2 Total Marks : 262
Grade = A

Roll no is : 6
Enter the Name : Smita
MCA1 Total : 24
MCA2 Total : 17
MCA + MCA2 Total Marks : 41
Grade = You're FAIL. Better Luck Next Time 

*/

