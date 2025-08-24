
package Lec5_Loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println("Welcome to Number Guessing Game.");
        int n;
        do{
            System.out.print("You guess: ");
            n = Integer.parseInt(scanner.nextLine());
            if(n > secret){
                System.out.println("Your number is higher than the secret number.");
            }else if(n<secret){
                System.out.println("Your number is lower than the secret number.");
            }else{
                System.out.println("Congratulations! You guessed correctly!");
            }
        }while(n!=secret);
    }
}
