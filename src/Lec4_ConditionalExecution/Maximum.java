
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number 2: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number 3: ");
        int n3 = Integer.parseInt(scanner.nextLine());
        if(n1>n2 && n1>n3){
            System.out.println("The largest number is: "+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("The largest number is: "+n2);
        }
        else if(n3>n1 && n3>n2){
            System.out.println("The largest number is: "+n3);
        }
    }
}
