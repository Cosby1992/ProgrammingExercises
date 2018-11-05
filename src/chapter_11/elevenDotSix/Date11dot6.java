package chapter_11.elevenDotSix;

import java.util.Date;

/*
Creating a date object containing a Date();
I make a constructor and a no arg constructor for this object.
Also getters and setters

At the bottom you find a toString method returning the date as a string
 */

public class Date11dot6 {

    private Date date = new Date();

    public Date11dot6(Date date) {
        this.date = date;
    }

    public Date11dot6() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return getDate().toString();
    }
}
