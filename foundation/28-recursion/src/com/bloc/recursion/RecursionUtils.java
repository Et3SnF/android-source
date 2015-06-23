package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	
	public static final int findMaxRecursively(List<Integer> numbers) {
		
		
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		
		// Base case if list was just 1 element
		
		if (numbers.size() == 1) {
			return numbers.get(0);
		}
		
		List<Integer> leftHalf = numbers.subList(0, numbers.size()/2);
		List<Integer> rightHalf = numbers.subList(numbers.size()/2, numbers.size());
		
		int left = findMaxRecursively(leftHalf);
		int right = findMaxRecursively(rightHalf);
		
		return left > right ? left : right;
		
	}
}