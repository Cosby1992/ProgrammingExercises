package chapter_5;

import java.text.DecimalFormat;

public class Exercises {

    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER FIVE~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~By Cosby~~~||~~~~~~~~~~~~~~~~~~~~~*/
    /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~*/

    private static DecimalFormat df1 = new DecimalFormat(".#");
    private static DecimalFormat df0 = new DecimalFormat("");

    public static void main(String[] args) {



    // exercise 5.3

    double kilogram;
    double pound;



        System.out.println("Kilograms          Pounds");
        for (kilogram=1; kilogram<10;kilogram += 2){
        pound = kilogram*2.2;
        System.out.print("  "+df0.format(kilogram) + "        |        " + df1.format(pound)+"\n");
        }
        for (kilogram=11; kilogram<100;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print(" "+df0.format(kilogram) + "        |        " + df1.format(pound)+"\n");
        }
        for (kilogram=101; kilogram<200;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print(df0.format(kilogram) + "        |        " + df1.format(pound)+"\n");
        }

    // exercise 5.-- (from the chapter)
        //Making a multiplication table in the console
        //for loops making the table and a little organizing with print and println

        System.out.println("\n\n            Multiplikation table");

        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);

        System.out.println("\n—————————————————————————————");


        for(int i = 1; i<10; i++){
        System.out.print(i + " | ");
        for(int j = 1; j<10; j++){
            System.out.printf("%4d", i*j);
            }
        System.out.println();
        }

    // exercise 5.5
        System.out.println("\nKilograms    Pounds");
        System.out.println("-----------------------");
        for (kilogram=1; kilogram<4;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print("  "+df0.format(kilogram) + "            " + df1.format(pound)+" | \n");
        }
        for (kilogram=5; kilogram<10;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print("  "+df0.format(kilogram) + "           " + df1.format(pound)+" | \n");
        }
        for (kilogram=11; kilogram<46;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print(" "+df0.format(kilogram) + "           " + df1.format(pound)+" | \n");
        }
        for (kilogram=47; kilogram<100;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print(" "+df0.format(kilogram) + "          " + df1.format(pound)+" | \n");
        }
        for (kilogram=101; kilogram<200;kilogram += 2){
            pound = kilogram*2.2;
            System.out.print(df0.format(kilogram) + "          " + df1.format(pound)+" | \n");
        }
        // TODO: 25-10-2018 Finish this piece of sh*t code exercise.. - Cosby  





    }
}
