class Employee {
    int empId;
    String empName;

    // Constructor
    Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    // Function to display employee details
    void printEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }

    // Second function
    void showMessage() {
        System.out.println("Employee Record Displayed");
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Mounika");
        Employee e2 = new Employee(102, "Rahul");
        Employee e3 = new Employee(103, "Priya");

        e1.printEmployee();
        e1.showMessage();

        e2.printEmployee();
        e2.showMessage();

        e3.printEmployee();
        e3.showMessage();
    }
}