package NewPractice;

public class NewCode {

	public static void main(String[] args) 
	{
	
		int a=142857, b=2, c,d;
	
	       c=a*b;
	       System.out.println(c);
	       d=c;
	
	
	 for (int i=5;i<6;--i)
	{ 
	int remainder= c%10; 
	c=c/10;   //14285
	
	for(int j=5;j<6;--j)
	{
	 int remainder1=a%10; 
	 
	if(remainder1==remainder)
	{
		System.out.println(remainder+"number is present");
	a=a/10;
	}
	
	if(j==0)
	{
		c=d;
		break;
	}
	}
	if(i==0)
	{
		System.out.println("numbers are present");
	}
	}
}

}
	
	


	
