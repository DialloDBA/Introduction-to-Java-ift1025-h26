package ca.umontreal.h26.poo;

public class Triangle extends Forme {

	protected int base ;
	protected int hauteur;
	
	public Triangle() {
		
	}
	@Override
	public double aire() {
		return (double)(this.base * this.hauteur * 0.5);
	}
}
