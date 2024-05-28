package practiceProg;

public class PrimeNum {

	public static void main(String[] args) {
		int n=3;
		int flat=0;
		
		if(n==0||n==1)
		{
			System.out.println("It is not a prime");
		}
		else if(n==2) 
		{
			System.out.println("It is a prime ");
		}
		else if(n%2==0)
		{
			System.out.println("It isnot a prime");
			
		}
		else
		{
			System.out.println("It is a prime");
		}
		

	}

}
