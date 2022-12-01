package oointro;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

  public static void printList(ArrayList<Frankenstein> frankList) {
    for (Frankenstein frank : frankList) {
      System.out.println(frank.getString() + "\n-");
    }
  }

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {

    ArrayList<Frankenstein> frankList = new ArrayList<>();



    // populate array list with frankensteins below
    Frankenstein f = new Frankenstein();
    f.setSong("Intro II", "Simon", 1999, 9.20);
    f.setPet("Mark", "Dog", 12, "Pizza");
    frankList.add(f); // add frankenstein with data

    f = new Frankenstein();
    f.setSong("Hello There Friend", "William", 2020, 9.80);
    f.setPet("Johnathon", "Shark", 50, "Fish");
    frankList.add(f); // add frankenstein with data

    frankList.add(new Frankenstein());  // add empty frankenstein

    Song s = new Song();
    s.setTitle("Intro");
    s.setArtist("Mark");
    s.setReleaseYear(1989);
    s.setRating(7.9);
    frankList.add(new Frankenstein(s));  // add frankenstein with only song data




    // Printing and sorting
    System.out.println("Lists will be sorted by their alphanumeric average");
    System.out.println("===================\n"
                     + "== UnSorted List ==\n"
                     + "===================");
    printList(frankList);

    // sort list using the comparable interface compareTo method
    Collections.sort(frankList);

    System.out.println("===================\n"
                     + "=== Sorted List ===\n"
                     + "===================");
    printList(frankList);
  }
}
