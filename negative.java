/**********
Name: Jules Merrill
Date: 4-10-24
Project: Negaive
***********/

public class negative{

    public static void main(String[] args){
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;

        num1 = (int)(7*(Math.random())-3);
        num2 = (int)(7*(Math.random())-3);
        num3 = (int)(7*(Math.random())-3);
        num4 = (int)(7*(Math.random())-3);


        sum = num1 + num2 + num3 + num4;

        if(sum==0){
            System.out.print("False");
        }
        else{
            System.out.print("True");
        }
        System.out.println(" ");
        System.out.println(sum);



    }
}