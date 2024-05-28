package practiceProg;

public class Palindrome_number {

	public static void main(String[] args) {
		int a=1121122;
		int reverse=0, remainder;
				
		
		while(a!=0)
		{ remainder=a%10;
			reverse=reverse*10+remainder;
			a/=10;
			System.out.print(reverse);
		}
		
		if(a==reverse)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}
