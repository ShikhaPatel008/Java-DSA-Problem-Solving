package OOP;

import java.util.Scanner;

public class UserDefinedDatatypes {
    public static class Student{ // user defined datatype : class
        String name;
        int roll;
        double cgpa;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // Scanner class, sc object
        Student s1 = new Student(); // object s1 is created
        s1.name = "Shikha";// initializing value of object attribute using dot operator
        s1.roll = 372;
        s1.cgpa = 9.1;

        Student s2 = new Student(); // object s2 is created
        s2.name = "Khushi";
        s2.roll = 370;
        s2.cgpa = 9.0;

        Student s3 = new Student(); // object s3 is created
        s3.name = "Khushi";
        s3.roll = 370;
        s3.cgpa = sc.nextDouble(); // taking user input for object attribute using dot operator

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.roll);
        s2.cgpa = 8.6; // updating value of object attribute using dot operator

    }
}
