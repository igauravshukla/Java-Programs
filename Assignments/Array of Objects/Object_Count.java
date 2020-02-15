/*

Define a Student class (roll number, name, percentage). Define a default and parameterized constructor. Keep a count of objects created. Create objects using parameterized constructor and
display the object count after each object is created. (Use static member and method). Also display the contents of each object.

*/

import java.io.*;
import java.util.*;

class Student
{
	static int count;
	int rno;
	String nm;
	float perc;

	Student()
	{}
	
	Student(int r, String n, float p)
	{
		rno = r;
		nm = n;
		perc = p;
		count++;
		System.out.println("Total Number of students are :- "+count);	
	}
	
	void display()
	{
		System.out.println("\nRoll No : "+rno);
		System.out.println("Name : "+nm);
		System.out.println("Percentage : "+perc+"\n");
	}
	
	public static void sortStud(stud s[],int n1)
	{
		stud temp;
		for(int i=0; i<n1 ; i++)
		{
			for(int j=i+1 ; j<n1 ; j++)
			{
				if(s[i].perc > s[j].perc)
				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("After sorting Student's percentage are : ");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		for(int i=0 ; i<n ; i++)
		{
			System.out.print("\nEnter The roll-no : ");
			int r1 = sc.nextInt();
			System.out.print("Enter The name : ");
			String n1 = sc.next();
			System.out.print("Enter The percentage : ");
			float p1 = sc.nextFloat();
			s[i] = new Student(r1,n1,p1);
			System.out.println("");
		}
		sortStud(s,n);
		for(int i = 0 ; i < n ; i++)
		{
			s[i].display();
		}
	}
}

/*

$ javac Student.java

$ java Student

Enter the number of students : 3

Enter The roll-no :- 1
Enter The name :- BhaiDon
Enter The percentage :- 70
Total Number of students are :- 1

Enter The roll-no :- 2
Enter The name :- 22Kar
Enter The percentage :- 60
Total Number of students are :- 2

Enter The roll-no :- 3
Enter The name :- Aashu
Enter The percentage :- 60
Total Number of students are :- 3

After sorting stud percentage are :

Roll No : 2
Name : 22Kar
Percentage : 60.0


Roll No : 3
Name : Aashu
Percentage : 60.0


Roll No : 1
Name : BhaiDon
Percentage : 70.0

*/
