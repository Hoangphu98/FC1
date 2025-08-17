package Lec3_Scanner;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap cac tu : ");
        while(scanner.hasNext()){
            String w = scanner.next();
            System.out.println(w);
        }
        
    }
}
