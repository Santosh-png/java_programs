package exceptionhandlingexamples;

import java.util.InputMismatchException;

public class MainExcetionHandling {
   
    public static void main(String[] args) {
        try{
            IndividualExceptionHandling ie = new IndividualExceptionHandling();
            ie.setValues();
            System.out.println(ie.division());
            
        }catch(InputMismatchException e){
            System.out.println("This is InputMismatchException."+e.getMessage());

            
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
