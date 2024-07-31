package EmployeeSystem;

public class TestClass {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(2);

        Employee emp1 = new Employee("E001", "jaden", "Developer", 70000);
        Employee emp2 = new Employee("E002", "yogesh", "Manager", 85000);
        Employee emp3 = new Employee("E003", "ksaba", "Analyst", 60000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch for Employee E002:");
        Employee foundEmployee = ems.searchEmployee("E002");
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");

        System.out.println("\nDelete Employee E001:");
        boolean isDeleted = ems.deleteEmployee("E001");
        System.out.println("Deleted: " + isDeleted);

        System.out.println("\nAll Employees after Deletion:");
        ems.traverseEmployees();
    }
}
