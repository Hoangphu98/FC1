
package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class FilterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int a = scanner.nextInt();
        int [] Array = new int[a];
        for (int i=0;i<a;i++){
            Array[i]= scanner.nextInt();
        }
        ArrayList <Integer> number= new ArrayList<>();
        for (int i=0;i<a;i++){
            if(Array[i]%2==0){
                number.add(Array[i]);
            }
        }
        System.out.println("ArrayList containing: "+Arrays.toString(number.toArray()));
    }
}
