package com.bloc.objects;

class Song {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Default Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/

	Song() {
		mEnsemble = new Ensemble(" ", new Artist[0]);
		mTitle = " ";
		mYearReleased = 0;
	}
	
	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/

	Song(Ensemble ensemble, String title) {
		mEnsemble = ensemble;
		mTitle = title;
	}
	
	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
	
	Song(Ensemble ensemble, String title, int yearReleased) {
		mEnsemble = ensemble;
		mTitle = title;
		mYearReleased = yearReleased;
	}
	
}