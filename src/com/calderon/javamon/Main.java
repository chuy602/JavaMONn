package com.calderon.javamon;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Start Program");
		

		
//		Nickname nickname = new Nickname();
//		String newNickname =nickname.getNewNickname();
//		System.out.println("El nuevo nickmane es: " + newNickname);
	
//		Dice dice = new Dice();
//		int diceSide = dice.getRoll();
//		System.out.println("Ha salido " + diceSide);
		
		Javamon javamon1 = new Javamon();
		System.out.println(javamon1.toString());
		
		Javamon javamon2 = new Javamon("Picachu");
		System.out.println(javamon2.toString());
		
		
		Combat combat = new Combat( javamon1,  javamon2);
		combat.initCombat();
		
		
		System.out.println("End program");

	}

}
