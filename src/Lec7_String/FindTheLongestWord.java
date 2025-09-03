
package Lec7_String;

import java.util.*;

public class FindTheLongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");       
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word; 
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = findLongestWord(sentence);
        System.out.println( result);
    }
}
