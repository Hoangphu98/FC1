
package Lec4_ConditionalExecution;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu 2-8: ");
        int t = Integer.parseInt(scanner.nextLine());
        switch(t){
            case 2:System.out.println("Thu "+t);break;
            case 3:System.out.println("Thu "+t);break;
            case 4:System.out.println("Thu "+t);break;
            case 5:System.out.println("Thu "+t);break;
            case 6:System.out.println("Thu "+t);break;
            case 7:System.out.println("Thu "+t);break;
            case 8:System.out.println("Chu nhat");break;
            default:System.out.println("Nhap sai");
        }
    }
}
