//TASK #2 - Add another function.

public class Function4 extends Function
{
   @Override
   public double fnValue(double x)
   {
       return (Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
      
       //where the function goes to zero, which will of course make function #3 undefined
      
   }  
   public String toString () {
   return "x^3 - 7*x^2 + 15*x – 9";
   }  
}

