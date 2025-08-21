package Lec4_ConditionalExecution;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a age: ");
        int a = Integer.parseInt(scanner.nextLine());
        if(0<=a && a<=12){
            System.out.println("Child.");
        }
        else if(13<=a && a<=19){
            System.out.println("Teenager.");
        }
        else if(20<=a && a<=59){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
    }
}
