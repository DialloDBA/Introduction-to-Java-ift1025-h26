package ca.umontreal.h26.poo.training.tp1;

public class Velo extends Vehicule{
	
	private String typePneu;
	public Velo(int id, int capacite, String typePneu, boolean autoIncrement) {
		super(id, capacite,autoIncrement);
		this.typePneu = typePneu ;
		Vehicule.save(this);
	}
	@Override
	public void deplacer(String destination) {
		System.out.println(this.id + "Se depalce vers " + destination);
	}
	@Override
	public String getPosition() {
		return "position GPS de "+ this.id;
	}
	public String getTypePneu() {
		return this.typePneu ;
	}
	public void setTypePneu(String typePneu) {
		this.typePneu = typePneu;
	}
	
	@Override 
	public String toString() {
		return "velo ID : "+ this.id + "Capacite "+ this.capacite + " type Pneu "+ this.typePneu ;
	}
	
}
