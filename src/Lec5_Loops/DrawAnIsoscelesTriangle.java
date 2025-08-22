
package Lec5_Loops;

import java.util.Scanner;

public class DrawAnIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h = Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=h;i++){            
            for(int j=0;j<h-i;j++){                
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
