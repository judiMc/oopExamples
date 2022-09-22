public class Runner{
  public static void main(String[] args){
    Hello varOne;
    Hello varTwo;
    
    varOne = new Hello(123, "Welcome");
    varTwo = new Hello(8, "Howdy");
    
    System.out.print("Variable One Message: ");
    varOne.printMessage();
    System.out.print("Variable Two Message: ");
    varTwo.printMessage();
    System.out.print("Variable One Number: ");
    varOne.printNum();
    System.out.print("Variable Two Number: ");
    varTwo.printNum();
    varOne = varTwo;
    System.out.println("Can you explain the next two lines of output?");
    System.out.print("Variable One Message: ");
    varOne.printMessage();  //can you explain the output that happens here
     System.out.print("Variable One Number: ");
    varOne.printNum();

  }
}
