/*

Define Exceptions VowelException ,BlankException,ExitException. Write another class Test which reads a character from command line. If it is a vowel, throw VowelException,if it is blank throw BlankException and for a character 'X' throw an 
ExitException and terminate program. For any other character, display “Valid character”. 

*/

class VowelException extends Exception
{
}

class BlankException extends Exception
{
}

class ExitException extends Exception
{
}

class Test
{
	public static void main(String args[])
	{
		char ch = args[0].charAt(0);
		try{
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			{
				System.out.print("Character is a vowel\n");
				throw new VowelException();
			}
			if(ch==' ')
			{
				System.out.print("Character is a blank space\n");
				throw new BlankException();
			}
			if(ch=='X')
			{
				System.out.print("Character is a X\n");
				throw new ExitException();

			}
			System.out.println("Valid Character\n");
		}
		catch(VowelException | BlankException | ExitException n)
		{
			System.out.println("Exception raised by "+n);
		}
	}
}

/*

$ javac Test.java

$ java Test g
Valid Character

$ java Test a
Character is a vowel
Exception raised by VowelException

$ java Test " " 
Character is a blank space
Exception raised by BlankException

$ java Test X
Character is a X
Exception raised by ExitException

*/
