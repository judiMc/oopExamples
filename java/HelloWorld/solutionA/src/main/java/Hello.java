public class Hello{
    // instance variables
    private String stringMessage;
    private int integerVal;
    
    //constructor
    public Hello(int intVal, String stringVal) {
        
        stringMessage = stringVal;
        integerVal = intVal;
    }
    
    //methods
    public void printMessage() {
      System.out.println(stringMessage);
    
    }
    
    public void printNum() {
        System.out.println(integerVal);
    }

}
