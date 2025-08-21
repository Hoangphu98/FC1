
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = Double.parseDouble(scanner.nextLine());
        n=n<0?(-n):n;
        System.out.println("The absolute value is "+n);
    }
}
