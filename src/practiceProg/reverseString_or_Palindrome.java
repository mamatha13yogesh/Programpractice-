package practiceProg;

public class reverseString_or_Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String Actuals=s;
		
				int l=s.length();
				System.out.println(l);
				String reverse="";
				for(int i=l-1;i>=0;i--)
				{
					char w=s.charAt(i);
					
							reverse=reverse+w;
					//System.out.println(w);
					System.out.println(reverse);
					
							
				}
				
				if(reverse.equalsIgnoreCase(Actuals))
				{
					System.out.println("It is palindrome");
				}
				else {
					System.out.println("It is not a palindrome");
				}

	}

}
