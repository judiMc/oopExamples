package oointro;

public class Pet {
    private String foodType;
    private String name;
    private String animalType;
    private float age;

    public void setAnimalType(String animal) {
        animalType = animal;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String petName) {
        name = petName;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(float petAge) {
        age = petAge;
    }

    public float getAge() {
        return age;
    }

    public void setFoodType(String food) {
        foodType = food;
    }

    public String getFoodType() {
        return foodType;
    }

    public void eat() {
        System.out.println("I am happily munching on " + foodType);
    }

    public String toString() {
        return name + " the " + animalType + " is " + age + " years old and loves to eat " + foodType;
    }
}