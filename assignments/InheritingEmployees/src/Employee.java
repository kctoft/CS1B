/**
 * name: Employee
 * author: Kitana Toft
 * created: 10/20/2018
 * desc: a constructor that accepts parameters as instance variables
 *  instance vars hold name & SSN of the employee
 *  Accessor methods for each of the instance variables
 *  A payCheck function that returns a String
 */

public class Employee {
    // declare and initialize variables
    private String firstName;
    private String lastName;
    private int SSN;

    // new instance of employee with input parameters
    // constructor for employee
    public Employee(String firstName, String lastName, int SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    // Accessors and setters
    public void setFirstName(String FirstName) {
        firstName = FirstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String LastName) {
        lastName = LastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setSSN(int aSSN) {
        SSN = aSSN;
    }

    public int getSSN() {
        return this.SSN;
    }

    // method that belongs to class employee 'payCheck"
    public String payCheck() {
        return String.format("Employee:\n\tFirst name: %s\n\tLast name: %s\n\tEmployee SSN: %s\n",
                firstName, lastName, SSN);
    }
}
