public class Runner{
  public static void main(String[] args){
   Calculator calcDemo;
   calcDemo = new Calculator();
    double currentValue;
    currentValue = calcDemo.add(5);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.add(10);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.subtract(3);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.multiply(2);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.divide(3);
    System.out.println("Current Value is: "+ currentValue);
    

  }
}
