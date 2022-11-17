package childfrankenstein;

import java.util.Random;

public class Die {
    private int numFaces;
    private int faceValue;
    private Random random;

    public Die() {
        this(6);
    }

    public Die(int numberFaces) {
        numFaces = numberFaces;
        random = new Random();
    }

    public int roll() {
        System.out.println("Rolling Dice");

        setFaceValue(random.nextInt(numFaces) + 1);

        return getFaceValue();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int value) {
        faceValue = value;
    }
}