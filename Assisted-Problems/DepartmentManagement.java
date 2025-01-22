import java.util.ArrayList;

class Employee {
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name + ", Designation: " + designation);
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor to initialize department and its employees
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation));
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor to initialize company and its departments
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to get a department by index
    public Department getDepartment(int index) {
        return departments.get(index);
    }

    // Method to display company details
    public void displayCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}

// Main Class to demonstrate the relationship
class DepartmentManagement {
    public static void main(String[] args) {
        // Create company
        Company company = new Company("TIT");

        // Add departments to the company
        company.addDepartment("IT");
        company.addDepartment("CS");

        // Add employees to departments
        company.getDepartment(0).addEmployee("Alice", "Developer");
        company.getDepartment(0).addEmployee("Aadarsh", "Tester");
        company.getDepartment(1).addEmployee("Anish", "Manager");

        // Display company details
        company.displayCompanyDetails();

        // Delete the company (composition principle applied)
        company = null;
        try {
            // Trying to access company details after deletion
            company.displayCompanyDetails();
        } catch (NullPointerException e) {
            System.out.println("Company object is deleted, and its components are no longer accessible.");
        }
    }
}
