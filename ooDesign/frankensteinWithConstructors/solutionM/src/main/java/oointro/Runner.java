package oointro;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {

    Song s = new Song();
    s.setTitle("Intro");
    s.setArtist("Mark");
    s.setReleaseYear(1989);
    s.setRating(7.9);

    Frankenstein frank = new Frankenstein(s);

    frank.setPet("Darren", "giraffe", 2, "pizza");

    System.out.println("\nThe average number of alphanumerics in the aggregate classes is " + frank.getAlphaAvg());
    System.out.println("-------------------");
    System.out.println(frank.getString());
    
    System.out.println("-------------------\nWe can still change the song using the frankenstein classes methods:");
    frank.setSong("Hello", "John", 1600, 1.2); 
    System.out.println(frank.getString());
  }
}
