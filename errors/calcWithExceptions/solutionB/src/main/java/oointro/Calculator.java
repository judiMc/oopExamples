package oointro;

public class Calculator{
    // Constants
    public static final double PI = 3.1415;

    public static final double MAX_VALUE = Double.MAX_VALUE;

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
    public double add(double toAdd) throws ValueOverflowException {
      // Throw exception if addition will result in overflow
      if (toAdd > 0 && MAX_VALUE - toAdd < storedValue) {
        throw new ValueOverflowException();
      }
      // If adding a negative number, use the subtract method because subtract
      // will detect negative overflow
      if (toAdd < 0) {
        return subtract(-toAdd);
      }
      storedValue = getValue() + toAdd;
      return getValue();
    }
    public double subtract(double toSubtract) throws ValueOverflowException {
      // Throw exception if subtraction will result in overflow
      if (toSubtract > 0 && -MAX_VALUE + toSubtract > storedValue) {
        throw new ValueOverflowException();
      }
      // If subtracting a negative number, use the add method because add
      // will detect positive overflow
      if (toSubtract < 0) {
        return add(-toSubtract);
      }
      storedValue = getValue() - toSubtract;
      return getValue();
    }

   public double multiply(double factor) throws ValueOverflowException {
      // Throw exception if multiplication will result in overflow
      if (Math.abs(factor) > 1 && MAX_VALUE / Math.abs(factor) < Math.abs(storedValue)) {
        throw new ValueOverflowException();
      }
      storedValue = getValue()*factor;
      return getValue();
   }

   public double divide(double dividend) throws DivisionByZeroException, ValueOverflowException {
        if (dividend == 0) {
            throw new DivisionByZeroException();
        } else if (Math.abs(dividend) < 1) {
            // Dividing by a number between -1 and 1 is the same as multiplying by its inverse
            // multiply is used to detect overflow
            return multiply(1 / dividend);
        } else {
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
