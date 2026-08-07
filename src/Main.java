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
        do {
            System.out.println("Select Course: 1. BCA   2. BSC  3. B.E/B.TECH   4. MCA   5. OTHER : ");
            Student_Course = sc.nextInt();
            sc.nextLine();
            switch (Student_Course) {
                case 1:
                    System.out.println("Course selected : BCA");
                    break;
                case 2:
                    System.out.println("Course selected : BSC");
                    break;
                case 3:
                    System.out.println("Course selected : B.E/B.TECH");
                    break;
                case 4:
                    System.out.println("Course selected : MCA");
                    break;
                case 5:
                    System.out.println("Course selected : OTHER");
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
        sc.close();

    }

}