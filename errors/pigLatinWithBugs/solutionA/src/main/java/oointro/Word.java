public class Word 
  {
    
    private String myString;
 
    private enum BeginsWith { BLEND, VOWEL, CONSONANT};
    
    public Word (String theWord)
    {
        myString = theWord;
    }
    public String pigLatinMe()
    {
        BeginsWith myState = beginning(myString);
       if (myState == BeginsWith.BLEND)
           return myString.substring(2) + myString.substring(0,2) + "ay";
       if (myState == BeginsWith.VOWEL)
           return myString + "ay";
       else return myString.substring(1)+ myString.substring(0,1) + "ay";      
    }
    private BeginsWith beginning(String theString)
    {
        Character char1 = theString.charAt(0);
        Character char2 = theString.charAt(1);
        BeginsWith state = null;
        if ( startsWithVowel(char1.toString()) )
            state = BeginsWith.VOWEL;
        else if (startsWithBlend(char1.toString() + char2.toString()))
            state = BeginsWith.BLEND;
        else state = BeginsWith.CONSONANT;           
        return state;
    }
    private boolean startsWithVowel(String letters)
    {
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0; i < vowels.length; i++)
        {
            if (letters.charAt(0) == vowels[i])
                return true;
        }
        return false;
    }

    private boolean startsWithBlend(String letters)
    {
        String[] blends = {"bl","cl","tr","st","fr", "dr", "th","br"};
        for (int i=0; i< blends.length; i++)
        {
            if (letters.equalsIgnoreCase(blends[i]))
                return true;         
        }
        return false;
        
    }
}

