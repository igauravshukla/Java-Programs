/*

Define a class CricketPlayer (name, no_of_innings, no_times_notout, total_runs, bat_avg). Create an array of n player objects. Calculate the batting average for each player using a static method avg(). Handle appropriate exception while calculating average. Define a static method “sortPlayer” which sorts the array on the basis of average. Display the player details in sorted order.

*/

import java.util.*;

class InvalidEntry extends Exception
{
	InvalidEntry(String msg)
	{
		System.out.println(msg);
	}
}

public class CricketPlayer
{
	String name;
	int inn,no,total_runs;
	float bat_avg;

	CricketPlayer(String name,int inn,int no,int total_runs)
	{
		this.inn = inn;
		this.no = no;
		this.total_runs = total_runs;
		this.name = name;
	}

	public static void avg(CricketPlayer c) throws InvalidEntry
	{
		if(c.inn < c.no)
		{
			throw new InvalidEntry("No. of innings played can't be less than No. of times player is not-out");
		}
		else if((c.inn-c.no) == 0)
			c.bat_avg = 0.0f;
		else
			c.bat_avg = c.total_runs/(c.inn-c.no);
	}

	public static void sort(int n,CricketPlayer c[])
	{
		CricketPlayer temp;
		int i,j;
		for(i=0;i<(n-1);i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(c[i].bat_avg < c[j].bat_avg)
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
	}

	public void display()
	{
		System.out.println("\nDetails of players are as follows :-");
		System.out.println("\nName = "+name);
		System.out.println("Number of innings played = "+inn);
		System.out.println("Number of times player remains not out = "+no);
		System.out.println("Number of runs scored = "+total_runs);
		System.out.println("Batting average = "+bat_avg);
	}

	public static void main(String args[]) throws InvalidEntry
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter the number of batsman : ");
			int n = sc.nextInt();
			CricketPlayer c[] = new CricketPlayer[n];
			for(int i=0;i<n;i++)
			{
				System.out.print("\nEnter the name : ");
				String name = sc.next();

				System.out.print("Enter the number of innings played by batsman : ");
				int inn = sc.nextInt();

				System.out.print("Number of times the batsman is not-out : ");
				int no = sc.nextInt();

				System.out.print("Enter the runs scored by batsman : ");
				int total_runs = sc.nextInt();

				c[i] = new CricketPlayer(name,inn,no,total_runs);

				avg(c[i]);

				System.out.println("Batting average = "+c[i].bat_avg);
			}
			sort(n,c);
			for(int i=0;i<n;i++)
			{
				c[i].display();
			}
	}
}

/*

$ javac CricketPlayer.java

$ java CricketPlayer

Enter the number of batsman : 4

Enter the name : Sachin
Enter the number of innings played by batsman : 452
Number of times the batsman is not-out : 41
Enter the runs scored by batsman : 18426
Batting average = 44.0

Enter the name : Sehwag
Enter the number of innings played by batsman : 245
Number of times the batsman is not-out : 9
Enter the runs scored by batsman : 8273
Batting average = 35.0

Enter the name : Dhoni
Enter the number of innings played by batsman : 297
Number of times the batsman is not-out : 84
Enter the runs scored by batsman : 10773
Batting average = 50.0

Enter the name : Gaurav
Enter the number of innings played by batsman : 34
Number of times the batsman is not-out : 34
Enter the runs scored by batsman : 1234
Batting average = 0.0

Details of players are as follows :-

Name = Dhoni
Number of innings played = 297
Number of times player remains not our = 84
Number of runs scored = 10773
Batting average = 50.0

Name = Sachin
Number of innings played = 452
Number of times player remains not our = 41
Number of runs scored = 18426
Batting average = 44.0

Name = Sehwag
Number of innings played = 245
Number of times player remains not our = 9
Number of runs scored = 8273
Batting average = 35.0

Name = Gaurav
Number of innings played = 34
Number of times player remains not out = 34
Number of runs scored = 1234
Batting average = 0.0

$ java CricketPlayer

Enter the number of batsman : 1

Enter the name : Dilshan
Enter the number of innings played by batsman : 45
Number of times the batsman is not-out : 46
Enter the runs scored by batsman : 1842
No. of innings played can't be less than No. of times player is not-out
Exception in thread "main" InvalidEntry
		at CricketPlayer.avg(CricketPlayer.java:34)
		at CricketPlayer.main(CricketPlayer.java:92)

*/