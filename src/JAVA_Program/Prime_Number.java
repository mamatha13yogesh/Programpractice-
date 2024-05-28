package JAVA_Program;

public class Prime_Number {
	
	
	
	// number which is not dividable any number other then 1 or itself

	public static void main(String[] args) 
	{
	  int number =5;	 
	  int m=number/2;
	  int flag=0;
	  
	  if(number==0||number==1)
	  {
		  System.out.println("number is not prime");
	  }
	  for(int i=2;i>=m;i++)    //1234
	  {
		  if (number%2==0)
		  {
			  System.out.println("number is not prime");
			  flag=1;
			  break;
		  }
	  }
	  if (flag==0)
	  {
		  System.out.println("number is prime");
	  }

	}

}
