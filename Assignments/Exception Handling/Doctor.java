/*

Create a class Doctor with attributes id, name, age and department. Initialize values through parameterized constructor. If age of Doctor is not in between 25 and 65 then generate user-defined exception “AgeNotWithinRangeException”. If name contains numbers or special symbols raise exception “NameNotValidException”. Define the two exception classes. 

*/

class AgeNotWithinRangeException extends Exception
{
	AgeNotWithinRangeException(String str)
	{
		System.out.print(str);
	}
}

class NameNotValidException extends Exception
{
	NameNotValidException(String str)
	{
		System.out.print(str);
	}
}

public class Doctor
{
	int id,age;
	String name,dept;

	Doctor(int id,String name,int age,String dept)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	void display()
	{
		System.out.println("\nID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Department = "+dept);
	}

	public static void main(String args[])
	{
		try
		{
			int id = Integer.parseInt(args[0]);
			String name = args[1];

			if(!(name.matches("^[a-zA-Z]*$")))
			{
				NameNotValidException n = new NameNotValidException("Name is not Valid\n");
				throw n;
			}

			int age = Integer.parseInt(args[2]);
			if(age < 25 || age > 65)
			{
				AgeNotWithinRangeException n = new AgeNotWithinRangeException("Age is not Valid\n");
				throw n;
			}

			String dept = args[3];
			Doctor d = new Doctor(id,name,age,dept);
			d.display();
		}
		catch(NameNotValidException | AgeNotWithinRangeException n)
		{
			System.out.println("Exception raised by "+n);
		}
	}
}

/*

$ javac Doctor.java

$ java Doctor 1 Gaurav 56 Physiotherapy

ID = 1
Name = Gaurav
Age = 56
Department = Physiotherapy

$ java Doctor 1 Gaurav 89 Physiotherapy
Age is not Valid
Exception raised by AgeNotWithinRangeException

$ java Doctor 1 Gau123 89 Physiotherapy
Name is not Valid
Exception raised by NameNotValidException

*/
