package inheritanceexample;

import java.util.Scanner;

public class ExecuteInheritance {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter First Value:");
        int n1 = scn.nextInt();
        
        System.out.println("Enter Second Value:");
        int n2 = scn.nextInt();
        
        Triangle t = new Triangle(n1,n2);
        t.areaOfRectangle();
        t.areaOfTriangle();
    }
}
