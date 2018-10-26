package chapter_4;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER FOUR~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~By Cosby~~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/

        Scanner scan = new Scanner(System.in);

        // exercise 4.1
        /*  (Geometry: area of a pentagon) Write a program that prompts the user to enter
            the length from the center of a pentagon to a vertex and computes the area of the
            pentagon*/

        double r,s, area;
        System.out.println("Input the length for center to a vertex of a pentagon:");
        r = scan.nextDouble();

        s = 2.0*r*Math.sin(Math.PI/5.0);

        area = (5.0*Math.pow(s,2.0))/(4.0*Math.tan(Math.PI/5.0));

        System.out.println("The area of the pentagon is " + area);


        // exercise 4.8
        /*  (Find the character of an ASCII code) Write a program that receives an ASCII code
            (an integer between 0 and 127) and displays its character.*/
        boolean whileKey=false;
        while(!whileKey) {
            System.out.println("Input integer between 0 and 127:");
            int asciiChar = scan.nextInt();

            if (asciiChar <= 127 && asciiChar >= 0) {
                char charAscii = (char) asciiChar;
                System.out.println("The ASCII character for the value " + asciiChar + " is " + "'"+charAscii+"'");
                whileKey=true;
            } else {
                System.out.println("you didn't input a valid number");
            }
        }

        // exercise 4.11
        /*  (Decimal to hex) Write a program that prompts the user to enter an integer between
            0 and 15 and displays its corresponding hex number. */

        int decimal;

        whileKey = false;

        while(!whileKey) {
            System.out.println("Input decimal value 0 and 15");
            decimal = scan.nextInt();

            switch (decimal) {
                case 0:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 1:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 2:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 3:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 4:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 5:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 6:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 7:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 8:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 9:
                    System.out.println("The hexadecimal value of " + decimal + " is " + decimal);
                    whileKey = true;
                    break;
                case 10:
                    System.out.println("The hexadecimal value of " + decimal + " is A");
                    whileKey = true;
                    break;
                case 11:
                    System.out.println("The hexadecimal value of " + decimal + " is B");
                    whileKey = true;
                    break;
                case 12:
                    System.out.println("The hexadecimal value of " + decimal + " is C");
                    whileKey = true;
                    break;
                case 13:
                    System.out.println("The hexadecimal value of " + decimal + " is D");
                    whileKey = true;
                    break;
                case 14:
                    System.out.println("The hexadecimal value of " + decimal + " is E");
                    whileKey = true;
                    break;
                case 15:
                    System.out.println("The hexadecimal value of " + decimal + " is F");
                    whileKey = true;
                    break;
                default:
                    System.out.println(decimal + " is an invalid value..");
            }
        }

        // exercise 4.11
        /*  (Phone key pads) The international standard letter/number mapping found on the
            telephone is shown below: */

        String ch;
        System.out.println("Input a characther: ");
        ch = scan.nextLine();

        if(ch.equalsIgnoreCase("a")
         ||ch.equalsIgnoreCase("b")
         ||ch.equalsIgnoreCase("c")){
            System.out.println("The corresponding number is 2");
        }
        else if(ch.equalsIgnoreCase("d")
         ||ch.equalsIgnoreCase("e")
         ||ch.equalsIgnoreCase("f")){
            System.out.println("The corresponding number is 3");
        }
        else if(ch.equalsIgnoreCase("g")
         ||ch.equalsIgnoreCase("h")
         ||ch.equalsIgnoreCase("i")){
            System.out.println("The corresponding number is 4");
        }
        else if(ch.equalsIgnoreCase("j")
         ||ch.equalsIgnoreCase("k")
         ||ch.equalsIgnoreCase("l")){
            System.out.println("The corresponding number is 5");
        }
        else if(ch.equalsIgnoreCase("m")
         ||ch.equalsIgnoreCase("n")
         ||ch.equalsIgnoreCase("o")){
            System.out.println("The corresponding number is 6");
        }
        else if(ch.equalsIgnoreCase("p")
         ||ch.equalsIgnoreCase("q")
         ||ch.equalsIgnoreCase("r")
         ||ch.equalsIgnoreCase("s")){
            System.out.println("The corresponding number is 7");
        }
        else if(ch.equalsIgnoreCase("t")
         ||ch.equalsIgnoreCase("u")
         ||ch.equalsIgnoreCase("v")){
            System.out.println("The corresponding number is 8");
        }
        else if(ch.equalsIgnoreCase("w")
         ||ch.equalsIgnoreCase("x")
         ||ch.equalsIgnoreCase("y")
         ||ch.equalsIgnoreCase("z")){
            System.out.println("The corresponding number is 9");
        }
        else{
            System.out.println("Invalid input..");
        }







    }
}
