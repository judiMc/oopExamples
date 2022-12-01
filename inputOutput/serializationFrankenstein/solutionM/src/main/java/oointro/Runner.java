package oointro;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {

    Frankenstein frank = new Frankenstein();
    frank.setPet("Darren", "giraffe", 2, "pizza");
    frank.setSong("Intro", "Mark", 1989, 7.9);
    System.out.println(frank.getString());

    // serialize frank object
    try {
      FileOutputStream outPutStream = new FileOutputStream("SerializedFrankenstein.ser");
      ObjectOutputStream outPutDest = new ObjectOutputStream(outPutStream);

      outPutDest.writeObject(frank);

      outPutDest.close();
      outPutStream.close();
      System.out.println("Object has been serialized");

    } catch (IOException e) {
      System.out.println(e);
    }


    // change frank and print the new values
    frank.setPet("Glen", "Shark", 14, "fish");
    frank.setSong("Bye Bye", "Jakey", 2020, 1.2);
    System.out.println("\nChange the values in frankenstein:");
    System.out.println(frank.getString() + "\n");


    // Now we can get the original serialized frank data back
    try (ObjectInputStream inputStream = new ObjectInputStream(
              new FileInputStream("SerializedFrankenstein.ser"))) {

      // set the frank object to the deserialized value
      frank = (Frankenstein) inputStream.readObject();

      System.out.println("Object has been deserialized");
      System.out.println("Objects values are now back to the original:");
      System.out.println(frank.getString());
    } catch (IOException e) {
      System.out.println(e);

    } catch (ClassNotFoundException e) {
      System.out.println(e);
    }
  }
}
