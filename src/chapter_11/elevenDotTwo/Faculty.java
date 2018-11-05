package chapter_11.elevenDotTwo;

/*
A faculty member has office
hours and a rank.
 */

import java.util.Date;

public class Faculty extends Employee {

    private String officeHours = "7.00 - 15.00";
    private String rank = "";

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString(){
        return "This is a Faculty object! (Subclass to Employee subclass)\n" +
                "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone number: " + getPhoneNumber() + "\n" +
                "E-mail: " + getEmailAddress() + "\n" +
                "Office: " + getOffice() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Hired: " + getDate() + "\n" +
                "Office Hours: " + getOfficeHours() + "\n" +
                "Rank: " + getRank();
    }

}
