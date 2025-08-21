
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class AcademicGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter an average score: ");
        double s = Double.parseDouble(scanner.nextLine());
        if(s>=9.0 && s<=10){
            System.out.println("Excellent.");
        }
        else if(s>=8.0 && s<=8.9){
            System.out.println("Good.");
        }
        else if(s>=6.5 && s<=7.9){
            System.out.println("Fair.");
        }
        else if(s>=5.0 && s<=6.4){
            System.out.println("Average.");
        }
        else if(s<5.0){
            System.out.println("Fail.");
        }
    }
}
