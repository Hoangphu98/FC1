package Lec7_String;

import java.util.*;

public class FormatANumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        StringBuilder sb = new StringBuilder(number);
        int length = sb.length();
        for (int i = length - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        System.out.println(sb.toString());
    }
}
