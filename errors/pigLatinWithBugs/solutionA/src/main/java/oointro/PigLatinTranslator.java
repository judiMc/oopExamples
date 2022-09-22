

public class PigLatinTranslator {

    private Sentence myText;
    
    public PigLatinTranslator (String text)
    {
        myText = new Sentence(text);
    }
    public String pigLatin()
    {
        System.out.println(myText.getSentence());
        return myText.pigLatinSentence();
    }
 


}
