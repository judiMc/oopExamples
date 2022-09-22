package oointro;

public class Runner {

  /**
   * Main Class serves as tester for song Class.
   * @param args
   */
  public static void main(String[] args) {
    Song firstSong = new Song();
    double rating = 8.7;

        firstSong.setTitle("Eensy Weensy Spider");
        firstSong.setArtist("Sharon Lois and Bram");
        firstSong.setRating(rating);

    System.out.println(firstSong);

  }
}
