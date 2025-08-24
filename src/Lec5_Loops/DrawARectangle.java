
package Lec5_Loops;

import java.util.Scanner;

public class DrawARectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of a rectangle: ");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the width of a rectangle: ");
        int w = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

