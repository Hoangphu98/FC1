package Lec7_String;

import java.util.*;

public class StringCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count = count + 1;
            } else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
