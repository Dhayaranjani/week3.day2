package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Assignment 3:missing Number
** int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
 * 1) Remove the duplicates using Set
 * 2) Make sure the set is in the ascending order
 * 3) Iterate from the starting number and verify the next number is + 1
 * 4) If did not match, that is the number * */

public class Assignment3_MissingNum {

	public static void main(String[] args) {

		Integer[] myNum = {4,6,7,2,3,1,9,10,8,8,6,2};
		
		Set<Integer> mySet = new TreeSet<Integer>();
		mySet.addAll(Arrays.asList(myNum));
		
		List<Integer> myLst = new ArrayList<Integer>(mySet);
		for (int i = 0; i < myLst.size(); i++) {
			
			if(myLst.get(i)!=i+1) {
				System.out.println(i+1);
				break;
			}
			
		}
		
		

	}

}
