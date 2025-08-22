
package Lec5_Loops;

import java.util.Random;

public class RollDoubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int roll = 0;
        int dice1,dice2;
        do{
            dice1 = rand.nextInt(6)+1;
            dice2 = rand.nextInt(6)+1;
            roll++;
            System.out.println("Roll " + roll + ": " + dice1 + " and " + dice2);
        }while(dice1 !=dice2);
        System.out.println("You rolled doubles after "+ roll +" tries!");
    }
}
