/*

Define a class “Student” which has members Roll_no, name. Define another class “CR” which has members class name and extends Student. Create an object of the CR class and make multiple clone of it. (Use the Cloneable interface). 

*/

import java.io.*;

class Student
{
	int rno;
	String name;

	Student(int r,String nm)
	{
		rno = r;
		name = nm;
	}
}

class CR extends Student implements Cloneable
{
	String cname;

	CR(int r,String nm,String c)
	{
		super(r,nm);
		cname = c;
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

class Main6
{
	public static void main(String args[]) throws IOException, CloneNotSupportedException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the number of clone objects to be made: ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("\nEnter roll no of student : ");
		int rno = Integer.parseInt(br.readLine());
		System.out.print("Enter name of student :  ");
		String nm = br.readLine();
		System.out.print("Enter class of student :  ");
		String cls = br.readLine();
		CR c = new CR(rno,nm,cls);
		CR cl[] = new CR[n];
		for(int i=0;i<n;i++)
		{
			cl[i] = c.clone();
			System.out.println(cl[i]);
		}
	}
}

/*

$ javac Main6.java
$ java Main6

Enter the number of clone objects to be made: 3

Enter roll no of student : 1
Enter name of student : Gaurav
Enter class of student : MCA
Roll no = 1 Name = Gaurav Class = MCA
Roll no = 1 Name = Gaurav Class = MCA
Roll no = 1 Name = Gaurav Class = MCA

*/