
package Lec5_Loops;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of number form 1 to "+n+" is: "+sum);
    }
}
