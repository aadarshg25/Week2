import java.util.Scanner;

class Employee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Employee name: ");
        String name = input.nextLine();

        System.out.print("Enter the Employee ID: ");
        String id = input.next();

        System.out.print("Enter the Employee salary: ");
        int salary = input.nextInt();

        EmployeeDetails employee = new EmployeeDetails(name, id, salary);

        employee.displayEmployeeStatus();

        input.close();
    }
}

class EmployeeDetails {

    private String id;
    private String name;
    private int salary;

    // Constructor
    EmployeeDetails(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeStatus() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
