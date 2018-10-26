package chapter_9;

import javafx.scene.paint.Color;

public class Fan {

    /* Exercise 9.8
        (The Fan class) Design a class named Fan to represent a fan. The class contains:
        ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
        denote the fan speed.
        ■ A private int data field named speed that specifies the speed of the fan (the
        default is SLOW).
        ■ A private boolean data field named on that specifies whether the fan is on (the
        default is false).
        ■ A private double data field named radius that specifies the radius of the fan
        (the default is 5).
        ■ A string data field named color that specifies the color of the fan (the default
        is blue).
        ■ The accessor and mutator methods for all four data fields.
        ■ A no-arg constructor that creates a default fan.
        ■ A method named toString() that returns a string description for the fan. If
        the fan is on, the method returns the fan speed, color, and radius in one combined
        string. If the fan is not on, the method returns the fan color and radius
        along with the string “fan is off” in one combined string.
     */

    private final int SLOW = 1;
    private final int MEDIUM = 1;
    private final int FAST = 1;

    private int fanSpeed = SLOW;
    private boolean on = false;
    private double fanRadius = 5;
    private Color color = Color.BLUE;

    public Fan() {
    }


    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getFanRadius() {
        return fanRadius;
    }

    public void setFanRadius(double fanRadius) {
        this.fanRadius = fanRadius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString(Object object){
        if(isOn()==false){
            return toString("Current state of the fan is " + getFanSpeed()+ " " + getColor());
        }
        else{
            return toString("Current state of the fan is " + getFanSpeed()+ " " + getColor());
        }


    }

}
