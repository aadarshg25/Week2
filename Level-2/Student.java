import java.util.Scanner;

class StudentDetails {
    private String rollNumber;
    private String name;
    private int[] marks;

    // Constructor
    StudentDetails(String rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Helper method
    private double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    // Display student details
    public void displayStudentDetails() {
        double percentage = calculatePercentage();
        System.out.println(name + " having roll number " + rollNumber + " has got " + percentage + "% percentage.");
    }

    // Calculate grade based on percentage
    public char calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R'; // R stands for "Repeat" or failure
        }
    }
}

class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's roll number: ");
        String rollNumber = input.nextLine();

        System.out.print("Enter the name of the student: ");
        String name = input.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        StudentDetails student = new StudentDetails(rollNumber, name, marks);

        // Display student details and grade
        student.displayStudentDetails();
        char grade = student.calculateGrade();
        System.out.println(name + " has received grade: " + grade);

        input.close();
    }
}
