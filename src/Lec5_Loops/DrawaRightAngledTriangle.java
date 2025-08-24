
package Lec5_Loops;

import java.util.Scanner;

public class DrawaRightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height h of a right-angled triangle: ");
        int h = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=h;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
