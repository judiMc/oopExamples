public class Calculator{
 
 
    //methods
    public double add(double arg1, double arg2) {

      return arg1 + arg2;  
    }    
    
    public double subtract(double arg1, double arg2) {
      return arg1 - arg2; 
    }
    
   public double multiply(double arg1, double arg2){
      return arg1 * arg2; 
   }
   
   public double divide(double arg1, double arg2){
        double returnValue = 0;
        if (arg2 != 0){
                 returnValue = arg1/ arg2; 
        }
      return returnValue;   
   }

}
