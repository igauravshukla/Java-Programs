/*

Define an interface “QueueOperations” which declares methods for a static queue. Define a class “MyQueue” which contains an array and front and rear as data members and implements the above interface. Initialize the queue using a constructor. Write a menu driven program to perform operations on a queue object. 

*/

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

interface QueueOperations
{
    public void in();
    public void del();
}

class MyQueue implements QueueOperations
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int n;
	int front = 0;
	int rear = -1;
	int a[];
    MyQueue(int n)
    {
        this.n=n;
		a = new int[n];
    }
    public void in()
    {
        if(rear==n-1)
            System.out.print("Overflow");
        else
        {
            System.out.print("Enter the number to add: ");
            int no = sc.nextInt();
	       rear++;
            a[rear] = no;
        }
    }
    public void del()
    {
        if(front==rear+1)
            System.out.print("Underflow");
        else
        {
            System.out.println("Deleted element: "+a[front]);
            front++;
        }
    }
}

public class Main7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the array size: ");
        int n = Integer.parseInt(br.readLine());
        MyQueue q = new MyQueue(n);
		int ch;
		do
		{
			System.out.print("\n***MENU***\n");
			System.out.print("1.Insert\n2.Delete\n3.Exit\n");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	q.in();
						break;
				case 2:	q.del();
						break;
				case 3:	System.exit(0);
						break;
				default:	System.out.print("Invalid option\n");
			}
		}while(ch!=3);
	}
}
/*


$ javac main6.java
$ java main6

Enter the array size: 5

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 1
Enter the number to add: 10

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 1     
Enter the number to add: 11

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 1
Enter the number to add: 12

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 2
Deleted element: 10

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 2
Deleted element: 11

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 2
Deleted element: 12

***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 2
Underflow
***MENU***
1.Insert
2.Delete
3.Exit
Enter your choice: 3

*/
