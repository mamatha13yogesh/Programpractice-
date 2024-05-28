package JAVA_Program;

public class Rever_String_without_Affecting_order {

	public static void main(String[] args) {
		String sen="mamatha narayan yogesh";
		String[] split=sen.split(" ");
		int len=split.length;
//		System.out.println(len);
		String reverse="";
		for(int i=0;i<len;i++)
		{
			String word=split[i];
			String rev="";

			for(int j=word.length()-1;j>=0;j--)
			{
				
				rev=rev+word.charAt(j);

			}
		reverse=reverse+rev+" ";
		}
		System.out.print(reverse+" ");

	}

}
