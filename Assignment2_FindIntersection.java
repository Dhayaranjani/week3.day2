package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment2_FindIntersection {

	public static void main(String[] args) {
		//1. Declare the 1st Integer values into an Array 
		Integer[] arr1 = {3,2,11,4,6,7,9,10};

		//2. Declare the 2nd Integer values into an Array	
		Integer[] arr2 = {1,2,8,4,9,7,8,9,10};
		
		//Assign all the value in TreeSet to get in ascending order 
		Set<Integer> mySet1 = new TreeSet<Integer>();
		mySet1.addAll(Arrays.asList(arr1));
		
		//Assign all the value in TreeSet to get in ascending order		
		Set<Integer> mySet2 = new TreeSet<Integer>();
		mySet2.addAll(Arrays.asList(arr2));
		
		//Reassign array1 to List to get the value 
		List<Integer> myList1 = new ArrayList<Integer>(mySet1);
		//Reassign array2 to List to get the value 
		List<Integer> myList2 = new ArrayList<Integer>(mySet2);
		
		//Now travel to all the numbers and compare by using nested for loop.
		for (int i = 0; i < myList1.size(); i++) {
			
			for (int j = 0; j < myList2.size(); j++) {
				//Compare 2 list and if it matches write it.
				if((myList1.get(i)) == (myList2.get(j)))
					System.out.println(myList1.get(i));	
			}
			
		}
		
	}

}
