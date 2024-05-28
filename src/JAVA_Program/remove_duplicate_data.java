package JAVA_Program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate_data 
{// Driver code
public static void main(String[] args)
{
	
	int a[]= {1,2,3,4,5,6,7,3,4,2,0,0,9,5};
	int n=a.length;
	
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	
	for(int i=0;i<n;i++)
	{
		set.add(i);
	}
	System.out.println(set);
} 
}