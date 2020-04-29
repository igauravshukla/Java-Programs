/**

Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format :
The first line contains a string denoting a.
The second line contains a string denoting b.

Constraints :
	1 <= length(a),length(b) <= 50
	Strings a and b consist of English alphabetic characters.
	The comparison should NOT be case sensitive.

Output Format :
Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0
anagram
margana

Sample Output 0
Anagrams

Explanation 0
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1
anagramm
marganaa

Sample Output 1
Not Anagrams

Explanantion 1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2
Hello
hello

Sample Output 2
Anagrams

Explanation 2
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

*/

import java.util.*;

class Solution
{
	static boolean isAnagram(String a, String b)
	{
		if(a.length() == b.length())
		{
			a = a.toUpperCase();
			b = b.toUpperCase();

			HashMap <Character , Integer> m = new HashMap<Character , Integer>();

			for(int i=0 ; i<a.length() ; i++)
			{
				char letter = a.charAt(i);
				if(! m.containsKey(letter))
					m.put(letter , 1);
				else
				{
					int freq = m.get(letter);
					m.put(letter , ++freq);
				}
			}
			for(int i=0 ; i<b.length() ; i++)
			{
				char letter = b.charAt(i);
				if(! m.containsKey(letter))
					return false;

				Integer freq = m.get(letter);

				if(freq == 0)
					return false;
				else
					m.put(letter , --freq);
			}
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a , b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}

/**

	static boolean isAnagram(String a, String b)
	{
		if(a.length() != b.length())
			return false;

		int c[] = new int[26], d[] = new int[26];

		a = a.toUpperCase();
		b = b.toUpperCase();

		for(int i=0; i<a.length(); i++)
		{
			c[a.charAt(i) - 'A']++;
			d[b.charAt(i) - 'A']++;
		}

		for(int i =0;i<26; i++)
			if(c[i] != d[i])
				return false;
		return true;	
	}

*/