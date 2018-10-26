package chapter_3;

import java.util.Scanner;


public class Exercises {

    public static void main(String[] args) {

        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER THREE~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~~By Cosby~~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/

        Scanner scan = new Scanner(System.in);

        // exercise 3.2
        int magicnumber1 =(int)(Math.random()*9)+1;
        int magicnumber2 =(int)(Math.random()*9)+1;



        boolean whileKey = false;
        while(!whileKey) {
            System.out.println("What is " + magicnumber1 + " + " + magicnumber2 + "?");
            int answer = scan.nextInt();

            if (answer == magicnumber1 + magicnumber2) {
                System.out.println("Wow, you are capable of adding small values");
                whileKey = true;
            } else {
                System.out.println("Wow, you are not capable of adding small values.. try again");
            }
        }


        // exercise 3.4
        //Randomly select a month 1-12
        //Print out from switch case
        int month = (int)(Math.random()*11)+1;

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        // exercise 3.8
        //Sorting numbers scanned from keyboard/user

        // Enter three numbers
        System.out.print("Input three integers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("The sorted numbers are "
                + number1 + " " + number2 + " " + number3);

        // exercise 3.15 (lottery)
        int dig1, dig2, dig3, guess1, guess2, guess3;
        dig1 = (int)(Math.random()*9);
        dig2 = (int)(Math.random()*9);
        dig3 = (int)(Math.random()*9);

        System.out.println("Input three digits:");
        guess1 = scan.nextInt();
        guess2 = scan.nextInt();
        guess3 = scan.nextInt();

        if(dig1==guess1 && dig2==guess2 && dig3==guess3){
            System.out.println("You Matched all three digits in the correct order. " +
                                "The award is $10,000.");
        }
        else if((dig1==guess1 || dig1==guess2 || dig1==guess3) && (dig2==guess1 || dig2==guess2 || dig2==guess3) && (dig3==guess1 || dig3==guess2 || dig3==guess3)){
            System.out.println("You Matched all three digits" +
                    "The award is $3,000.");
        }
        else if(dig1==guess1 || dig1==guess2 || dig1==guess3 || dig2==guess1 || dig2==guess2 || dig2==guess3 || dig3==guess1 || dig3==guess2 || dig3==guess3){
            System.out.println("You Matched a digit. " +
                    "The award is $1,000.");
        }
        else{
            System.out.println("Sorry, you didn't win jack shit :( ");
        }



    }
}
