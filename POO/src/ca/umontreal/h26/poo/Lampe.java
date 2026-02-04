package ca.umontreal.h26.poo;

public class Lampe {

	private boolean etat = false ;
	
	public Lampe(boolean etat) {
		this.etat = etat;
		
	}
	public boolean estAllumee() {
		return this.etat;
	}
	
	
	public void setEtat() {
		this.etat = !this.etat;
	}
}
