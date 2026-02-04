package ca.umontreal.h26.poo;

public class Personne {

	private String name ;
	private int age ;
	public static int PersonneCount = 0;
	
	public Personne (String name ) {
		this.name = name ;
	}
	
	public void setAge(int age) {
		if(age < 15) {
			System.out.println("L'age doit etre entre 15 et plus.");
		}else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
