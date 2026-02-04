package ca.umontreal.h26.poo.training.tp1;

public class Camion extends Vehicule {

	private double volumeM3 ;
	
	static {
		System.out.println("Vous manipuler la classe Camion qui ettend de Vehicule");
	}
	{
		System.out.println("vous etes sur le point de creer une nouvelle instance de Camion");
	}
	
	public Camion(int id , int capacite,double volumeM3, boolean autoIncrement) {
		super(id,capacite, autoIncrement);
		this.volumeM3 = volumeM3;
		Vehicule.save(this);
	}
	
	public double getVolumeM3() {
		return volumeM3;
	}

	public void setVolumeM3(double volumeM3) {
		this.volumeM3 = volumeM3;
	}

	@Override 
	public void deplacer(String destination) {
		System.out.println(this.id + "se deplace vers " + destination);
	}
	@Override
	public String getPosition() {
		return "GPS de " + this.id;
	}
	
	@Override
	public String toString() {
		return "Camion ID : "+ this.id + "Capacite "+ this.capacite + " Volume "+ this.volumeM3 ;
	}
}
