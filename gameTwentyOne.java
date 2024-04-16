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
        int rand_three = 0;

        int d_rand_one = 0;
        int d_rand_two = 0;
        int d_rand_three = 0;
        int d_sum = 0;

        int sum = 0;
        int option;

        Scanner input = new Scanner(System.in);

        rand_one = (int)(10*(Math.random())-1);
        rand_two = (int)(10*(Math.random())-1);
        sum = rand_one + rand_two;
        System.out.println("You have a " +rand_one +" and a "+rand_two + " for a total of " + sum );
        System.out.print("Enter a 1 if you want another card or any other number for no card: ");
        option = input.nextInt();

        if(option == 1){
            rand_three = (int)(10*(Math.random())-1);
            sum = rand_one + rand_two + rand_three;
            System.out.println("You got a " + rand_three + " for a total of " + sum);
        }

        d_rand_one = (int)(10*(Math.random())-1);
        d_rand_two = (int)(10*(Math.random())-1);
        d_rand_three = (int)(10*(Math.random())-1);

        d_sum = d_rand_one + d_rand_two + d_rand_three;     
        System.out.println("The dealer has a " + d_rand_one + ", " +d_rand_two + " and, " + d_rand_three + " for a total of " + d_sum + ".");
        
        if(sum > 21){
            System.out.println("Player loses.");
        }
        else if(d_sum > 21){
            System.out.println("Player wins.");
        }
        else if(sum > d_sum){
            System.out.println("Player wins");
        }
        else if(sum < d_sum){
            System.out.println("Dealer wins");
        }
        else{
            System.out.println("Tie,");
        }

        input.close();

    }
}
