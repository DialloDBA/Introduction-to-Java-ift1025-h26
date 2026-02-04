package ca.umontreal.h26.poo.training.tp1;

import java.util.ArrayList;

public abstract class Vehicule implements Localisable,AutoIncrementId{

	protected int id ;
	protected int capacite ;
	protected boolean autoIncrement = false ;
	protected static ArrayList<Vehicule> vehicules = new ArrayList<>();
	
	public Vehicule (int id, int capacite, boolean autoIncrement) {
		
		this.capacite = capacite;
		this.autoIncrement = autoIncrement;
		
		if(autoIncrement) {
			this.id = this.autoIncrement();
		}else {
			this.id = id ;
		}
	}
	
	public void afficheInfo() {
		System.out.println("ID : "+ this.id + " Capacite : " + this.capacite);
	}
	
	public abstract void deplacer(String destination) ;
	
	public int autoIncrement() {
		return Vehicule.vehicules.size() + 1;
	}
	
	protected static void save(Vehicule v) {
		Vehicule.vehicules.add(v);
	}
	
}
