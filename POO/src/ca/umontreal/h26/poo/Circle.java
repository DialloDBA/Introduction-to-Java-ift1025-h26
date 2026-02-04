package ca.umontreal.h26.poo;

public class Circle extends Forme{

	protected double pi = 3.14;
	protected double rayon;
	
	public Circle() {
		super();
	}
	@Override
	 public double aire() {
		 return this.pi * Math.pow(rayon, 2);
	 }
}
