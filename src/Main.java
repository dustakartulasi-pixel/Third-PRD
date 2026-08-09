import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        String courseName = "";
        int Course_Fee = 0;
        do {
            System.out.println("Select Course: 1. BCA   2. BSC  3. B.E/B.TECH   4. MCA   5. OTHER : ");
            Student_Course = sc.nextInt();
            sc.nextLine();
            switch (Student_Course) {
                case 1:
                    courseName = "BCA";
                    Course_Fee = 35000;
                    break;
                case 2:
                    courseName = "BSC";
                    Course_Fee = 30000;
                    break;
                case 3:
                    courseName = "B.E/B.Tech";
                    Course_Fee = 50000;
                    break;
                case 4:
                    courseName = "MCA";
                    Course_Fee = 45000;
                    break;
                case 5:
                    courseName = "OTHER";
                    Course_Fee = 25000;
                    break;
            }
            if (Student_Course >= 1 && Student_Course <= 5) {
                System.out.println("Course selected : " + courseName);
                System.out.println("Course Fee : " + Course_Fee);
            } else {
                System.out.println("Invalid Course! Course must be between 1 and 5.");
            }
        } while (Student_Course < 1 || Student_Course > 5);

        System.out.println("Enter the Current Semister (1-8): ");
        String Student_Semister = sc.nextLine();
        System.out.println("Enter Career Goal: ");
        String Career_Goal = sc.nextLine();

        int Java_Marks;
        do {
            System.out.println("Enter Java Marks: ");
            Java_Marks = sc.nextInt();
            sc.nextLine();
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
        double percentage = total_marks / 5.0;
       
        String grade;
        if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 65) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        String academicResult;
        if (Java_Marks >= 35 && Sql_Marks >= 35 && Web_Marks >= 35 && Appti_Marks >= 35 && Com_Marks >= 35) {
            academicResult = "PASSED";
        } else {
            academicResult = "FAILED";
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

        int numAssignments;
        do {
            System.out.println("Enter number of assignments to enter (1-10): ");
            numAssignments = sc.nextInt();
            sc.nextLine();
            if (numAssignments < 1 || numAssignments > 10) {
                System.out.println("Invalid input! Number of assignments must be between 1 and 10.");
            }
        } while (numAssignments < 1 || numAssignments > 10);

        int validAssignmentCount = 0;
        double assignmentTotal = 0;

        for (int i = 1; i <= numAssignments; i++) {
            System.out.println("Enter score for assignment " + i + " (0 to 10, or -1 to stop): ");
            int score = sc.nextInt();
            sc.nextLine();

            if (score == -1) {
                break;
            }

            if (score < -1 || score > 10) {
                System.out.println("Warning: Score is invalid! Skipping this entry.");
                continue;
            }

            assignmentTotal = assignmentTotal + score;
            validAssignmentCount++;
        }

        double assignmentAverage = (validAssignmentCount > 0) ? (assignmentTotal / validAssignmentCount) : 0.00;
        double Attendance_Percentage = (total_class > 0) ? ((double) Class_attendance / total_class * 100) : 0.00;
        String Attendance_status = (Attendance_Percentage >= 75) ? "REGULAR" : "SHORTAGE";
        String assignmentStatus = (assignmentAverage >= 7.0) ? "SATISFACTORY" : "NEEDS IMPROVEMENT";
        
        int scholarshipPercentage = 0;
        if (academicResult == "PASSED" && percentage >= 85 && Attendance_Percentage >= 85) {
            scholarshipPercentage = 10;
        } else if (academicResult == "PASSED" && percentage >= 75 && Attendance_Percentage >= 75) {
            scholarshipPercentage = 5;
        } else {
            scholarshipPercentage = 0;
        }

        double scholarshipAmount = (Course_Fee * scholarshipPercentage) / 100.0;
        double finalPayableFee = Course_Fee - scholarshipAmount;

        double amountPaid;
        do {
            System.out.println("Enter Amount Paid: ");
            amountPaid = sc.nextDouble();
            sc.nextLine();
            if (amountPaid < 0 || amountPaid > finalPayableFee) {
                System.out.println("Invalid Amount! Amount paid must be between 0 and " + finalPayableFee + ".");
            }
        } while (amountPaid < 0 || amountPaid > finalPayableFee);

        double feeBalance = finalPayableFee - amountPaid;
        String feeStatus = (feeBalance == 0) ? "PAID" : "PENDING";

        boolean academicCleared = academicResult.equals("PASSED");
        boolean attendanceCleared = Attendance_status.equals("REGULAR");
        boolean assignmentCleared = assignmentStatus.equals("SATISFACTORY");
        boolean feeCleared = feeStatus.equals("PAID");

        boolean isCleared = academicCleared && attendanceCleared && assignmentCleared && feeCleared;
        String semesterClearance = isCleared ? "CLEARED FOR NEXT SEMESTER" : "NOT CLEARED FOR NEXT SEMESTER";

        System.out.println("========================================================");
        System.out.println("                 STUDENT SEMESTER REPORT");
        System.out.println("========================================================");
        System.out.println("Student ID                 : " + Student_Id);
        System.out.println("Student Name               : " + Student_Name);
        System.out.println("Age                        : " + Student_Age);
        System.out.println("Email                      : " + Student_Email);
        System.out.println("Course                     : " + courseName);
        System.out.println("Semester                   : " + Student_Semister);
        System.out.println("Career Goal                : " + Career_Goal);

        System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");
        System.out.println("Java Marks                 : " + Java_Marks);
        System.out.println("SQL Marks                  : " + Sql_Marks);
        System.out.println("Web Technology Marks       : " + Web_Marks);
        System.out.println("Aptitude Marks              : " + Appti_Marks);
        System.out.println("Communication Marks        : " + Com_Marks);
        System.out.println("Total Marks                : " + total_marks + "/500");
        System.out.println("Percentage                 : " + percentage + "%");
        System.out.println("Academic Result            : " + academicResult);
        System.out.println("Grade                      : " + grade);

        System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");
        System.out.println("Classes Conducted          : " + total_class);
        System.out.println("Classes Attended           : " + Class_attendance);
        System.out.println("Attendance Percentage      : " + Attendance_Percentage + "%");
        System.out.println("Attendance Status          : " + Attendance_status);

        System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");
        System.out.println("Valid Assignments          : " + validAssignmentCount);
        System.out.println("Assignment Total           : " + (int) assignmentTotal);
        System.out.println("Assignment Average         : " + assignmentAverage);
        System.out.println("Assignment Status          : " + assignmentStatus);

        System.out.println("\n---------------- FEE SUMMARY -------------------------");
        System.out.println("Base Semester Fee          : ₹" + Course_Fee);
        System.out.println("Scholarship Percentage     : " + scholarshipPercentage + "%");
        System.out.println("Scholarship Amount         : ₹" + scholarshipAmount);
        System.out.println("Final Payable Fee          : ₹" + finalPayableFee);
        System.out.println("Amount Paid                : ₹" + amountPaid);
        System.out.println("Fee Balance                : ₹" + feeBalance);
        System.out.println("Fee Status                 : " + feeStatus);

        System.out.println("\n---------------- FINAL STATUS ------------------------");
        System.out.println("Semester Clearance         : " + semesterClearance);

        System.out.println("\n---------------- FAILED CONDITIONS -------------------");
        if (isCleared) {
            System.out.println("None");
        } else {
            if (!academicCleared) {
                System.out.println("- Academic performance requirement not met (Academic Result: FAILED)");
            }
            if (!attendanceCleared) {
                System.out.println("- Attendance requirement not met (Attendance Status: SHORTAGE)");
            }
            if (!assignmentCleared) {
                System.out.println("- Assignment performance requirement not met (Assignment Status: NEEDS IMPROVEMENT)");
            }
            if (!feeCleared) {
                System.out.println("- Fee payment incomplete (Fee Status: PENDING)");
            }
        }

        System.out.println("\n---------------- RECOMMENDATIONS ---------------------");
        if (isCleared) {
            System.out.println("Maintain the current performance in the next semester.");
        } else {
            if (!academicCleared) {
                System.out.println("- Re-appear for failed subject examinations.");
            }
            if (!attendanceCleared) {
                System.out.println("- Attend makeup classes to reach minimum 75% attendance.");
            }
            if (!assignmentCleared) {
                System.out.println("- Improve assignment scores to achieve average score >= 7.0.");
            }
            if (!feeCleared) {
                System.out.println("- Clear the pending fee balance of ₹" + feeBalance + ".");
            }
        }
        System.out.println("========================================================");
        


        sc.close();
    }
}

