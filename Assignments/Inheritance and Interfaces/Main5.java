/*

Define a class “Student” which has members Roll_no, name. Define another class “CR” which has members class name and extends Student. Create n objects of the CR class and clone them. (Use the Cloneable interface). 

*/

import java.io.*;

class Student
{
	int rno;
	String name;
	Student(int r,String nm)
	{
		rno=r;
		name=nm;
	}
}

class CR extends Student implements Cloneable
{
	String cname;
	CR(int r,String nm,String c)
	{
		super(r,nm);
		cname=c;
	}
	public CR clone() throws CloneNotSupportedException
	{
		CR C = (CR)super.clone();
		return C;
	}
	public String toString()
	{
		return "Roll no = "+rno+" Name = "+name+" Class = "+cname;
	}
}

class Main5
{
	public static void main(String args[]) throws IOException, CloneNotSupportedException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the number of students: ");
		int n = Integer.parseInt(br.readLine());
		CR c[] = new CR[n];
		CR cl[] = new CR[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter roll no of student:- ");
			int rno = Integer.parseInt(br.readLine());
			System.out.print("Enter name of student:- ");
			String nm = br.readLine();
			System.out.print("Enter class of student:- ");
			String cls = br.readLine();
			c[i] = new CR(rno,nm,cls);
			cl[i]=c[i].clone();
			System.out.println(c[i]);
			System.out.println(cl[i]);
		}
	}
}

/*

$ javac main5.java
$ java main5

Enter the number of students: 3

Enter roll no of student:- 1
Enter name of student:- Bhai Don Patil
Enter class of student:- MCS
Roll no = 1 Name = Bhai Don Patil Class = MCS
Roll no = 1 Name = Bhai Don Patil Class = MCS

Enter roll no of student:- 2   
Enter name of student:- 22KAR
Enter class of student:- MPSC
Roll no = 2 Name = 22KAR Class = MPSC
Roll no = 2 Name = 22KAR Class = MPSC

Enter roll no of student:- 3
Enter name of student:- Aashu Da
Enter class of student:- UPSC
Roll no = 3 Name = Aashu Da Class = UPSC
Roll no = 3 Name = Aashu Da Class = UPSC

*/
