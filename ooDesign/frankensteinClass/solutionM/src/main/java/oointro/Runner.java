package oointro;
import java.util.*;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {

    Frankenstein frank = new Frankenstein();

    // give in order separated by commas title,artist,releaseyear,rating(0-10)
    // using this to parse then parsing the string in the Frankenstein class
    frank.setSong("Intro,Mark,1999,7.8");

    System.out.println(frank.getSong());

    // name, animaltype, age, food type
    frank.setPet("Jake", "frog", 12.0f , "hot dogs");


    System.out.println("\nThe average number of alphanumerics in the aggregate classes is " + frank.getAlphaAvg());

    System.out.println("\n" + frank.getString());

  }
}
