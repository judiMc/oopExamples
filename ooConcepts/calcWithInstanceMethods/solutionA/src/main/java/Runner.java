public class Runner{
  public static void main(String[] args){
   Calculator calcDemo;
   calcDemo = new Calculator();
    double currentValue;
    currentValue = calcDemo.add(5, 0);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.add(currentValue, 10);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.subtract(currentValue, 3);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.multiply(currentValue, 2);
    System.out.println("Current Value is: "+ currentValue);
     currentValue = calcDemo.divide(currentValue, 3);
    System.out.println("Current Value is: "+ currentValue);
    

  }
}
