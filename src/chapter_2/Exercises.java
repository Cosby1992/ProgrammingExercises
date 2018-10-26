package chapter_2;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args){

        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER TWO~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~By Cosby~~||~~~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/

        // exercise 2.1
        //Initialing a Scanner object from the java.util package to take user input from keyboard
       Scanner scan = new Scanner(System.in);

       //Keyboard input for the variable "celsius" of the double "datatype"
        System.out.println("Input a temp. in celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = ((9.0/5.0)*celsius)+32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        // exercise 2.2
        //Scanning 2 inputs in an array that is being declared and initialized.
        System.out.println("Input radius and length of a cylinder:");
        double[] inputArray = {scan.nextDouble(),scan.nextDouble()};

        //Using array to calculate area and volume for a cylinder
        double area = inputArray[0] * inputArray[0] * Math.PI;
        double volume = area * inputArray[1];

        System.out.println("The area is " + area + "\n" +
                "The volume is " + volume);

        // exercise 2.3
        System.out.println("Input a lenght in feet: ");
        double feet = scan.nextDouble();
        double meters = feet*0.305;
        System.out.println(feet + " feet = " + meters + " meters");

        // exercise 2.4
        System.out.println("Input a weight in pounds: ");
        double pounds = scan.nextDouble();
        double kilograms = pounds*0.454;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        // exercise 2.5
        System.out.println("Input the subtotal and a gratuity rate: ");
        double[] inputArraySubAndGratuity = {scan.nextDouble(),scan.nextDouble()};

        double gratuity = (inputArraySubAndGratuity[1]/100.0)*inputArraySubAndGratuity[0];
        double total = inputArraySubAndGratuity[0]+gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        // exercise 2.6
        /*declaring integers "number" and "numberNew"
        Initializing integer "sum"
        initializing a boolean "while key", used for the while loop to decide when to exit the loop
        Making a while loop that keeps adding the last number and removing the current last number then adding
        all the last number until there is only one number left, then adding this to the existing sum.
        the inputted number can only be between 0 and 1000, defined in the if/else statement
         */
        int number;
        int numberNew;
        boolean whileKey = false;
        int sum = 0;
        while(!whileKey) {
            System.out.println("Input an integer between 0 and 1000:");
            number = scan.nextInt();

            if (number >= 0 && number <= 1000) {
                while (number>0){
                    numberNew = number % 10;
                    sum += numberNew;
                    number /= 10;
                }
                whileKey=true;
            } else {
                System.out.println("The number you typed wasn't between 0 and 1000...");
            }
        }
        System.out.println("The sum of the digits is = " + sum);

        // exercise 2.7
        System.out.println("Enter the number of minutes: ");
        int minutes = scan.nextInt();

        int years = minutes/(365*24*60);
        int days = (minutes-(years*(365*24*60)))/(60*24);

        System.out.println(minutes +" minutes is approximately " + years + " years and " + days + " days");

        // exercise 2.8
        //The current time HH:MM:SS converted from milliseconds
        System.out.println("Input offset from GMT: ");
        long offset = scan.nextInt();

        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis/1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes /60;
        long currentHour = totalHours % 24;

        System.out.println("The current time is " + (currentHour+offset) +":"+currentMinute+":"+currentSecond);







    }
}
