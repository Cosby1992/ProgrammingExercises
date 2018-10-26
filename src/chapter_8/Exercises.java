package chapter_8;

import java.util.*;

public class Exercises {


    public static void showMatrix(int[][] matrix) {

        System.out.print("------------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\nRow " + i + " | ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n------------------------------------------------");
    }

    /*
    Method used to obtain an 3 by 4 2 dim. array.  taken from the book
     */

    public static double[][] getArray() {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);
        // Enter array values
        double[][] m = new double[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = scan.nextInt();
        return m;
    }


   /*
    (Sum elements column by column) Write a method that returns the sum of all the
    elements in a specified column in a matrix using the following header:
    public static double sumColumn(double[][] m, int columnIndex)

    // I could not get it to work with this header ↑↑↑ So I used my own way... and the internet.. little mix
    */

    public static void sumColumn(double[][] array) {

        int size = array[0].length; // Replace it with the size of maximum length inner array
        double temp[] = new double[size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[j] += array[i][j];  // Note that, I am adding to `temp[j]`.
            }
        }

        System.out.println("Sum of the elements at column 0 is " + temp[0]);
        System.out.println("Sum of the elements at column 1 is " + temp[1]);
        System.out.println("Sum of the elements at column 2 is " + temp[2]);
        System.out.println("Sum of the elements at column 3 is " + temp[3]);
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40, 48, 49, 46,},
                {20, 30, 40, 50, 54, 48, 64,},
                {30, 40, 50, 60, 18, 46, 48},
                {40, 50, 60, 70, 95, 65, 58}};


        showMatrix(matrix);


        double[][] m = getArray(); // Get an array

        sumColumn(m);
    }
}