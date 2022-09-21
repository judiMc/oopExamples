package oointro;

public class Loot {

    public enum lootType {
        potion, 
        scroll, 
        wand, 
        jewellery, 
        weapon, 
        armour
    }
    private String name;
    private String description;
    private lootType type;

    public void setName(String givenName){
        name = givenName;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String givenDescription){
        description = givenDescription;
    }

    public String getDescription(){
        return description;
    }

    public void setType(String givenType){
        type = lootType.valueOf(givenType);
    }

    public lootType getType(){
        return type;
    }

    public String toString() {
        return (
            "Name: "+name
            +"\nDescription: "+description
            +"\nType: "+type
        );
    }
}
