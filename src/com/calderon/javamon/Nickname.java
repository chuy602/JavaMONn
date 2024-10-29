package com.calderon.javamon;

import java.util.Random;

public class Nickname {
	// Creacion de atributos

	private String[] nicknameStarString = { "Ojo ", "Puño ", "Espada ", "Viento " };
	private String[] nicknameEndString = { "negro ", "de Fuego ", "del Infierno ", "Mortal " };

	public Nickname() {
		super();

	}

	public Nickname(String[] nicknameStarString, String[] nicknameEndString) {
		super();
		this.nicknameStarString = nicknameStarString;
		this.nicknameEndString = nicknameEndString;
	}

	public String getNewNickname() {
		Random random = new Random();
//		int startNameIndex = random.nextInt(this.nicknameStarString.length);
//		int endNameIndex = random.nextInt(this.nicknameEndString.length);
//		random.nextInt(4);
//		String newNickname = this.nicknameStarString[startNameIndex] + 
//				"" + this.nicknameEndString[endNameIndex] ;
//		return newNickname;
		
		return 
		this.nicknameStarString[random.nextInt(this.nicknameStarString.length)] + ""  +
		this.nicknameEndString[random.nextInt(this.nicknameEndString.length)];
//

		
		
		
//		
		
		
		
		
	}

}
