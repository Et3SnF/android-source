package com.bloc.securitypackages.colors;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Color extends Object {
	
	// Name of the color
	protected String mName;
	// Alpha value
	protected int mAlpha;
	// Red value
	protected int mRed;
	// Green value
	protected int mGreen;
	// Blue value
	protected int mBlue;

	public Color(int red, int green, int blue) {
		this(null, red, green, blue);
	}

	public Color(String name, int red, int green, int blue) {
		mName = name;
		mRed = red;
		mGreen = green;
		mBlue = blue;
	}
	
}