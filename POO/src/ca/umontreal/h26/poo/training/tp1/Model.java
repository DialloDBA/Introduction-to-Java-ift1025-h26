package ca.umontreal.h26.poo.training.tp1;

import java.util.ArrayList;
import java.util.List;

public abstract class Model {

    protected int id;
    protected int positionInList;
    protected static List<Model> database = new ArrayList<>();
    protected List<Model> relations;
    
    public Model (int id) {
        this.id = id;
        this.relations = new ArrayList<>(); 
    }
    
    public void save() {
        if(!Model.database.contains(this)) {
            this.positionInList = Model.database.size(); 
            Model.database.add(this);
            System.out.println("DB Insertion de " + this.getClass().getSimpleName() + " (ID: " + id + ")");
        } else {
            this.update();
        }
    }

    public void update() {
        Model.database.set(this.positionInList, this);
        System.out.println("[DB] Mise à jour de : " + this.getClass().getSimpleName() + " à l'index " + positionInList);
    }

    public void addRelation(Model m) {
        this.relations.add(m);
    }
    
    public static List<Model> all(){
        return Model.database;
    }

    public abstract void display();
}