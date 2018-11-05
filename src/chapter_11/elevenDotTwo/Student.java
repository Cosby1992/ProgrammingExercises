package chapter_11.elevenDotTwo;

/*
A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant.
 */

public class Student extends Person {

    public static final String STATUS_FRESHMAN = "Freshman";
    public static final String STATUS_SOPHOMORE = "Sophomore";
    public static final String STATUS_JUNIOR = "Junior";
    public static final String STATUS_SENIOR = "Senior";
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "This is a Student object! (Subclass to Person Class)\n" +
                "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone number: " + getPhoneNumber() + "\n" +
                "E-mail: " + getEmailAddress() + "\n" +
                "Status: " + getStatus();
    }



}
