package exceptionhandlingexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IndividualExceptionHandling {
    int first_number,second_number;
    void setValues(){
        Scanner scn = new Scanner(System.in);
            System.out.println("Enter First Number:");
            if (!scn.hasNextInt()) {
                scn.nextLine();  // Consume invalid input
                throw new InputMismatchException("Please enter a valid integer.");
            }
            first_number = scn.nextInt();
            
            System.out.println("Enter Second Number:");
            if (!scn.hasNextInt()) {
                scn.nextLine();  // Consume invalid input
                throw new InputMismatchException("Please enter a valid integer.");
            }
            second_number = scn.nextInt();
    }
    int division(){
        if(second_number == 0){
            throw new ArithmeticException("Zero divisible case. That is not possible");
        }else{
            return first_number/second_number;
        }
    }
}
