package oointro;

public class Frankenstein {
    private String cString;     // combination string of song and pet info
    private double alphaAvg;    // average number of alphanumerics
    private Song frankenSong;   // aggregate class
    private Pet frankenPet;     // aggregate class


    public void setSong(String song) {
        // takes string representation of the song and parses it
        String[] info = song.split(",");

        frankenSong = new Song();

        frankenSong.setTitle(info[0]);
        frankenSong.setArtist(info[1]);
        frankenSong.setReleaseYear(Integer.parseInt(info[2]));
        frankenSong.setRating(Double.parseDouble(info[3]));
    }

    public String getSong() {
        return frankenSong.toString();
    }

    public void setPet(String petName, String animalType, float age, String foodType) {

        frankenPet = new Pet();

        frankenPet.setName(petName);
        frankenPet.setAnimalType(animalType);
        frankenPet.setAge(age);
        frankenPet.setFoodType(foodType);
    }

    public String getPet() {
        return frankenPet.toString();
    }

    public void setString() {
        cString = getSong() + "\n" + getPet();
    }

    public String getString() {
        setString();

        return cString;
    }

    public void setAlphaAvg() {
        int totalAggStrings = 5;
        String mergeStrings = frankenPet.getFoodType() + frankenPet.getName() + frankenPet.getAnimalType() + frankenSong.getTitle() + frankenSong.getArtist();

        alphaAvg = mergeStrings.length() / totalAggStrings;
    }

    public double getAlphaAvg() {
        setAlphaAvg();

        return alphaAvg;
    }
}