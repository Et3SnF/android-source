package com.bloc.classes;

class Dog {
	
	// CONSTANTS
	
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	
	// Other member variables
	
	// Hair length
	float mHairLength;
	
	// Gender, either "male" or "female"
	String mGender;
	
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	
	// Its age
	int mAge;
	
	// Its weight in pounds
	float mWeight;
	
	// The color of its coat
	String mColor;

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/
	
	int mTimesFed = 0;
	int mPlayTimes = 0;

	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/

	float getHairLength() {
		return mHairLength;
	}
	
	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/

	void setHairLength(float hairLength) {
		mHairLength = hairLength;
	}
	
	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/

	String getGender() {
		return mGender;
	}
	
	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/

	void setGender(String gender) {
		mGender = gender;
	}
	
	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/

	String getSize() {
		return mSize;
	}
	
	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/

	void setSize(String size) {
		mSize = size;
	}
	
	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/

	int getAge() {
		return mAge;
	}
	
	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/

	void setAge(int age) {
		mAge = age;
	}
	
	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/

	float getWeight() {
		return mWeight;
	}
	
	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/

	void setWeight(float weight) {
		mWeight = weight;
	}
	
	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/

	String getColor() {
		return mColor;
	}
	
	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/

	void setColor(String color) {
		mColor = color;
	}
	
	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
	
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/

	void feed() {
		
		mTimesFed++;
		mWeight += WEIGHT_GAIN;
		
		if(mTimesFed % 3 == 0) {
						
			if(mSize.equals("tiny")) {
				mSize = "small";
			}
			else if(mSize.equals("small")) {
				mSize = "average";
			}
			else if(mSize.equals("average")){
				mSize = "large";
			}
		}
			
	}
	
	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/

	void play() {
		
		mPlayTimes++;
		mWeight -= WEIGHT_LOSS;
		
		if(mPlayTimes % 6 == 0) {
			
			if(mSize.equals("large")) {
				mSize = "average";
			}
			else if(mSize.equals("average")) {
				mSize = "small";
			}
			else if(mSize.equals("small")){
				mSize = "tiny";
			}
		}
		
		if (mWeight <= MIN_WEIGHT) {
			mPlayTimes--;
			mWeight += WEIGHT_LOSS;
			System.out.println("Your dog cannot go below this weight of " + MIN_WEIGHT + "pounds!");
		}
	}
	
	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/
	
	void cutHair() {
		
		mHairLength -= HAIR_CUT_LENGTH;
		
		if(mHairLength < 0) {
			mHairLength = 0;
			System.out.println("Hair Length cannot be less than 0!");
		}
		
	}
}