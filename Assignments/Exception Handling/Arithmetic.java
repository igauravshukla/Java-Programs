/*

Create a class Doctor with attributes id, name, age and department. Initialize values through parameterized constructor. If age of Doctor is not in between 25 and 65 then generate user-defined exception “AgeNotWithinRangeException”. If name contains numbers or special symbols raise exception “NameNotValidException”. Define the two exception classes. 

*/

class IllegalNumberOfArguments extends Exception
{
	IllegalNumberOfArguments(String str)
	{
		super(str);
	}
}

class InvalidOperatorException extends Exception
{
	InvalidOperatorException(String str)
	{
		super(str);
	}
}

class NegativeResultException extends Exception
{
	NegativeResultException(String str)
	{
		super(str);
	}
}

class Arithmetic
{
	public static void main(String args[]) throws IllegalNumberOfArguments, InvalidOperatorException, NegativeResultException
	{
		if(args.length < 3)
			throw new IllegalNumberOfArguments("Insufficient number of arguments\n");
		int a = Integer.parseInt(args[0]);
		char ch = args[1].charAt(0);
		int b = Integer.parseInt(args[2]);
		int result;
		switch(ch)
		{
			case '+':	result = a + b;
					System.out.println("Result = "+result);
					break;
			case '-':	result = a - b;
					System.out.println("Result = "+result);
					break;
			case '*':	result = a * b;
					System.out.println("Result = "+result);
					break;
			case '/':	result = a / b;
					System.out.println("Result = "+result);
					break;
			case '%':	result = a % b;
					System.out.println("Result = "+result);
					break;
			default:	throw new InvalidOperatorException("Invalid Operator\n");
		}
		if(result<0)
			throw new NegativeResultException("Negative Result\n");
	}
}

/*output

$ javac Arithmetic.java

$ java Arithmetic 3 + 6
Result = 9

$ java Arithmetic 3 - 6
Result = -3
Exception in thread "main" NegativeResultException: Negative Result at Arithmetic.main(Arithmetic.java:65)

$ java Arithmetic 6 - 3
Result = 3

$ java Arithmetic 6 "*" 3
Result = 18

$ java Arithmetic 6 / 3
Result = 2

$ java Arithmetic 6 % 3
Result = 0

$ java Arithmetic 6 $ 3
Exception in thread "main" InvalidOperatorException: Invalid Operator at Arithmetic.main(Arithmetic.java:63)

$ java Arithmetic 6 3
Exception in thread "main" IllegalNumberOfArguments: Insufficient number of arguments at Arithmetic.main(Arithmetic.java:40)

*/
