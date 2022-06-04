package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4_PrintUnique {
	/*Assignment 4: PrintOnlyUniqueCharacters
	String input = "DhayaRanjani";	output:// DhayRnji
	 * 1) Convert String to Character array
	 * 2) Create a new Set -> HashSet
	 * 3) Add each character to the Set and if it is already there, remove it
	 * 4) Finally, print the set * */

	public static void main(String[] args) {
		
		String myName = "DhayaRanjani";
		
		//Converted to character array
		char[] charArray = myName.toCharArray();

		//Create set of Character
		Set<Character> unique = new LinkedHashSet<Character>();
		
		//Travel to each character
		for (int i = 0; i < charArray.length; i++) {
			if(unique.add(charArray[i])) {
				System.out.print(charArray[i]);
			}
			
		}
	}

}
