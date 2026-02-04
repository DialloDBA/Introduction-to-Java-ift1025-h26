package ca.umontreal.h26.poo;

public class PersonneTest {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Diallo","Abdourahamane");
		
		try {
			p1.setAge(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		System.out.println(p1.fullName());
		
		System.out.println(p1.fullName("hello, je suis "));
		
		
	}
}
