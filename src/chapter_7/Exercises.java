package chapter_7;

import java.util.*;

public class Exercises {

    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER SEVEN~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~~By Cosby~~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/


    /* Exercise 7.1
        (Assign grades) Write a program that reads student scores, gets the best score,
        and then assigns grades based on the following scheme:
        Grade is A if score is >= best - 10
        Grade is B if score is >= best - 20;
        Grade is C if score is >= best - 30;
        Grade is D if score is >= best - 40;
        Grade is F otherwise.
        The program prompts the user to enter the total number of students, then prompts
        the user to enter all of the scores, and concludes by displaying the grades.
     */

    public static void assignGrades(int[] grades){
        int best = 70;

        for (int i = 0; i < grades.length ; i++) {

            if(grades[i]>=(best-10)){
                System.out.println("Student number " + i + " got an A");
            }
            else if(grades[i]>=(best-20)){
                System.out.println("Student number " + i + " got an B");
            }
            else if(grades[i]>=(best-30)){
                System.out.println("Student number " + i + " got an C");
            }
            else if(grades[i]>=(best-40)){
                System.out.println("Student number " + i + " got an D");
            }
            else{
                System.out.println("Student number " + i + " got an F");
            }

        }

    }

    /* Exercise 7.8
        (Average an array) Write two overloaded methods that return the average of an
        array with the following headers:

        public static int average(int[] array)
        public static double average(double[] array)

        Write a test program that prompts the user to enter ten double values, invokes this
        method, and displays the average value.
     */


    public static int average(int[] array){
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    public static double average(double[] array){
        double result = 0.0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    /* Exercise 7.13
        (Random number chooser) Write a method that returns a random number between
        1 and 54, excluding the numbers passed in the argument. The method header is
        specified as follows:
        public static int getRandom(int... numbers)
     */

    public static int getRandom(int... numbers){

        boolean whileKey = true;
        //applying random number to rand
        int rand = (int) (Math.random() * 54) + 1;

        while(whileKey) {
            //testing 54 times if rand equals the number[i] else rand + 1
            for (int j = 0; j < 54 ; j++) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == rand) {
                        rand++;
                    }
                }
            }
            whileKey=false;
        }
        return rand;
    }



    public static void main(String[] args) {
        //Creating Scanner object, calling it scan
        Scanner scan = new Scanner(System.in);
/*
        //Prompt user to enter total number of student (scores)
        System.out.println("Input number of students");
        int numOfStudent = scan.nextInt();

        //making array in length of the number of students
        int[] grades = new int[numOfStudent];

        //Prompt user to input mentioned scores
        System.out.println("Input grades for " + numOfStudent + " Students");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scan.nextInt();
        }
        //GO METHOD!!
        assignGrades(grades);

        //----------------------------------------------------------------------------------------//

        double[] num = new double[10];
        System.out.println("Enter 10 numbers as doubles");
        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextDouble();

        }

        System.out.println("The average of the 10 numbers are = " + average(num));

        //-----------------------------------------------------------------------------------------//

*/

        //Prompts user to enter amound of numbers not to include in the random generator
        System.out.println("Enter the number of integers you want to test");
        int numOfInts = scan.nextInt();

        // making array of this length
        int[] intArray = new int[numOfInts];

        //prompts user to input said numbers
        System.out.println("Enter the int numbers you want to exclude from the random generator");
        for (int i = 0; i < numOfInts; i++) {
            intArray[i] = scan.nextInt();
        }

// Test array for the getRandom Method
// int [] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};

        //using the getRandom Method and printing it
        System.out.println("The random number generated was " + getRandom(intArray));











    }
}
