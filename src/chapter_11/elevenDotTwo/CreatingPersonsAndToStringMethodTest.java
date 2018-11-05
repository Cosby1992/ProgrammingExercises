package chapter_11.elevenDotTwo;

/*
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.
 */


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CreatingPersonsAndToStringMethodTest {

    public static void main(String[] args) {


        Person trump = new Person("Donald Trump", "The Fucking White House", "666-555-0911 (Assumed number)", "DeathToWomenAndPeopleOfDiffrentOriginThanAmerican@ICanAffordMyOwnDomain.trump");

        System.out.println(trump.toString());

        Student cosby = new Student("Hellfighter Bladeslayer", "FalsterVej 1, 48** Falster", "+45 50 37 94 02", "Hellfighter@Bladeslayer.wow", Student.STATUS_FRESHMAN);

        System.out.println();
        System.out.println(cosby.toString());


        Date date = new GregorianCalendar(2018, Calendar.OCTOBER,30).getTime();
        Employee workingMan = new Employee("The Employee", "Believe Boulevard, 10000 City of Dreams", "Just Think of calling me", "TheEmployee@Dreams.believe", "Heaven", 1000000, date);
        workingMan.setDate(date);
        workingMan.setTheDateForFuckSake("30/10/2018", workingMan);

        System.out.println();
        System.out.println(workingMan.toString());

    }
}
