public class Calculator{
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
    
    
    
    //methods
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

}
