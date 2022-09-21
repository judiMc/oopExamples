package oointro;

import java.util.ArrayList;
// import oointro.*;

public class VegetableSoup {
    ArrayList <Food> ingredients = new ArrayList <Food> ();
    String smells = "";
    String tastes = "";

    public void addToSoup(Food toAdd) {
        ingredients.add(toAdd);
    }

    public String smellTheSoup() {
        for(Food smell: ingredients){
            smells = smells + (smell.smells() + "\n");
        }
        return smells;
    }

    public String tasteTheSoup() {
        for(Food taste: ingredients){
            tastes = tastes + (taste.tastes() + "\n");
        }
        return tastes;
    }
}
