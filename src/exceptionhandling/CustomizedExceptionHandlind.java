
package exceptionhandling;

/**
 *
 * @author SAI
 */
public class CustomizedExceptionHandlind {
    public static void main(String[] args) {
       try
       {
            System.out.println(10/0);
       } 
       catch(ArithmeticException e)
               {
                  System.out.println("/ Zero Exception occur...");
               }
      // System.out.println("Control reach to this line, hence program terminate normally...");
       finally
           {
               System.out.println("Finally blocked Executed");
               
           }
    }
  
}
