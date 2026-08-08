import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("       STUDENT REPORT        ");
        System.out.println("=============================");
        System.out.println("Enter Student ID: ");
        String Student_Id = sc.nextLine();
        System.out.println("Enter Student Full Name: ");
        String Student_Name = sc.nextLine();

        int Student_Age;
        do {
            System.out.println("Enter Student Age: ");
            Student_Age = sc.nextInt();
            sc.nextLine();
            if (Student_Age < 15 || Student_Age > 35) {
                System.out.println("Invalid Age! Age must be between 15 and 35.");
            }
        } while (Student_Age < 15 || Student_Age > 35);

        System.out.println("Enter Student Email: ");
        String Student_Email = sc.nextLine();
        int Student_Course;
        int Course_Fee = 0;
        do {
            System.out.println("Select Course: 1. BCA   2. BSC  3. B.E/B.TECH   4. MCA   5. OTHER : ");
            Student_Course = sc.nextInt();
            sc.nextLine();
            switch (Student_Course) {
                case 1:
                    System.out.println("Course selected : BCA");
                    Course_Fee = 35000;
                    break;
                case 2:
                    System.out.println("Course selected : BSC");
                    Course_Fee = 30000;
                    break;
                case 3:
                    System.out.println("Course selected : B.E/B.TECH");
                    Course_Fee = 50000;
                    break;
                case 4:
                    System.out.println("Course selected : MCA");
                    Course_Fee = 45000;
                    break;
                case 5:
                    System.out.println("Course selected : OTHER");
                    Course_Fee = 25000;
                    break;
            }
            if (Student_Course < 1 || Student_Course > 5) {
                System.out.println("Invalid Course! Course must be between 1 and 5.");
            }
        } while (Student_Course < 1 || Student_Course > 5);

        System.out.println("Enter the Current Semister (1-8): ");
        String Student_Semister = sc.nextLine();
        System.out.println("Enter Career Goal: ");
        String Career_Goal = sc.nextLine();

        System.out.println("Student ID                : " + Student_Id);
        System.out.println("Student Name              : " + Student_Name);
        System.out.println("Age                       : " + Student_Age);
        System.out.println("Email                     : " + Student_Email);
        System.out.println("Course                    : " + Student_Course);
        System.out.println("Semister                  : " + Student_Semister);
        System.out.println("Career Goal               : " + Career_Goal);

        System.out.println("---------------- ACADEMIC SUMMARY --------------------");
        int Java_Marks;
        do {
            System.out.println("Enter Java Marks: ");
            Java_Marks = sc.nextInt();
            if (Java_Marks < 0 || Java_Marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            }
        } while (Java_Marks < 0 || Java_Marks > 100);
        int Sql_Marks;
        do {
            System.out.println("Enter SQL Marks: ");
            Sql_Marks = sc.nextInt();
            sc.nextLine();
            if (Sql_Marks < 0 || Sql_Marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            }
        } while (Sql_Marks < 0 || Sql_Marks > 100);
        int Web_Marks;
        do {
            System.out.println("Enter Web Technology Marks: ");
            Web_Marks = sc.nextInt();
            sc.nextLine();
            if (Web_Marks < 0 || Web_Marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            }
        } while (Web_Marks < 0 || Web_Marks > 100);
        int Appti_Marks;
        do {
            System.out.println("Enter Apptitude Marks: ");
            Appti_Marks = sc.nextInt();
            sc.nextLine();
            if (Appti_Marks < 0 || Appti_Marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            }
        } while (Appti_Marks < 0 || Appti_Marks > 100);
        int Com_Marks;
        do {
            System.out.println("Enter Communication Marks: ");
            Com_Marks = sc.nextInt();
            sc.nextLine();
            if (Com_Marks < 0 || Com_Marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            }
        } while (Com_Marks < 0 || Com_Marks > 100);
        int total_marks = Java_Marks + Sql_Marks + Web_Marks + Appti_Marks + Com_Marks;
        double percentage = total_marks / 5;
        System.out.println("Total Marks : " + total_marks);
        System.out.println("Percentage : " + percentage);
        if (percentage > 85) {
            System.out.println("Grade : A+");
        } else if (percentage >= 75 && percentage < 84.99) {
            System.out.println("Grade : A");
        } else if (percentage >= 65 && percentage < 74.99) {
            System.out.println("Grade : B");
        } else if (percentage >= 50 && percentage < 64.99) {
            System.out.println("Grade: C");
        } else if (percentage >= 40 && percentage < 49.99) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        if (Java_Marks >= 35 && Sql_Marks >= 35 && Web_Marks >= 35 && Appti_Marks >= 35 && Com_Marks >= 35) {
            System.out.println("Acadamic Result: PASS");
        } else {
            System.out.println("Acadamic Result: FAIL");
        }
        System.out.println("Enter total number of Class Conducted: ");
        int total_class = sc.nextInt();
        int Class_attendance;
        do {
            System.out.println("Enter number of Class Attendance: ");
            Class_attendance = sc.nextInt();
            sc.nextLine();
            if (Class_attendance < 0 || Class_attendance > total_class) {
                System.out.println("Invalid Attendance! Attendance must be between 0 and total class.");
            }
        } while (Class_attendance < 0 || Class_attendance > total_class);

        System.out.println("Total class Conducted : " + total_class);
        System.out.println("Number of Class Attendance : " + Class_attendance);
        double Attendance_Percentage = (double) Class_attendance / total_class * 100;
        System.out.println("Attendance Percentage : " + Attendance_Percentage);
        String Attendance_status = (Attendance_Percentage >= 75) ? "Regular" : "Shortage";
        System.out.println("Attendance Status : " + Attendance_status);
        
        System.out.println("-------------------ASSSIGMENT SUMMARY-------------------");
        
        sc.close();


    }

}
