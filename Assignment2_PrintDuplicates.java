package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2_PrintDuplicates {

	public static void main(String[] args) {
		//1. Input array as Integer
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		//2. Reassign the array in the List 
		List<Integer> myList = new ArrayList<Integer>(Arrays.asList(arr));
		
		//3. Iterate in the for Loop to print the duplicates in Array
		for (int i = 0; i < myList.size(); i++) {

			int count = 0;
			for (int j = i+1; j < myList.size(); j++) {
				if(myList.get(i) == myList.get(j))
				{
					count++;
				}
			}
			//4. If duplicates then print the numbers
			if(count > 0)
			{
				System.out.println(myList.get(i));
			}
			
		}
	}

}
