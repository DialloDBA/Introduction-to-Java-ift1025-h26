package ca.umontreal.h26.poo;

public class Question {

	public int[] valeurs ;
	
	public Question() {
		
	}
	public Question (int[] valeurs) {
		this.valeurs = new int[valeurs.length];
		System.arraycopy(valeurs, 0, this.valeurs, 0,valeurs.length);
	}
	public void show() {
		
		for(int i=0 ; i<this.valeurs.length; i++) {
			System.out.print(this.valeurs[i] + " ");
		}
	}
	
}
