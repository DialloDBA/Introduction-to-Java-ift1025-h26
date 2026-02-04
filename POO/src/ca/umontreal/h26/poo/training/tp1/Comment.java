package ca.umontreal.h26.poo.training.tp1;

public class Comment extends Model {
    private String content;

    public Comment(int id, String content) {
        super(id);
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("COMMENT #" + id + " : " + content);
    }
}