import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Sentence 
  {
    private ArrayList<Word> myWords;
    private String theSentence;

    public Sentence (String inputString)
    {
        theSentence = inputString;
        myWords = new ArrayList<Word>();
       StringTokenizer tokens = new StringTokenizer(inputString);
       while (tokens.hasMoreTokens())
       {

           myWords.add(new Word(tokens.nextToken()));
       }
    }
    public String getSentence(){
      return theSentence;
    }

    public String pigLatinSentence()
    {
        String plSentence = "";
        Iterator<Word> it = myWords.iterator();
        while (it.hasNext())
        {
            plSentence = plSentence + "  " + it.next().pigLatinMe();
        }
        return plSentence;

    }

}