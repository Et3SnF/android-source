package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GreatDane class below
 *
 *	Great Danes have an extra size category, "huge".
 *	After growing to a "large" size, they may grow
 *	to an additional, "huge" size after 3 meals.
/************************************************/

public class GreatDane extends Dog {
		
	// Override getSizeIndex() to accommodate the "huge"
	
	@Override
	int getSizeIndex(String size) {
		
		if (size == null) {
			// Return default "average" when missing size
			return 2;
		}

		if("tiny".equals(size)) {
			return 0;
		} 
		else if("small".equals(size)) {
			return 1;
		} 
		else if("average".equals(size)) {
			return 2;
		} 
		else if("large".equals(size)) {
			return 3;
		} 
		else if("huge".equals(size)) {
			return 4;
		}
		else {
			return 2;
		}
	}
	
	// Override the changeSize method to accommodate new sizeIndex
	
	@Override
	void changeSize(boolean grow) {
		int sizeIndex = getSizeIndex(); //initial value of sizeIndex
		
		// Ternary conditional operation to shrink or grow size (based 
		// on an integer that corresponds to the size)
		sizeIndex = sizeIndex + (grow ? 1 : -1);
		
		// Accounts for invalid values and resets them
		if (sizeIndex > 4) {
			sizeIndex = 4;
		} else if (sizeIndex < 0) {
			sizeIndex = 0;
		}
		
		//Something from fromSizeIndex(int) has to be done
		setSize(fromSizeIndex(sizeIndex)); 
	}
	
	// Override fromSizeIndex to accommodate "huge"
	
	@Override
	String fromSizeIndex(int index) {
		switch(index) {
			case 0: return "tiny";
			case 1: return "small";
			case 2: return "average";
			case 3: return "large";
			case 4: return "huge"; //added new category for GreatDane
			default: return "large";
		}
	}
	
}