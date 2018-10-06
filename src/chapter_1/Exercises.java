package chapter_1;

public class Exercises {

    public static void main(String[] args) {

        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~CHAPTER ONE~||~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~By Cosby~~||~~~~~~~~~~~~~~~~~~~*/
        /*~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~*/
        
        // exercise 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun.");

        // exercise 1.2
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        // exercise 1.3
        System.out.println( "    J    A  V     V  A\n" +
                            "    J   A A  V   V  A A\n" +
                            "J   J  AAAAA  V V  AAAAA\n" +
                            " J J  A     A  V  A     A\n");


        // exercise 1.4
        System.out.println( "a      a^2     a^3\n" +
                            "1      1       1\n" +
                            "2      4       8\n" +
                            "3      9       27\n" +
                            "4      16      64\n");


        // exercise 1.5
        System.out.println("The result of the equation is = " + ((9.5 * 4.5) - (2.5 * 3))/(45.5 - 3.5));

        // exercise 1.6
        System.out.println("The result is = " + (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9));

        // exercise 1.7
        System.out.println("Approx. PI = " + (4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))));

        System.out.println("Approx. PI = " + (4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13)))+"\n");

        // exercise 1.8
        double radius = 5.5;

        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("The area is = " + area + " The perimeter is = " + perimeter);

        // exercise 1.9
        double a = 4.5;
        double b = 7.9;

        area = a * b;
        perimeter = (2 * a)+(2 * b);

        System.out.println("The area is = " + area + " The perimeter is = " + perimeter);

        // exercise 1.10
        double time = (45.5/60);
        double distance = (14/1.6);

        double milesPerHour = (distance/time);

        System.out.println("Miles per hour equals = " + milesPerHour + "\n");

        // exercise 1.11
        double birthPerYear = (365*24*60*60.0)/(7.0);
        double deathPerYear = (365*24*60*60.0)/(13.0);
        double immigrantPerYear = (365*24*60*60.0)/(45.0);

        double growth = (birthPerYear-deathPerYear+immigrantPerYear);


        double population = 312032486.0;

        for(int year = 1; year<6;year++){
            System.out.println("the population for year " + year + " is" + (population+(growth*year)));
        }

        // exercise 1.12
        double kilometers = 24.0*1.6;
        double timeHours = 1.0+((60*40.0)+35.0)/(60.0*60);

        double kilometersPerHour = (kilometers/timeHours);

        System.out.println("\nAvg. Kilometer per hour is = " + kilometersPerHour + " KpH");

        // exercise 1.13
        //
    }

}
