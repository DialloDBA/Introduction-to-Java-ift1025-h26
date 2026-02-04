package ca.umontreal.h26.poo.training.tp1;


public class Post extends Model {
 private String title;

 public Post(int id, String title) {
     super(id);
     this.title = title;
 }

 public String getTitle() {
	return title;
}

 public void setTitle(String title) {
	this.title = title;
 }

 @Override
 public String toString() {
     return "POST #" + this.id + " : " + this.title;
 }
 
 @Override
 public void display() {
     System.out.println("=== POST: " + this.title + " ===");
     for (Model m : this.relations) {
         System.out.print("  -> ");
         m.display(); 
     }
 }
}

