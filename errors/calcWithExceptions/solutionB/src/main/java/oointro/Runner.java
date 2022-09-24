package oointro;

public class Runner{
  public static void main(String[] args){
    // Test 1: add, subtract, multiply, divide all work normally
    System.out.println("Testing add, subtract, multiply, divide with normal operations");
    Calculator calcOne = new Calculator();

    System.out.println("Testing add");
    calcOne.add(500);
    calcOne.add(-600);

    System.out.println("Testing subtract");
    calcOne.subtract(200);
    calcOne.subtract(-200);

    System.out.println("Testing multiply");
    calcOne.multiply(-3);
    calcOne.multiply(1/2);

    System.out.println("Testing divide");
    calcOne.divide(5);
    calcOne.divide(-0.5);

    // Test 2: Division by zero
    System.out.println("Testing division by zero");
    Calculator calcTwo = new Calculator();
    calcTwo.add(100);
    try {
      calcTwo.divide(0.0);
    } catch (DivisionByZeroException e) {
      System.out.println("Division by zero caught");
    }

    // Test 3: Overflows
    Calculator calcThree;
    
    System.out.println("Testing addition positive overflow");
    calcThree = new Calculator();
    calcThree.add(Calculator.MAX_VALUE);
    try {
      calcThree.add(Calculator.MAX_VALUE / 10e9);
    } catch (ValueOverflowException e) {
      System.out.println("Addition overflow caught");
    }

    System.out.println("Testing addition negative overflow");
    calcThree = new Calculator();
    calcThree.add(-Calculator.MAX_VALUE);
    try {
      calcThree.add(-Calculator.MAX_VALUE / 10e9);
    } catch (ValueOverflowException e) {
      System.out.println("Addition overflow caught");
    }

    System.out.println("Testing subtraction negative overflow");
    calcThree = new Calculator();
    calcThree.subtract(Calculator.MAX_VALUE);
    try {
      calcThree.subtract(Calculator.MAX_VALUE / 10e9);
    } catch (ValueOverflowException e) {
      System.out.println("Subtraction overflow caught");
    }

    System.out.println("Testing subtraction positive overflow");
    calcThree = new Calculator();
    calcThree.subtract(-Calculator.MAX_VALUE);
    try {
      calcThree.subtract(-Calculator.MAX_VALUE / 10e9);
    } catch (ValueOverflowException e) {
      System.out.println("Subtraction overflow caught");
    }

    System.out.println("Testing multiplication overflow");
    calcThree = new Calculator();
    calcThree.add(Calculator.MAX_VALUE);
    try {
      calcThree.multiply(1.01);
    } catch (ValueOverflowException e) {
      System.out.println("Multiplication overflow caught");
    }
  }
}
