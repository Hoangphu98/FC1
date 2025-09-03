
package Lec7_String;

import java.util.*;

public class CapitalizeAProperName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fullname: ");
        String n = scanner.nextLine();
        String [] s = n.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length;i++){
            String a = s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
            sb.append(a).append(" ");
        }
        System.out.println(sb.toString());
    }
}
