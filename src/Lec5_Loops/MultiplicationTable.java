
package Lec5_Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 2 to 9: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
