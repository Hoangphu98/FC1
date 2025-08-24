
package Lec5_Loops;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer N: ");
        int n = Integer.parseInt(scanner.nextLine());
        int f = 1;
        for(int i=n;i>0;i--){
            f=f*i;           
        }
        System.out.println("The Factorial of "+n+" is: "+f);
    }
}
