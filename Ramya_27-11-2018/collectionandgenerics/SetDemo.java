package com.tharanga.collectionandgenerics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> vowelsSet = new HashSet<String>();

		// add example
		vowelsSet.add("a");
		vowelsSet.add("e");
		vowelsSet.add("i");
		vowelsSet.add("o");
		vowelsSet.add("u");
			
		//convert Set to Array
		String strArray[] = vowelsSet.toArray(new String[vowelsSet.size()]);
		System.out.println(Arrays.toString(strArray)); 
	   }
}
