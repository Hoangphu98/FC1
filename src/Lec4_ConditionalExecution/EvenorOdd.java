
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n % 2 == 0){
            System.out.println(n +" is an even number.");
        }
        else{
            System.out.println(n +" is an odd number");
        }
    }
}
