
package Lec3_Scanner;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        String n = scanner.next();
        System.out.print("Tuoi: ");
        int a = scanner.nextInt();
        System.out.println("Hello "+ n + ", you are "+ a +" years old.");
    }
    
}
