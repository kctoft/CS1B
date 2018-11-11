/**
 * name: FTE - Full Time Employee
 * author: Kitana Toft
 * created: 10/20/2018
 * desc: inherits from Employee class & includes:
 * 1.  instance variable to hold the employee's salary
 * 2.  constructor that accepts the employee's name, SSN, and salary of an employee
 *   - this constructor should call the employee class constructor to set the name & SSN -
 *   it should also set the salary instance variable
 * 3. override the payCheck function to return a String that includes this information:
 *  employee, name, SSN, and salary divided by 12 (monthly salary)
 */


// derived class that extends employee
// inherits information from class employee
public class FTE extends Employee {
    // the FTE subclass subclass adds one field
    // declare and initialize variables
    private float salary;

    // method for FTE that includes salary (derives information from employee)
    public FTE(String firsName, String lastName, int SSN, float salary) {
        super(firsName, lastName, SSN);
        this.salary = salary;
    }

    // accessor
    public float getSalary() {
        return this.salary;
    }

    // sets salary as instance variable
    public void setSalary(float newSalary) {
        salary = newSalary;
    }

    // overrides payCheck base method
    public String payCheck() {
        return super.payCheck() + String.format("\tMonthly salary: %.02f\n", salary / 12.0);
    }
}
