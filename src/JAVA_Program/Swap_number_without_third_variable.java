package JAVA_Program;

public class Swap_number_without_third_variable {
	
	public static void main(String[] args)
	{
		int a=1234;
		int b=2000;
		System.out.println("a="+a+" b="+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("a="+a+" b="+b);
		 String d="Mamatha";
		 String e="Yogesh";
		 System.out.println("d="+d+" e="+e);
		d=d+e;
		e=d.substring(0,(d.length()-e.length()));
		d=d.substring(e.length());
		System.out.println("d="+d+" e="+e);
		
		
		
	}

}
