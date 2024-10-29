package com.calderon.javamon;

import java.util.Random;

public class Dice {
	
	final int SIDES_BY_DEFAULT = 6;
	final int MIN_SIDE_VALUE = 1;
	int sides; 
	

	public Dice() {
		super();
		this.sides = SIDES_BY_DEFAULT;
	}


	public Dice(int sides) {
		super();
		this.sides = sides;
	}


	public int getRoll() {
		
		Random random = new Random();
		
	
		return MIN_SIDE_VALUE +  random.nextInt(this.sides);
	}

}
