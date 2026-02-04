package ca.umontreal.h26.poo;

public class Personne {

	private String nom ;
	private String prenom ;
	private int age ;
	public static int PersonneCount = 0;
	public static final int NOMBRE_MAX_YEUX = 2;
	
	public Personne (String nom,String prenom ) {
		this.nom = nom ;
		this.prenom = prenom ;
		Personne.PersonneCount++;
	}
	
	public void setAge(int age) {
		if(age < 15) {
			//System.out.println("L'age doit etre entre 15 et plus.");
			throw new IllegalArgumentException("L'age doit etre entre 15 et plus.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	
	
	
	public String fullName() {
		return this.nom.concat(" " + this.prenom);
	}
	public String fullName(String msg) {
		return msg.concat( this.nom + " " + this.prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
