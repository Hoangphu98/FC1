package Lec3_Scanner;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu 1: ");
        int x1 = scanner.nextInt();
        System.out.print("Nhap so nguyen thu 2: ");
        int x2 = scanner.nextInt();
        System.out.println("Tong 2 so nguyen: "+(x1+x2));
    }
}
