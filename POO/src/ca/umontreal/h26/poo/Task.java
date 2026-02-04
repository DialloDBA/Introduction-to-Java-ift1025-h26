package ca.umontreal.h26.poo;

public class Task {

	public String title ;
	public String description ;
	public boolean completed = false ;
	public static int taskCount = 0;
	
	public Task(String title , String description) {
		this.title = title;
		this.description = description;
		
		Task.taskCount++;
	}
	
	public void complete() {
		this.completed = true;
		System.out.println(this.description + " est Completée.");
	}
}
