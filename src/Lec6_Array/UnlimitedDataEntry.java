
package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class UnlimitedDataEntry {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int n=0 ;
        System.out.print("Enter an integer: ");
        while(n!=-1){
            n=scanner.nextInt();
            if(n!=-1){
            sum=sum+n;
            number.add(n);
            }
        }
        System.out.println("Numbers entered: "+Arrays.toString(number.toArray()));
        System.out.println("The sum is: "+sum);
    }
}
