package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment2_RemoveDuplicates {
	/* Pseudo code //But, now do the same set of programs using Collections.
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 * g) Displaying the String without duplicate words*/

	public static void main(String[] args) {
		//1. Input text assigned to a string variable
		String text = "We learn java basics as part of java sessions in java week1";//1. Input String
		
		//2. Convert into string Array by split	method
		String[] splitTxt = text.split(" ");
		
		//3.Create set of Character
		Set<String> unique = new LinkedHashSet<String>();
		
		//Travel to each string and print the unique 
		for (int i = 0; i < splitTxt.length; i++) 
		{   
			if(unique.add(splitTxt[i])) 
			{
				System.out.print(splitTxt[i] + " ");
			}
			
		}
		
	}		

}


