package com.bloc.securitypackages.apples;

/* Fruit and Color classes are in a different package
 * so an import is necessary to instantiate the necessary
 * classes in this file.
 * 
 * Apple does not know where Fruit was b/c it's not in the
 * same package. An import was necessary for it to stop 
 * complaining
 * 
 * Color object was used in the parameter and the constructor
 * did not know where it came from. So an import from the Color
 * class was necessary
 * 
 */

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.colors.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

abstract class Apple extends Fruit {
	
	// Constructor for this abstract class
	
	public Apple(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}
	
	// Abstract method
	
	abstract void bite();

}