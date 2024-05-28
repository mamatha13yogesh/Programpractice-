package JAVA_Program;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		int a=0,b=1,c,n=15;
		for(int i=0;i<=n;i++)
		{
		c=a+b;
		System.out.print(a+" ");
		a=b;
		b=c;
		
		}
	}
	
	

}
