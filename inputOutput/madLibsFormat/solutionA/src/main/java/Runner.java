
public class Runner{
  public static void main(String[] args){
   /* because this program is just demonstrating the use of the StringBuilder,
   it has been written entirely in the main method.   It is not an OO program.  **/

    String word1;
    String word2;
    String word3;
    String word4;
    String word5;

    StringBuilder rhyme = new StringBuilder("1 had a little 2.\n Its 3 was 4 as 5.");

/*This next section could be written to use an Array or ArrayList of words and a loop */
    word1 = "Fran";
    word2 = "puppy";
    word3 = "ear";
    word4 = "red";
    word5 = "fire";

    int location;
    location = rhyme.lastIndexOf("1");
    rhyme.replace(location,location+1,word1);

    location = rhyme.lastIndexOf("2");
    rhyme.replace(location,location+1,word2);

    location = rhyme.lastIndexOf("3");
    rhyme.replace(location,location+1,word3);

    location = rhyme.lastIndexOf("4");
    rhyme.replace(location,location+1,word4);

    location = rhyme.lastIndexOf("5");
    rhyme.replace(location,location+1,word5);
/*the println method automatically calls the toString method of the argument
so these next two lines could be condensed into one System.out.println(rhyme) */
    String outputString = rhyme.toString();
    System.out.println(outputString);


  }
}
