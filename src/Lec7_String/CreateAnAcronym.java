package Lec7_String;

import java.util.*;

public class CreateAnAcronym {

    public static String Acronym(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String phrase = scanner.nextLine();

        String result = Acronym(phrase);
        System.out.println(result);
    }
}
