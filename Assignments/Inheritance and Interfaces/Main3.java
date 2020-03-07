/*

Create an abstract class Student with methods disp_roll_no_name and calc_total_marks. Derive three classes MCAStudent (marks of 3 subject as members), MCSStudentfrom(marks of 4 subject as members) and BCSStudent(marks of 5 subject as members) from it. Create set of n students in main. Calculate total and display roll number with total of each student.(Use method overriding).

*/

import java.io.*;
import java.util.*;

abstract class Student
{
	void disp_roll_no_name()
	{
		System.out.print("In abstract class");
	}
	abstract void calc_total_marks();
}

class MCAStudent extends Student
{
	int m1,m2,m3;
	int rno;
	String name;
	MCAStudent(int r,String n)
	{
		rno=r;
		name=n;
	}
	void disp_roll_no_name()
	{
		System.out.println("\nDisplaying detail:-");
		System.out.println("Roll no. = "+rno);
		System.out.println("Name = "+name);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects: ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void calc_total_marks()
	{
		System.out.println("Total = "+(m1+m2+m3));
	}
}

class MCSStudent extends Student
{
	int m1,m2,m3,m4;
	int rno;
	String name;
	MCSStudent(int r,String n)
	{
		rno=r;
		name=n;
	}
	void disp_roll_no_name()
	{
		System.out.println("\nDisplaying detail:-");
		System.out.println("Roll no. = "+rno);
		System.out.println("Name = "+name);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 4 subjects: ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
	}
	void calc_total_marks()
	{
		System.out.println("Total = "+(m1+m2+m3+m4));
	}
}

class BCSStudent extends Student
{
	int m1,m2,m3,m4,m5;
	int rno;
	String name;
	BCSStudent(int r,String n)
	{
		rno=r;
		name=n;
	}
	void disp_roll_no_name()
	{
		System.out.println("\nDisplaying detail:-");
		System.out.println("Roll no. = "+rno);
		System.out.println("Name = "+name);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects: ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
	}
	void calc_total_marks()
	{
		System.out.println("Total = "+(m1+m2+m3+m4+m5));
	}
}

class Main3
{
	public static void main(String[] args) throws IOException
	{
		int n,ch;
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n1.MCA Student\n2.MCS Student\n3.BCS Student\n4.No More Students\n");
			System.out.print("Enter the choice for class of student: ");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	System.out.println("You selected MCA Student");
						System.out.print("Number of MCA Students: ");
						n=Integer.parseInt(br.readLine());
						MCAStudent mca[]=new MCAStudent[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("\nEnter Roll Number: ");
							int rno=Integer.parseInt(br.readLine());
							System.out.print("Enter Student Name: ");
							String name = br.readLine();
							mca[i]=new MCAStudent(rno,name);
							mca[i].accept();
							mca[i].disp_roll_no_name();
							mca[i].calc_total_marks();
						}
						break;

				case 2:	System.out.println("You selected MCS Student");
						System.out.print("Number of MCS Students: ");
						n=Integer.parseInt(br.readLine());
						MCSStudent mcs[]=new MCSStudent[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("\nEnter Roll Number: ");
							int rno=Integer.parseInt(br.readLine());
							System.out.print("Enter Student Name: ");
							String name = br.readLine();
							mcs[i]=new MCSStudent(rno,name);
							mcs[i].accept();
							mcs[i].disp_roll_no_name();
							mcs[i].calc_total_marks();
						}
						break;

				case 3:	System.out.println("You selected BCS Student ");
						System.out.print("Number of BCS Students: ");
						n=Integer.parseInt(br.readLine());
						BCSStudent bcs[]=new BCSStudent[n];
						for(int i=0;i<n;i++)
						{
							System.out.print("\nEnter Roll Number: ");
							int rno=Integer.parseInt(br.readLine());
							System.out.print("Enter Student Name: ");
							String name = br.readLine();
							bcs[i]=new BCSStudent(rno,name);
							bcs[i].accept();
							bcs[i].disp_roll_no_name();
							bcs[i].calc_total_marks();
						}
						break;
				case 4:	System.out.println("Thank You...You are exiting...");
						System.exit(0);
				}
		}while(ch!=4);
	}
}

/*output

$ javac Main3.java
$ java Main3

1.MCA Student
2.MCS Student
3.BCS Student
4.No More Students

Enter the choice for class of student: 1
You selected MCA Student
Number of MCA Students: 2

Enter Roll Number: 1
Enter Student Name: Acid Bhai
Enter marks of 3 subjects: 
34 45 23

Displaying detail:-
Roll no. = 1
Name = Acid Bhai
Total = 102

Enter Roll Number: 2
Enter Student Name: Dabbu Bhai
Enter marks of 3 subjects: 
45 50 50

Displaying detail:-
Roll no. = 2
Name = Dabbu Bhai
Total = 145

1.MCA Student
2.MCS Student
3.BCS Student
4.No More Students

Enter the choice for class of student: 2
You selected MCS Student
Number of MCS Students: 2

Enter Roll Number: 1
Enter Student Name: Bhai Don
Enter marks of 4 subjects: 
45 50 50 34

Displaying detail:-
Roll no. = 1
Name = Bhai Don
Total = 179

Enter Roll Number: 2
Enter Student Name: Paddy Bhai 
Enter marks of 4 subjects: 
34 45 45 34

Displaying detail:-
Roll no. = 2
Name = Paddy Bhai
Total = 158

1.MCA Student
2.MCS Student
3.BCS Student
4.No More Students

Enter the choice for class of student: 3
You selected BCS Student 
Number of BCS Students: 1

Enter Roll Number: 1
Enter Student Name: Vaishnavi Biwde
Enter marks of 5 subjects: 
23 34 45 50 34

Displaying detail:-
Roll no. = 1
Name = Vaishnavi Biwde
Total = 186

1.MCA Student
2.MCS Student
3.BCS Student
4.No More Students

Enter the choice for class of student: 4
Thank You...You are exiting...

*/
