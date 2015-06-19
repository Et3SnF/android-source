package com.bloc.generics;

/************************************************
 *	YOU MAY NOT MODIFY THIS FILE
/************************************************/

class ToyBox extends Object {
	private Toy<?>[] mToys;

	public ToyBox() {
		this(new Toy<?>[0]);
	}

	public ToyBox(Toy<?>... toys) {
		super();
		mToys = toys;
	}

	public void addToy(Toy<?> newToy) {
		
		// Create temporary array called toysTemp that adds one additional element
		
		Toy<?>[] toysTemp = new Toy<?>[mToys.length + 1];
		
		// Store all of the current toys into the new array called toysTemp
		
		for (int i = 0; i < mToys.length; i++) {
			toysTemp[i] = mToys[i];
		}
		toysTemp[mToys.length] = newToy; //Add the new toy to the last index
		mToys = toysTemp;
	}

	public Toy<?> getToyAtIndex(int index) {
		if (index < 0 || index >= mToys.length) {
			return null;
		}
		return mToys[index];
	}

	public int getToyCount() {
		return mToys.length;
	}
}