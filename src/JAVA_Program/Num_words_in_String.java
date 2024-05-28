package JAVA_Program;

public class Num_words_in_String {
	
	public static void main(String[] args)
	{
		String Sen="mamatha having interview today so do not distube her please";
		String[] split=Sen.split(" ");
		int length=split.length;
		int count=1;
		
		for(int i=1;i<length;i++)
		
		{
			System.out.println("print"+i);
			if (split[i]==" " && split[i+1]!=" ")
			{
				System.out.println("print");
				count++;
			}
			System.out.println(count);
		}
		
				
	}

}
