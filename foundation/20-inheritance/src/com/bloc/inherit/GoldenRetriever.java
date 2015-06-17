package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GoldenRetriever class below
 *
 *	Golden Retrievers shrink to a smaller size after
 *	playing only 3 times.
/************************************************/

class GoldenRetriever extends Dog {
	
	// Override the play method for GoldenRetriever such that it changes its size after 3 plays
	
	@Override
	void play() {
		setWeight(getWeight() - WEIGHT_LOST_FROM_FEEDING);
		if (getWeight() < MINIMUM_WEIGHT) {
			setWeight(MINIMUM_WEIGHT);
		}
		// Pre-increment play counter
		// Change play counter to 3 for Golden Retriever. Everything else is the same
		if (++mPlayCounter == 3) {
			changeSize(false);
			mPlayCounter = 0;
		}
	}

	
}