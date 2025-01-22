import java.util.ArrayList;

class Faculty {
    private String name;
    private String specialization;

    // Constructor to initialize faculty details
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name + ", Specialization: " + specialization);
    }
}

class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    // Constructor to initialize department and its faculty members
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;

    // Constructor to initialize university and its departments
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Create faculty members
        Faculty faculty1 = new Faculty("Alice", "Computer Science");
        Faculty faculty2 = new Faculty("Brook", "Mathematics");
        Faculty faculty3 = new Faculty("Rio", "Physics");

        // Create departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        // Add faculty members to departments
        dept1.addFaculty(faculty1);
        dept2.addFaculty(faculty2);
        dept2.addFaculty(faculty3);

        // Create university
        University university = new University("Tech University");

        // Add departments to university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Display university details
        university.displayUniversityDetails();

        // Display independent faculty member details
        System.out.println("\nIndependent Faculty Members:");
        faculty3.displayFacultyDetails();

    }
}
