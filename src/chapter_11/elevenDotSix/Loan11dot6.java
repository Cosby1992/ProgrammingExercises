package chapter_11.elevenDotSix;


/*
Creating a Loan object containing a double;
I make a constructor and a no arg constructor for this object.
Also getters and setters

At the bottom you find a toString method returning the date as a string
 */

public class Loan11dot6 {

    private double loan = -10000.0;

    public Loan11dot6(double loan) {
        this.loan = loan;
    }

    public Loan11dot6() {
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public String toString(){
        return String.valueOf(getLoan());
    }


}
