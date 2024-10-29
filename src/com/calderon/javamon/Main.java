package com.calderon.javamon;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Start Program");
		
//		Javamon javamon = new Javamon();
//		javamon.init();
		
//		Nickname nickname = new Nickname();
//		String newNickname =nickname.getNewNickname();
//		System.out.println("El nuevo nickmane es: " + newNickname);
	
		Dice dice = new Dice();
		int diceSide = dice.getRoll();
		System.out.println("Ha salido " + diceSide);
		
		System.out.println("End program");

	}

}
