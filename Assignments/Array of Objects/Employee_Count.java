/*

Create a class MyDate with day, month and year as members. Write appropriate member functions. Create another class Employee_Count, which has id, name, date of birth, date of joining and salary as members (use MyDate for date fields). Write appropriate constructor for the Employee which assigns values to the members. Accept the details as command line arguments and create a Employee object using the arguments and display the object count after each object is created. (Use static member and method). Also display the payslip details in a proper format.

*/

class MyDate
{
	int dd,mm,yy;
	MyDate()
	{}
	MyDate(int dd,int mm,int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
}

class Employee_Count
{
	int id;
	String name,position;
	double salary;
	MyDate dob,doj;
	static int objects;

	static
	{
		objects += 1;
	}

	Employee_Count()
	{}

	Employee_Count(int id,String nm,String pos,double sal,int d1,int m1,int y1,int d2,int m2,int y2)
	{
		this.id = id;
		name = nm;
		position = pos;
		salary = sal;
		dob = new MyDate(d1,m1,y1);
		doj = new MyDate(d2,m2,y2);
	}

	public String toString()
	{
		return("ID : "+id+"\nName : "+name+"\nPosition : "+position+"\nSalary : "+salary);
	}

	void display()
	{
		String str=String.format("Date of Birth : %d/%02d/%d\nDate of Joining : %d/%02d/%d",dob.dd,dob.mm,dob.yy,doj.dd,doj.mm,doj.yy);
		System.out.println(str);
	}

	public static void main(String args[])
	{
		int id=Integer.parseInt(args[0]);
		double salary=Double.parseDouble(args[3]);
		int d1 = Integer.parseInt(args[4]);
		int m1 = Integer.parseInt(args[5]);
		int y1 = Integer.parseInt(args[6]);
		int d2 = Integer.parseInt(args[7]);
		int m2 = Integer.parseInt(args[8]);
		int y2 = Integer.parseInt(args[9]);
		Employee_Count e = new Employee_COunt(id,args[1],args[2],salary,d1,m1,y1,d2,m2,y2);
		System.out.println(e+"\nNumber of objects created = "+objects);
		e.display();
	}
}

/*

$ javac Employee_Count.java

$ java Employee_Count 1 Gaurav Manager 2000 12 05 1998 25 01 2019
ID : 1
Name : Gaurav
Position : Manager
Salary : 2000.0
Number of objects created = 1
Date of Birth : 12/05/1998
Date of Joining : 25/01/2019

*/

