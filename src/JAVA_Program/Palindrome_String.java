package JAVA_Program;

public class Palindrome_String {
	
	public static void main(String[] args)
	{
		String name="radar";
		//char[] wordsStrings=name.toCharArray();
		int count=name.length();
		
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			char sep=name.charAt(i);
			
			rev=rev+sep;
			
		}
		
		System.out.println("original word "+name+" reverse word is "+rev);
		if(name.equals(rev))
		{
			System.out.println("It is a palindrome");
			
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

	

}
