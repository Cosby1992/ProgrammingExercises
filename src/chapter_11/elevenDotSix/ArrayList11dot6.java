package chapter_11.elevenDotSix;

/*
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.
 */

import java.util.*;


public class ArrayList11dot6 {



    //Making a method that returns a String from 4 object parameters.

    public static String getArraylistAsString(String string, Circle11dot6 circle, Loan11dot6 loan, Date11dot6 date) {

        //Making the ArrayList a ArrayList of Strings
        //Underneath adding the 4 objects all as strings (invoking the toString method from 3 of the objects
        //the last one is already a String)
        ArrayList<String> list = new ArrayList<>();
        list.add(string);
        list.add(circle.toString());
        list.add(loan.toString());
        list.add(date.toString());

        //Running through the List showing the results of each index of the arrayList in the console

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        //Returning the list as a String using the toString method

        return list.toString();


    }

    public static void main(String[] args) {

        //Creating 4 objects (1 is a String, 3 others are defined by the other classes)

        Circle11dot6 circle = new Circle11dot6(10);
        Loan11dot6 loan = new Loan11dot6(-100000.00);
        Date11dot6 date = new Date11dot6();
        String importantString = "Important String";


        //Using the getArrayListAsAString static method and printing this in the console

        System.out.println(getArraylistAsString(importantString,circle,loan,date));
    }


    //Job Well Done ;)

}
