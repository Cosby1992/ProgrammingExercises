package chapter_6;

import java.text.SimpleDateFormat;
import java.util.*;

public class Exercises {

    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER SIX~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~By Cosby~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/


    /* exercise 6.1
        (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
        n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
        Write a method with the following header that returns a pentagonal number:
        public static int getPentagonalNumber(int n)
        Write a test program that uses this method to display the first 100 pentagonal
        numbers with 10 numbers on each line.
    */
    public static int getPentagonalNumber(int n){
         int sum;

         sum = ((n*((3*n) - 1)) / (2));

        return sum;
    }

    /* exercise 6.30
        (Game: craps) Craps is a popular dice game played in casinos. Write a program
        to play a variation of the game, as follows:
        Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
        Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
        lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
        (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
        a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
        Your program acts as a single player.

     */

    //Creating a dice rolling method
    public static int rollDice(){
        int diceOne;
        int diceTwo;

        diceOne = (int) (Math.random()*6)+1;
        diceTwo = (int) (Math.random()*6)+1;

        return (diceOne+diceTwo);
    }

    //Creating a craps game and using the method rollDice withing this method
    public static void crapsGame(){

        boolean whilekey = true;

        while(whilekey){

            int sum = rollDice();

            if (sum == 2 || sum == 3 || sum == 12){
                System.out.println("You rolled " + sum + " you got craps! You lose...");
                whilekey = false;
            }
            else if(sum==7 || sum == 11){
                System.out.println("You rolled " + sum + " my goodness you won!!");
                whilekey = false;
            }
            else{
                System.out.println("Rolling again");
            }
        }
    }

    /* Exercise 6.32
        (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
        and display the number of winning games.
    */

    public static void crapsGameTenThousand(){

        int counter = 0;

        for (int i = 0; i < 10000; i++) {

            int sum = rollDice();

            boolean whilekey = true;

            while(whilekey){



                if (sum == 2 || sum == 3 || sum == 12){
                    whilekey = false;
                }
                else if(sum==7 || sum == 11){
                    counter++;
                    if(counter>0 && counter<10){
                        System.out.println(counter + "      |*^^*|    You rolled " + sum + " my goodness you won!!");
                    }
                    else if(counter>=10 && counter<100){
                        System.out.println(counter + "     |*^^*|    You rolled " + sum + " my goodness you won!!");
                    }
                    else if(counter>=100 && counter<1000){
                        System.out.println(counter + "    |*^^*|    You rolled " + sum + " my goodness you won!!");
                    }
                    else if(counter>=1000 && counter<10000){
                        System.out.println(counter + "   |*^^*|    You rolled " + sum + " my goodness you won!!");
                    }
                    else {
                        System.out.println(counter + "  |*^^*|    You rolled " + sum + " my goodness you won!!");
                    }
                    whilekey = false;
                }
                else{
                    whilekey = false;
                }
            }


        }
        System.out.println("The total number of wins is = " + counter);
    }

    /* Exercise 6.33
        (Current date and time) Invoking System.currentTimeMillis() returns the
        elapsed time in milliseconds since midnight of January 1, 1970. Write a program
        that displays the date and time.

     */

