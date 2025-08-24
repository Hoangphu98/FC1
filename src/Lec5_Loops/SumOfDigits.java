
package Lec5_Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum =0;
        while(n>0){
            int i =n;
            i=n%10;
            sum=sum+i;
            n=n/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
