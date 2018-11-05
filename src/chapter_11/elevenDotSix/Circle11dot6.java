package chapter_11.elevenDotSix;


/*
Creating a Circle object containing a double for radius of the circle;
I make a constructor and a no arg constructor for this object.
Also getters and setters

At the bottom you find a toString method returning the date as a string
 */

public class Circle11dot6 {

    private double radius = 1;


    public Circle11dot6(double radius) {
        this.radius = radius;
    }

    public Circle11dot6() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return String.valueOf(getRadius());
    }

}
