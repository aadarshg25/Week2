class Student {
    static String universityName = "RGPV University";
    static int totalStudents = 0;

    private String name;
    private String grade;

    private final int rollNumber;

    // Parameterized Constructor
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("\nName: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
            System.out.println();
        } else {
            System.out.println("Not a valid student.");
        }
    }

}

class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Brook", 101, "A");
        Student s2 = new Student("Harry", 102, "B");

        Student.displayTotalStudents();

        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}