package ca.umontreal.h26.poo;

public class Carre extends Forme {

	protected int cote ;
	
	@Override
	public double aire() {
		return (double)Math.pow(this.cote,2);
	}
}
