
package Lec5_Loops;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=1;
        int count = 0;
        double sum = 0;
        double average;
        while( n != 0){
            System.out.print("Enter a number(enter 0 to stop): ");
            n = Integer.parseInt(scanner.nextLine());
            if(n!=0){
                sum += n;
                count++;
            }
        }
        if( count <= 1){
        } else {
            average = sum/count;
            System.out.println("The average is: "+average);
        }
    }
}
