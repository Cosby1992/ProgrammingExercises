package chapter_11.elevenDotTwo;


/*
An employee has an office, salary, and date hired.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Employee extends Person {





    private String office = "LA office";
    private double salary = 30000;
    private Date date = new Date();





    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date date) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }

    public Employee() {
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getDate() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = date.toString();


        // TODO: 05-11-2018 Write more fucking code around here



        return date1;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setTheDateForFuckSake(String dateInString, Employee employee){

        String dateToParse = dateInString;
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateToParse);

            employee.setDate(date);

        }
        catch (ParseException parseError){
            System.out.println("You got a ParseException");
        }
        catch (DateTimeParseException ThisSeemedToWork){
            System.out.println("You got a DateTimeParseException");
        }

    }



    public String toString(){
        return "This is an Employee object! (Subclass to Person Class)\n" +
                "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone number: " + getPhoneNumber() + "\n" +
                "E-mail: " + getEmailAddress() + "\n" +
                "Office: " + getOffice() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Hired: " + getDate();
    }

}
