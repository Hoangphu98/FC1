
package Lec4_ConditionalExecution;

import java.util.Scanner;


public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the lengths of three side: ");
        double a= Double.parseDouble(scanner.nextLine());
        double b= Double.parseDouble(scanner.nextLine());
        double c= Double.parseDouble(scanner.nextLine());
        System.out.println("Input: "+a+","+b+","+c);
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("Valid triangle");
            if(a==b&&a==c&&b==c){
                System.out.print("This is an equilateral triangle.");
            }else if(a==b||a==c||b==c){
                System.out.print("This is an isosceles triangle.");
            }else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
                System.out.print("This is a right triangle.");
            }
        }else{
          System.out.print("These sides cannot form a triangle.");
      }
    }
}
    
