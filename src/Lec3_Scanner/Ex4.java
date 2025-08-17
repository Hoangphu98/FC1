package Lec3_Scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thuc 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Nhap so thuc 2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Tong 2 so nguyen: "+((x1+x2)/2));
    }
}
