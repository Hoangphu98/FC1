
package Lec7_String;

import java.util.Scanner;

public class ReverseTheWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
        String [] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]+" ");
        }
        System.out.println(sb.toString());
    }
}
