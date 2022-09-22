import java.util.Scanner;

public class Runner{
  public static void main(String[] args){
   /* because this program is just demonstrating the use of the scanner,
   it has been written entirely in the main method.   It is not an OO program.  **/

   Scanner keyboardIn = new Scanner(System.in);
    String word1;
    String word2;
    String word3;
    String word4;
    String word5;

   System.out.println("Enter a name: ");
   word1 = keyboardIn.nextLine();

   System.out.println("Enter a noun: ");
   word2 = keyboardIn.nextLine();

  System.out.println("Enter a second noun: ");
   word3 = keyboardIn.nextLine();

  System.out.println("Enter a third noun: ");
   word5 = keyboardIn.nextLine();

  System.out.println("Enter a colour: ");
   word4 = keyboardIn.nextLine();
    StringBuilder rhyme = new StringBuilder("1 had a little 2.\n Its 3 was 4 as 5.");

/*This next section should really be written to use an Array or ArrayList of words and a loop */
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

    System.out.println(rhyme);
  }
}
