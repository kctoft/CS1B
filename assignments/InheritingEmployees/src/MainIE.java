/**
 * name: MainIE - Project 2 Inheriting Employee
 * author: Kitana Toft
 * created: 10/20/2018
 * desc: Main method class & possibly any other static methods.
 * Should perform the following tasks:
 *  1. create an object/instance of the employee class,
 *     an object of the salaried class,
 *     and an object of the contractor class.
 *     (A minimum of 3 objects).
 * 2. Create an array of employee objects.
 *    Pull all instances from the employee class,
 *    salaried class, and contractor class into the array.
 * 3. Call the payCheck method with each object in the array
 *    and display the returning String.
 */

public class MainIE {
    // employee
    public static void testEmployee() {
        Employee employee = new Employee("Joe","Dirt",123);
        System.out.println(employee.payCheck());
    }

    // salaried employee FTE
    public static void testFTE() {
        FTE salaried = new FTE("Carl","Moon",456,32000);
        System.out.println(salaried.payCheck());
    }

    // contractor
    public static void testContractor() {
        Contractor contractor = new Contractor("Alexis","Rose",934, 150);
        System.out.println(contractor.payCheck(56));
    }

    // array for 3 instances
    public static void testAll() {
        Employee employee = new Employee("Joe","Dirt",123);
        FTE salaried = new FTE("Carl","Moon",456,32000);
        Contractor contractor = new Contractor("Alexis","Rose",934, 150);
        contractor.setHoursWorked(32);

        // array of the same base class
        Employee[] employees = new Employee[3];

        employees[0] = employee;
        employees[1] = salaried;
        employees[2] = contractor;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].payCheck());
        }
    }

    public static void main(String[] args) {
        testEmployee();
        testFTE();
        testContractor();
        testAll();
    }
}

