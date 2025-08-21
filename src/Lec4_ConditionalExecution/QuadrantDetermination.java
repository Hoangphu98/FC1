
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x,y: ");
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        if(x>0 && y>0){
            System.out.println("The point is in the 1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("The point is in the 2nd quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("The point is in the 3rd quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("The point is in the 4th quadrant");
        }
        else if( x==0 || y==0){
            System.out.println("The point is on a axis");
        }
    }
}
