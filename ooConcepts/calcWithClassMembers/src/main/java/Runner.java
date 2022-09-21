public class Runner{
  public static void main(String[] args){
     double currentValue;
  //testing the static methods and constant
    currentValue = Calculator.PI;
    System.out.println(currentValue);

    currentValue = Calculator.squared(4);
    System.out.println(currentValue);

    currentValue = Calculator.largest(12, 98);
    System.out.println(currentValue);

  //testing new instance methods
   Calculator calcOne;
   Calculator calcTwo;
   calcOne = new Calculator();
   calcTwo = new Calculator();

    currentValue = calcOne.addToRegister(0);
    System.out.println(currentValue);

    currentValue = calcOne.addToRegister(13);
    System.out.println(currentValue);

    currentValue = calcTwo.addToRegister(2);
    System.out.println(currentValue);
    calcTwo.zeroRegister();

    currentValue = calcOne.addToRegister(8);
    System.out.println(currentValue);
  }
}
