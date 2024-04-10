/******
Name: Jules Merril
Date: 4-10-24
Project: Twenty One Game
******/

import java.util.*;


public class gameTwentyOne {
    public static void main(String[] args){
        int rand_one = 0;
        int rand_two = 0;
        int sum = 0;
        int option;

        Scanner input = new Scanner(System.in);

        rand_one = (int)(10*(Math.random())-1);
        rand_two = (int)(10*(Math.random())-1);
        sum = rand_one + rand_two;
        System.out.println("You have a " +rand_one +" and a "+rand_two + " for a total of " + sum );
        System.out.println("Enter a 1 if you want another card or any other number for no card: ");
        option = input.nextInt();

        if(option == 0){
            rand_two = (int)(10*(Math.random())-1);
            System.out.println("You have a " +rand_one +" and a "+rand_two + " for a total of " + sum );
        }





        input.close();

    }
}
