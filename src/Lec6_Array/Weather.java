package Lec6_Array;

import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many day's temperatures? ");
        int d = Integer.parseInt(scanner.nextLine());
        int[] temp = new int[d];
        double sum = 0;
        double average;
        int count = 0;
        for (int i = 0; i < d; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temp[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + temp[i];
        }
        average = sum / d;
        for (int i = 0; i < d; i++) {
            if (temp[i] > average) {
                count = count + 1;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println();
        System.out.println(count + " days were above average.");
    }
}
