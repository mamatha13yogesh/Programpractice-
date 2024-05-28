package JAVA_Program;

public class letter_spaces_number {
	public static void main(String[] args)
	{
		String sen="123mamatha yogesh5678+*&^";
		char[] cha=sen.toCharArray();
		int length=cha.length;
		int letter=0,space=0,num=0,other=0;
		
		for(int i=0;i<length;i++) 
		{
			if(Character.isLetter(cha[i]))
			{
				letter++;
			}
			if (Character.isSpaceChar(cha[i]))
			{
				space++;
			}
			if(Character.isDigit(cha[i]))
			{
				num++;
			}
			else
			{
				other++;
				System.out.println(cha[i]);
			}
		}
		System.out.println(letter+" "+space+" "+num+" "+other);
	}

}
