package ca.umontreal.h26.poo;

public class TaskTest {

	public static void main(String[] args) {
		
		Task t1 = new Task("Description de la tache 1.");
		System.out.println(t1.description);
		
		Task t2 = new Task("Description de la tache. 2");
		System.out.println(t2.description);
		
		Task t3 = new Task("Description de la tache.3 ");
		System.out.println(t3.description);
		
		t3.complete();

	}

}
