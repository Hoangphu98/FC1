
package Lec3_Scanner;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean: ");
        Boolean b = scanner.nextBoolean();
        System.out.println(b);
    }
}