    public static void showCurrentDateAndTime(){

       /* My own try failed. So I found the solution online... ↓↓↓↓↓


        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long timeInMillis = System.currentTimeMillis();
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = timeInMillis / 1000;
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        // Compute the current hour
        long currentHour = totalHours % 24;


        //Finding the date of today
        long millisToADay = 24*60*60*1000;

        long year = ((1970*365) + (timeInMillis/millisToADay))/(365);

        long daysBeyondAYear = ((1970*365) + (timeInMillis/millisToADay))%365;


        if(daysBeyondAYear>0 && daysBeyondAYear<=31){
            String month = "January";
            long days = daysBeyondAYear;
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>31 && daysBeyondAYear<=59){
            String month = "February";
            long days = daysBeyondAYear-31;
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>59 && daysBeyondAYear<=(59+31)){
            String month = "March";
            long days = daysBeyondAYear-59;
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>(59+31) && daysBeyondAYear<=((59+31)+30)){
            String month = "April";
            long days = daysBeyondAYear-(59+31);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>((59+31)+30) && daysBeyondAYear<=(((59+31)+30)+31)){
            String month = "May";
            long days = daysBeyondAYear-((59+31)+30);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>(((59+31)+30)+31) && daysBeyondAYear<=(((59+31)+30)+31)+30){
            String month = "June";
            long days = daysBeyondAYear-(((59+31)+30)+31);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>((((59+31)+30)+31)+30) && daysBeyondAYear<=(((((59+31)+30)+31)+30)+31)){
            String month = "July";
            long days = daysBeyondAYear-((((59+31)+30)+31)+30);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>(((((59+31)+30)+31)+30)+31) && daysBeyondAYear<=((((((59+31)+30)+31)+30)+31)+31)){
            String month = "August";
            long days = daysBeyondAYear-(((((59+31)+30)+31)+30)+31);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>((((((59+31)+30)+31)+30)+31)+31) && daysBeyondAYear<=(((((((59+31)+30)+31)+30)+31)+31)+30)){
            String month = "September";
            long days = daysBeyondAYear-((((((59+31)+30)+31)+30)+31)+31);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>(((((((59+31)+30)+31)+30)+31)+31)+30) && daysBeyondAYear<=((((((((59+31)+30)+31)+30)+31)+31)+30)+31)){
            String month = "October";
            long days = daysBeyondAYear-(((((((59+31)+30)+31)+30)+31)+31)+30);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>((((((((59+31)+30)+31)+30)+31)+31)+30)+31) && daysBeyondAYear<=(((((((((59+31)+30)+31)+30)+31)+31)+30)+31)+30)){
            String month = "November";
            long days = daysBeyondAYear-((((((((59+31)+30)+31)+30)+31)+31)+30)+31);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else if(daysBeyondAYear>(((((((((59+31)+30)+31)+30)+31)+31)+30)+31)+30) && daysBeyondAYear<=((((((((((59+31)+30)+31)+30)+31)+31)+30)+31)+30)+31)){
            String month = "December";
            long days = daysBeyondAYear-(((((((((59+31)+30)+31)+30)+31)+31)+30)+31)+30);
            System.out.println("The current time and date is " + days + ". " + month + " " + year);
        }
        else{
            System.out.println("Wasn't able to calculate the current date");
        }



        System.out.println();
        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");

        */

        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy HH:mm");
        Date resultdate = new Date(yourmilliseconds);
        System.out.println(sdf.format(resultdate));
    }

    /*
        (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
        in which all sides are of the same length and all angles have the same degree (i.e.,
        the polygon is both equilateral and equiangular). The formula for computing the
        area of a regular polygon is: Area = (n * s^2) / (4 * tan(PI/n))

        Write a method that returns the area of a regular polygon using the following header:
        public static double area(int n, double side)
        Write a main method that prompts the user to enter the number of sides and the
        side of a regular polygon and displays its area.
     */

    public static double area(int n, double side){

        return (n * Math.pow(side,2.0)) / (4 * Math.tan(Math.PI/n));
    }







    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(getPentagonalNumber(5));


        //for loop printing pentagonal numbers for n=1 to n=100 with 10 number in each row in the console
        int n = 1;

        for (int i = 0; i < 100; i++) {
            if (n%10 != 0) {
                System.out.print(getPentagonalNumber(n)+ " + ");
                n++;
            }
            else{
                System.out.println(getPentagonalNumber(n)+ " + ");
                n++;
            }
        }

        //Playing the craps game from method four times (showed in console)
        crapsGame();
        crapsGame();
        crapsGame();
        crapsGame();

        //Running method (plays craps ten thousand times, and prints number of wins)
        System.out.println();
        crapsGameTenThousand();

        //Shows the current date and time
        System.out.println();
        showCurrentDateAndTime();

        //Takes two inputs and insert these as arguments in a method
        System.out.println("Enter the number of sides and the side of a regular polygon");
        int numberOfSides = scan.nextInt();
        double side = scan.nextDouble();

        //Printing out the result in console
        System.out.println(area(numberOfSides,side));

    }





}
