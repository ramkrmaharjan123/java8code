package com.lambda.examples.one;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;

public class LambdaExampleOne {

	public static void main(String[] args) {
		
		List<String> animals =   Arrays.asList("Elephant","Fish","Goat","Apple","Banana","Cat","Dog");
		
		//Lambda Boolean expression
		
		/* Compare based ont he alphabetical order */
		
		
		animals.sort((s1,s2)-> s1.compareTo(s2)); // A
		
//		animals.sort(String :: compareTo);  // B   -> Both A and B works the same.
		
		System.out.println(animals);
		
		
		/* Compare based on the length  */
		
//		animals.sort(comparing((a) -> a.length())); // C
		
		animals.sort(comparing(String :: length));  // D -> Both C and D works the same
		
		System.out.println(animals);
		
	}

}
