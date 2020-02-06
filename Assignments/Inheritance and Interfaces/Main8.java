/*

Define a class Employee having private members – id, name, department, salary. Define default and parameterized constructors. Create a subclass called “Manager” with private member bonus. Define methods accept and display in both the classes. Create n objects of the Manager class and display the details of the manager having the maximum total salary (salary+bonus)

*/

import java.io.*;

class Employee
{
	private int id;
	private String name,dept;
	private double sal;

	Employee()
	{}

	Employee(int id,String name,String dept,double sal)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	double getSal()
	{
		return sal;
	}

	void display()
	{
		System.out.println("\nID : "+id);
		System.out.println("Name : "+name);  
		System.out.println("Department : "+dept);  
		System.out.println("Salary : "+sal);
	}
}

class Manager extends Employee
{
	double bonus;

	Manager()
	{
		this.bonus = 0.00;
	}

	Manager(int id,String name,String dept,double sal,double bonus)
	{
		super(id,name,dept,sal);
		this.bonus = bonus;
	}

	void display()
	{
		super.display();
		System.out.println("Bonus of Manager : "+bonus);
	}

	static Manager totsal(Manager []m, int n)
	{
		int i;
		Manager temp = m[0];
		for(i=0;i<n;i++)
		{
			if((m[i].getSal()+m[i].bonus) > (temp.getSal()+temp.bonus))
				temp = m[i];
		}
		return temp;
	}
}

class Main8
{
	public static void main(String args[]) throws IOException
	{
		Manager ms = new Manager();
		int i,n;
		System.out.print("\nEnter number of Managers : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		Manager m[] = new Manager[n];
		for(i=0;i<n;i++)
		{
			System.out.println("\nPlease enter the details:");
			System.out.print("ID : ");
			int id = Integer.parseInt(br.readLine());
			System.out.print("Name : ");
			String name = br.readLine();
			System.out.print("Department : ");
			String dept = br.readLine();
			System.out.print("Salary : ");
			double sal = Double.parseDouble(br.readLine());
			System.out.print("Bonus : ");
			double bonus = Double.parseDouble(br.readLine());
			m[i] = new Manager(id,name,dept,sal,bonus);
		}
		System.out.println("\nEmployee Deatils as below:-");
		for(i=0;i<n;i++)
		{
			m[i].display();
		}
		System.out.print("\nThe manager with maximum total salary:-");
		ms = Manager.totsal(m,n);
		ms.display();
	}
}

/*

$ javac Main8.java
$ java Main8

Enter number of Managers : 3

Please enter the details:
ID : 1
Name : Bhai Don
Department : CS
Salary : 23000
Bonus : 2300

Please enter the details:
ID : 2
Name : Dabbu
Department : CS
Salary : 34000
Bonus : 3400

Please enter the details:
ID : 3
Name : 22Kar
Department : CS
Salary : 12000
Bonus : 1200

Employee Deatils as below:-

ID : 1
Name : Bhai Don
Department : CS
Salary : 23000.0
Bonus of Manager : 2300.0

ID : 2
Name : Dabbu
Department : CS
Salary : 34000.0
Bonus of Manager : 3400.0

ID : 3
Name : 22Kar
Department : CS
Salary : 12000.0
Bonus of Manager : 1200.0

The manager with maximum total salary:-

ID : 2
Name : Dabbu
Department : CS
Salary : 34000.0
Bonus of Manager : 3400.0

*/