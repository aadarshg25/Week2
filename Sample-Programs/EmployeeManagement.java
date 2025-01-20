class Employee {
    static String companyName = "TIT";
    static int numberofEmployee = 0;

    private String name;
    private String designation;

    private final String id;

    // Parameterized constructor
    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    // display number of Employee
    static int displayTotalEmployees() {
        return numberofEmployee++;
    }

    // display Employee detail
    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("\nCompany Name : " + companyName);
            System.out.println("Employee Name : " + name);
            System.out.println("Employee id : " + id);
            System.out.println("Employee designation : " + designation);

            System.out.println();
        } else {
            System.out.println("Invalid account!");
        }
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Eiichiro Oda", "545", "Senior Analyst");
        Employee employee2 = new Employee("Ted", "5820", "Senior Analyst");

        System.out.println("Company name is : " + Employee.companyName);

        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
    }
}
