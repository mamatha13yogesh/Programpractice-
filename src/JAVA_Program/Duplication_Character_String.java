package JAVA_Program;

import java.util.HashMap;
import java.util.Set;

public class Duplication_Character_String {
	public static void main(String[] args)
	{
		String word="mamathayogeshhiyan";
		char[] letters=word.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character letter:letters)
		{
			if(map.containsKey(letter))
			{
				map.put(letter, map.get(letter)+1);
			}
			else
			{
				map.put(letter, 1);
			}
		}
		Set<Character> st=map.keySet();
		for(Character letter:st)
		{
			if(map.get(letter)>1)
			{
				System.out.println(letter+" "+map.get(letter));
			}
		}
		
		
	}

}
