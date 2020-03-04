/*

Write a Java program to create a Package “SY” which has a class SYMarks (members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class
TYMarks (members – Theory, Practicals). Create n objects of Student class (having rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate
the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and display the result of the student in proper format.

*/

import SY.SYMarks;
import TY.TYMarks;
import java.io.*;
import java.util.*;

class Stud
{
	int rno,tot;
	String name,grade;
	SYMarks sy;
	TYMarks ty;
	float avg;
	Stud(int r,String n,SYMarks s,TYMarks t)
	{
		rno = r;
		name = n;
		sy = s;
		ty = t;
	}

	void cal()
	{
		tot = sy.getct()+ty.gettotal();
		avg = tot/5.0f;
	}

	void disp()
	{
		System.out.println(name+" "+rno+" "+tot+" "+grade);
	}
}

class StudP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many students");
		int n = sc.nextInt();
		Stud S[] = new Stud[n];
		int ct,et,mt,th,pr,rno;
		String name;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the roll no name of student: ");
			rno = sc.nextInt();
			name = sc.next();
			System.out.println("Enter SY Marks(Electronics,Computer,Maths)");
			et = sc.nextInt();
			ct = sc.nextInt();
			mt = sc.nextInt();
			SYMarks sm = new SYMarks(et,ct,mt);
			sm.disp1();
			System.out.println("Enter TY Marks(Theory,Practical)");
			th = sc.nextInt();
			pr = sc.nextInt();
			TYMarks tm = new TYMarks(th,pr);
			tm.disp2();
			S[i] = new Stud(rno,name,sm,tm);
		}
		for(int i=0;i<n;i++)
		{
			S[i].cal();
			if(S[i].avg>=70)
				S[i].grade = "A";
			else if(S[i].avg>=60)
				S[i].grade = "B";
			else if(S[i].avg>=50)
				S[i].grade = "C";
			else if(S[i].avg>=40)
				S[i].grade = "Pass";
			else
				S[i].grade = "Fail";
			S[i].disp();
		}
	}
}
