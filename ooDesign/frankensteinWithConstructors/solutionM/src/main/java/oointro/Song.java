package oointro;

class Song {

  private String title;
  private String artist;
  private Double rating;
  private int year;
  private static final int MINRATE = 0;
  private static final  int MAXRATE = 10;
  private static final int MINYEAR = 1500;
  private static final int MAXYEAR = 2022;


  public String getTitle() {
    return title;
  }

  public void setTitle(String theTitle) {
    title = theTitle;
  }

  public String getArtist() {
    return artist;
  }
  
  public void setArtist(String theArtist) {
  artist = theArtist;
  }

  public Double getRating() {
    return rating;
  }

  public void setRating(Double theRating) {
    if (theRating > MINRATE && theRating <= MAXRATE) {
      rating = theRating;
    }
  }

  public int getReleaseYear() {
    return year;
  }

  public void setReleaseYear(int theYear) {
    if (theYear > MINYEAR && theYear <= MAXYEAR) {
        year = theYear;
    } 
  }

  public String toString() {
    return title + " by " + artist + "(" + year + "). Rating: " + rating;
  }
}
