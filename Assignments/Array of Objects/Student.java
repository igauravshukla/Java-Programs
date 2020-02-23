/*

Define a class Student (name, roll_no, class and percentage). Create an array of n Student objects. Define a static method "sortStudent"ùwhich sorts the array on the basis of
percentage. Display the student details in sorted order.

*/

import java.io.*;
import java.util.*;

class Student
{
	int rno;
	String nm,clas;
	float per;

	Student()
	{}

	Student(int r, String n, String c,float p)
	{
		rno = r;
		nm = n;
		clas = c;
		per = p;
	}

	void display()
	{
		System.out.println("\nRoll No : "+rno);
		System.out.println("Name : "+nm);
		System.out.println("Class : "+clas);
		System.out.println("Percentage : "+per);
	}

	public static void sortStud(Student s[],int n)
	{
		int i,j;
		Student temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i].per>s[j].per)
				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter roll no of student : ");
			int rno = sc.nextInt();
			System.out.print("Enter name of student : ");
			String nm = sc.next();
			System.out.print("Enter class of student : ");
			String cls = sc.next();
			System.out.print("Enter percentage of student : ");
			float per = sc.nextFloat();
			s[i] = new Student(rno,nm,cls,per);
			System.out.println("");
		}
		System.out.println("Student's Information:");
		System.out.println("-------------------------------------");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
		sortStud(s,n);
		System.out.println("After sorting percentage are :- ");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}

/*

$ javac Student.java

$ java Student
Enter the number of students : 6

Enter roll no of student : 1
Enter name of student : BhaiDon
Enter class of student : CAFY    
Enter percentage of student : 88

Enter roll no of student : 2
Enter name of student : 22Kar
Enter class of student : CAFY
Enter percentage of student : 78

Enter roll no of student : 3
Enter name of student : Aashu
Enter class of student : CAFY
Enter percentage of student : 90

Enter roll no of student : 4
Enter name of student : Dabbu
Enter class of student : CAFY
Enter percentage of student : 100

Enter roll no of student : 5
Enter name of student : Ramya
Enter class of student : CAFY
Enter percentage of student : 89

Enter roll no of student : 6
Enter name of student : Smita
Enter class of student : Third_Class
Enter percentage of student : 35

Student's Information:
-------------------------------------

Roll No : 1
Name : BhaiDon
Class : CAFY
Percentage : 88.0

Roll No : 2
Name : 22Kar
Class : CAFY
Percentage : 78.0

Roll No : 3
Name : Aashu
Class : CAFY
Percentage : 90.0

Roll No : 4
Name : Dabbu
Class : CAFY
Percentage : 100.0

Roll No : 5
Name : Ramya
Class : CAFY
Percentage : 89.0

Roll No : 6
Name : Smita
Class : Third_Class
Percentage : 35.0

After sorting stud percentage are :-
 
Roll No : 6
Name : Smita
Class : Third_Class
Percentage : 35.0

Roll No : 2
Name : 22Kar
Class : CAFY
Percentage : 78.0

Roll No : 1
Name : BhaiDon
Class : CAFY
Percentage : 88.0

Roll No : 5
Name : Ramya
Class : CAFY
Percentage : 89.0

Roll No : 3
Name : Aashu
Class : CAFY
Percentage : 90.0

Roll No : 4
Name : Dabbu
Class : CAFY
Percentage : 100.0

*/
