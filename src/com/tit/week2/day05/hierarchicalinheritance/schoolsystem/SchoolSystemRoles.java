package com.tit.week2.day05.hierarchicalinheritance.schoolsystem;

class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println();

        Student student = new Student("Bob", 16, "10th Grade");
        student.displayRole();
        student.displayDetails();

        System.out.println();

        Staff staff = new Staff("Charlie", 40, "Administration");
        staff.displayRole();
        staff.displayDetails();
    }
}
