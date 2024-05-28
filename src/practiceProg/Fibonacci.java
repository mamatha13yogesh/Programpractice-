package practiceProg;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0,b=1,count=10,c,i;
		System.out.print(a+","+b);

		for(i=2;i<10;++i)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
		}
		
	}

}
