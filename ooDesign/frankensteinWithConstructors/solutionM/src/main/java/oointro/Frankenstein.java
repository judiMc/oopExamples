package oointro;

public class Frankenstein {
    private String cString;     // combination string of song and pet info
    private double alphaAvg;    // average number of alphanumerics
    private Song frankenSong;   // aggregate class
    private Pet frankenPet;     // aggregate class


    // Constructor Methods
    public Frankenstein() {
        this(new Song(), new Pet()); // this uses last constructor with 2 parameters to reduce duplicate code
    }

    public Frankenstein(Song song) {
        this(song, new Pet());
    }

    public Frankenstein(Pet pet) {
        this(new Song(), pet);
    }

    public Frankenstein(Song s, Pet p) {
        frankenSong = s;
        frankenPet = p;
    }


    public void setSong(String title, String artist, int year, double rating) {

        frankenSong.setTitle(title);
        frankenSong.setArtist(artist);
        frankenSong.setReleaseYear(year);
        frankenSong.setRating(rating);
    }

    public String getSong() {
        return frankenSong.toString();
    }

    public void setPet(String petName, String animalType, double age, String foodType) {

        frankenPet.setName(petName);
        frankenPet.setAnimalType(animalType);
        frankenPet.setAge(age);
        frankenPet.setFoodType(foodType);
    }

    public String getPet() {
        return frankenPet.toString();
    }

    private void setString() {
        cString = getSong() + "\n" + getPet();
    }

    public String getString() {
        setString();

        return cString;
    }

    private void setAlphaAvg() {
        int totalAggStrings = 5;
        String mergeStrings = frankenPet.getFoodType() 
                              + frankenPet.getName() 
                              + frankenPet.getAnimalType() 
                              + frankenSong.getTitle() 
                              + frankenSong.getArtist();

        alphaAvg = mergeStrings.length() / totalAggStrings;
    }

    public double getAlphaAvg() {
        setAlphaAvg();

        return alphaAvg;
    }
}
