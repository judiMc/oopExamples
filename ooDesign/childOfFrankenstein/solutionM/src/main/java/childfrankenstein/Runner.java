package childfrankenstein;

public class Runner {
    public static void main(String[] args) {
        
        Song s = new Song();
        s.setTitle("Intro");
        s.setArtist("Mark");
        s.setReleaseYear(2012);
        s.setRating(8.2);

        Pet p = new Pet();
        p.setName("Simon");
        p.setAnimalType("Dog");
        p.setAge(12);
        p.setFoodType("Cheese");

        Rocky rocky = new Rocky(s, p);



        System.out.println("Rocky rolled a " + rocky.rollDice());   
    }
}