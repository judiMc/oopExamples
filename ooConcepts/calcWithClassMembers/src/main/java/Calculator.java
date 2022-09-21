public class Calculator{
    // Constants
    public static final double PI = 3.1415;

    //class variable
    private static double register = 0;

    // instance variables
    private double storedValue;

    //constructor
    public Calculator() {
        storedValue = 0;
    }

    //accessor
    public double getValue(){
        return storedValue;
    }



    //instance methods
    public double add(double toAdd) {
      storedValue = getValue() + toAdd;
      return getValue();
    }
    public double subtract(double toSubtract) {
      storedValue = getValue() - toSubtract;
      return getValue();
    }

   public double multiply(double factor){
      storedValue = getValue()*factor;
      return getValue();
   }

   public double divide(double dividend){
        if (dividend != 0){
            storedValue = getValue()/dividend;
        }
        return getValue();
   }

   public double addToRegister(double toAdd){
       register = register + toAdd;
       return register;
   }
   public void zeroRegister(){
     register = 0;

   }


   //class methods
   public static double largest(double first, double second){
         double largest = first;
         if (second > largest){
            largest = second;
         }
         return largest;
   }

   public static double squared(double toSquare){
         return toSquare*toSquare;
   }


}
