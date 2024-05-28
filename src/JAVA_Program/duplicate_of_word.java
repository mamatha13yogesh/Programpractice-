package JAVA_Program;

import java.util.HashMap;
import java.util.Set;

public class duplicate_of_word {
	public static void main(String[] args)
	{
	  String sentence="mamatha having interview today mamatha need to have lunch mamatha having laptop";
	  String[] words=sentence.split(" ");
	  
	  HashMap<String, Integer> mp=new HashMap<String, Integer>();
	  for(String word:words)
	  {
		  if(mp.containsKey(word))
		  {
			  mp.put(word, mp.get(word)+1);
		  }
		  else
		  {
			  mp.put(word, 1);
		  }
	  }
	  Set<String> st=mp.keySet();
	  
	  {
		  for(String word:st)
		  {
			  if(mp.get(word)>1)
			  {
				  System.out.println(word+"="+mp.get(word));
			  }
		  }
	  }
	  
	}
}
