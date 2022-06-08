package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment2_SecondLargest {

	public static void main(String[] args) {
	/*Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it */

		//1. Declare the array
		Integer[] myData = {3,2,11,4,6,7,1,76};
		
		//2. Arrange the array in ascending order by TreeSet
		Set<Integer> mySet = new TreeSet<Integer>();
		mySet.addAll(Arrays.asList(myData));
		
		//3.Reassign the array to List to get the value
		List<Integer> myList = new ArrayList<Integer>(mySet);
	  
		//4. Now print the second Largest Value
		System.out.println("Second Largest Number is:");
		System.out.println("=========================");
		System.out.println(myList.get(myList.size()-2));
	
	}

}
