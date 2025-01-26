package com.tit.week02.day06.encapsulation.employeemanagementsystem;

import java.util.ArrayList;

class EmployeeManagement {
     public static void main(String[] args) {
         //Using FullTime Ref cause we cannot reach assignDepartment with Employee
         FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("CG001","Alice",500,2000);
         PartTimeEmployee partTimeEmployee = new PartTimeEmployee("CG002","Brook",500,5);

         //Assign departments
         fullTimeEmployee.assignDepartment("HR");
         partTimeEmployee.assignDepartment("AI");

         //Changing Reference
         Employee fullEmployee = fullTimeEmployee;
         Employee partEmployee = partTimeEmployee;

         //Display Employees
         ArrayList<Employee> employees = new ArrayList<>();
         employees.add(fullEmployee);
         employees.add(partEmployee);

         for (var emp : employees) {
             emp.displayDetails();
         }
     }
}
