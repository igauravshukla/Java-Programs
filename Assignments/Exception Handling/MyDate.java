/*

Define a class MyDate (day, month, year) with methods to accept and display a MyDate object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException”
if the date is invalid.
Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001

*/

import java.util.*;

class DateException extends Exception
{
	DateException(String msg)
	{
		super(msg);
	}
}

class MyDate
{
	int dd,mm,yy;

	void accept()
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter date(dd mm yyyy) : ");
			dd = sc.nextInt();
			mm = sc.nextInt();
			yy = sc.nextInt();
			if(mm>12 || mm<1)
				throw new DateException("Invalid month");
			else
			{
				if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
				{
					if(dd>31 || dd<1)
						throw new DateException("Invalid date");
				}
				else if(mm==4 || mm==6 || mm==9 || mm==11)
				{
					if(dd>30 || dd<1)
						throw new DateException("Invalid date");
				}
				else if(mm==2)
				{
					if(yy%4==0)
					{
						if(dd>29)
							throw new DateException("Invalid date");
					}
					else if(dd>28)
						throw new DateException("Invalid date");
				}
			}
		}
		catch(DateException e)
		{
			System.out.print(e);
		}
	}

	public String toString()
	{
		return(dd+"-"+mm+"-"+yy);
	}

	public static void main(String args[])
	{
		MyDate d = new MyDate();
		d.accept();
		System.out.println(d);
	}
}

/*

$ javac MyDate.java
$ java MyDate

Enter date(dd mm yyyy): 29 2 1999
DateException : Invalid Date 29-2-1999

*/