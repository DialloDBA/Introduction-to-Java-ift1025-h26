package ca.umontreal.h26.poo;

public class Interrupteur {

	private boolean position ;
	private Lampe lampe;
	public Interrupteur(Lampe lampe) {
		this.lampe = lampe;
		this.position = lampe.estAllumee();
	}
	
	public String getPosition() {
		return this.position ? "on" : "off";
		
		/** if(this.position) {
			return "on";
		}
		return "off"; **/
	}
	public void changerPosition() {
		this.lampe.setEtat();
		this.position = this.lampe.estAllumee();
	}
}
