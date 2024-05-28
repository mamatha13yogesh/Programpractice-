package JAVA_Program;

public class Palindrome_Number {
	public static void main(String[] args)
	{
		int num=111111;
		int original=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("original number is "+original+" reversed number is "+rev  );
		if (original==rev)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}

}
