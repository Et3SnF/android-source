package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/

public class Chihuahua extends Dog {

	// Overriding the feed method specifically for this Chihuahua
	
	@Override
	void feed() {
		
		// Change feedCounter to 5 for Chihuahua
		
		if(++mFeedCounter == 5) {
			changeSize(true);
			mFeedCounter = 0; //reset the counter
		}
		
	}
	
	// changeSize(boolean) method is from the Dog class, which involves other methods in there as well!
	
}