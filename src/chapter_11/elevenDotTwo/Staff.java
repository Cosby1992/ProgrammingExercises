package chapter_11.elevenDotTwo;

/*
A staff member has a title.
 */

import java.util.Date;

public class Staff extends Employee {

    private String title = "";

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "This is an Employee object! (Subclass to Person Class)\n" +
                "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone number: " + getPhoneNumber() + "\n" +
                "E-mail: " + getEmailAddress() + "\n" +
                "Office: " + getOffice() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Hired: " + getDate() + "\n" +
                "Title: " + getTitle();
    }


}
