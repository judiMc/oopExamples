package childfrankenstein;

public class Rocky extends Frankenstein {
    private Die die;

    public Rocky(Song s, Pet p) {
        super(s, p);
    }

    public int rollDice() {

        if (getAlphaAvg() < 1) {
            return 0;
        }

        die = new Die((int)getAlphaAvg());

        return die.roll();
    }
}