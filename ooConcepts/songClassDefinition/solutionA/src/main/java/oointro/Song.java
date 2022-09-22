package oointro;

class Song {

  /**
   * Attributes.
   */
  private String title;
  private String artist;
  private Double rating;
  private int year;
  private  static final int MINRATE = 0;
  private static final  int MAXRATE = 10;



  /**
   * Accessor for title.
   * @return title
   */
  public String getTitle() {
    return title;
  }

 /**
   * Mutator for title.
    @param theTitle
   */
  public void setTitle(String theTitle) {
    title = theTitle;
  }

  /**
   * Accessor for artist.
   * @return artis
   */
  public String getArtist() {
    return artist;
  }
    /**
   * Mutator for artist.
    @param theArtist
   */
  public void setArtist(String theArtist) {
  artist = theArtist;
  }

  /**
   * Accessor for rating.
   * @return rating
   */
  public Double getRating() {
    return rating;
  }

      /**
   * Mutator for rating.
   * @param theRating
   */
   public void setRating(Double theRating) {
    if (theRating > MINRATE && theRating <= MAXRATE) {
        rating = theRating;
       }
   }

  /**
   * Accessor for year.
   * @return bpm
   */
  public int getReleaseYear() {
    return year;
  }

      /**
   * Mutator for release year.
    @param theYear
   */

   public void setReleaseYear(int theYear) {
   year = theYear;   //should be some checking on range for the year

   }


  /**
   * toString Method.
   * @return title
   */
  public String toString() {
    return title + " by " + artist + "(" + year + "). Rating: " + rating;
  }
}
