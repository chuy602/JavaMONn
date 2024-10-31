package com.calderon.javamon;


public class Combat {
	private final int MAX_NUMBER_ASSAULTS = 20;
	private int assaults;
	private Javamon javamon1;
	private Javamon javamon2;
	
	
	public Combat(Javamon javamon1, Javamon javamon2) {
		super();
		this.javamon1 = javamon1;
		this.javamon2 = javamon2;
	}
	
	public void initCombat() {
		do {
			this.assault();
			
		} while (this.getJavamon1().getLife() > 0  && 
				this.getJavamon2().getLife()> 0  &&
				this.getAssaults() <MAX_NUMBER_ASSAULTS);
		this.outcome();
		
	}
	
	public void assault() {
		int dammage;
		this.setAssaults(this.getAssaults() + 1);
		System.out.println("Asalto numero: " + this.getAssaults());
		if (this.getJavamon1().initiative() > this.getJavamon2().initiative()) {
			dammage = this.getJavamon1().attack() - this.getJavamon2().defend();
			dammage = (dammage >= 0)? dammage : 0;
			System.out.println("Attacks: " + this.getJavamon1().getName()
					+ "-> Defends: "+ this.getJavamon2().getName()
					+ " >> Daño: "+ dammage);
			this.getJavamon2().setLife(this.getJavamon2().getLife() - dammage);
		}
		else {
			dammage = this.getJavamon2().attack() - this.getJavamon1().defend();
			dammage = (dammage >= 0)? dammage : 0;
			System.out.println("Attacks: " + this.getJavamon2().getName()
					+ "-> Defends: "+ this.getJavamon1().getName()
					+ " >> Daño: "+ dammage);
			this.getJavamon1().setLife(this.getJavamon1().getLife() - dammage);
			
		}
		System.out.println("Resultado del asalto: \n\t" 
				+ this.getJavamon1().toString()
				+ "\n\t "
				+ this.getJavamon2().toString());
	}

	public void outcome() {
		System.out.println(" Total asaltos: " + this.getAssaults());
		if (this.getJavamon1().getLife() > 0
		&& this.getJavamon2().getLife() > 0 ){
			System.out.println("hay empate");
		}
		else {
			
			if (this.getJavamon1().getLife()== 0) {
				System.out.println("El ganador es: " + this.getJavamon2().toString());
			}
			else {
				System.out.println(" el ganador es : "+ this.getJavamon1().toString() );
			}
		}
	}


	public int getAssaults() {
		return assaults;
	}

	public void setAssaults(int assaults) {
		this.assaults = assaults;
	}

	public Javamon getJavamon1() {
		return javamon1;
	}

	public void setJavamon1(Javamon javamon1) {
		this.javamon1 = javamon1;
	}

	public Javamon getJavamon2() {
		return javamon2;
	}

	public void setJavamon2(Javamon javamon2) {
		this.javamon2 = javamon2;
	}

	
	

}
