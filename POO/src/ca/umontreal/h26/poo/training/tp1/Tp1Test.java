package ca.umontreal.h26.poo.training.tp1;

public class Tp1Test {

	public static void main(String[] args) {
		
		/** Vehicule v = new Velo(12,10,"type",false);
		
		Vehicule c = new Camion(120,10,120,true);
		
		Vehicule cc = new Camion(120,20,1000,true);
		
		System.out.println(v);
		System.out.println(c);
		System.out.println(cc); **/
		
		Post post = new Post(1, "Mon premier Post");
		Model comment = new Comment(1, "Mon premier Commentaire");
		
		post.addRelation(comment);
		
		post.save();
		comment.save();
		
		post.setTitle(" hello post");
		post.update();
		for (Model model : Model.all()) {
			model.display();
		}
	}

}
