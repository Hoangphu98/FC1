package Lec4_ConditionalExecution;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Second Number: ");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Operator: ");
        char o = scanner.next().charAt(0);
        double result;
        switch(o){
            case '+' :
                result = n1+n2;
                System.out.println(n1+" + "+n2+" = "+result);
                break;
            case '-':
                result = n1-n2;
                System.out.println(n1+" - "+n2+" = "+result);
                break;
            case '*':
                result =n1*n2;
                System.out.println(n1+" * "+n2+" = "+result);
                break;
            case '/':
                if(n2==0){
                    System.out.println("Error message.");
                }
                else{
                    result = n1/n2;
                    System.out.println(n1+" / "+n2+" = "+result);
                }
                break;
        }
    }
}
