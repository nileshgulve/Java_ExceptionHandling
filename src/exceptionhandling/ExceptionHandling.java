
package exceptionhandling;

/**
 *
 * @author SAI
 */
public class ExceptionHandling {
//Default Exception Handling
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       dostuff();
    }
    public static void dostuff()
    {
        domorestuff();
    }
    public static void domorestuff()
    {
      System.out.println(10/0);
    }
    
}
