/*

You are given a date. You just need to write the method, findDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.

Input Format :
A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

Constraints :
	2000 < year < 3000

Output Format :
Output the correct day in capital letters.

Sample Input
08 05 2015

Sample Output
WEDNESDAY

Explanation
The day on August 5th 2015 was WEDNESDAY.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result
{
	public static String findDay(int month, int day, int year)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(year , month-1 , day);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String Day[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		return(Day[dayOfWeek-1]);
	}
}

class Solution
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();

		String res = Result.findDay(month, day, year);

		System.out.println(res);
	}
}
