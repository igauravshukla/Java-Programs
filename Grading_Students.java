/*

HackerLand University has the following grading policy:
    Every student receives a grade in the inclusive range from 0 to 100.
    Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's grade according to these rules:
    If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
    If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

Function Description :
Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.

gradingStudents has the following parameter(s):

    grades: an array of integers representing grades before rounding

Input Format :
The first line contains a single integer, n, the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i], denoting student i's grade.

Constraints :
    1 <= n <= 60
    0 <= grades[i] <= 100
    
Output Format :
For each grades[i], print the rounded grade on a new line.

Sample Input 0
4
73
67
38
33

Sample Output 0
75
67
40
33

*/

import java.io.*;
import java.util.*;

class Solution
{
    static void gradingStudents(int grades[])
    {
        for(int i:grades)
        {
            int x=i+5-(i%5);
            if(i<38)
                System.out.println(i);
            else if((x-i)<3)
                System.out.println(x);
            else
                System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int grades[]=new int[n];
        for(int i=0;i<n;i++)
            grades[i]=sc.nextInt();
        gradingStudents(grades);
    }
}
