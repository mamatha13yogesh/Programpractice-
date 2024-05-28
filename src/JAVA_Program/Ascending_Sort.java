package JAVA_Program;

public class Ascending_Sort {

	public static void main(String[] args) {
		int a[]= {8,8,7,5,6,7,4,5,2,1,3,2,3};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
