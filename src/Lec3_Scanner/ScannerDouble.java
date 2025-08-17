package Lec3_Scanner;

import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number:");
        double number = scanner.nextDouble();
        System.out.println(number);
    }
}
