/**
 * name: contractor
 * author: Kitana Toft
 * created: 10/20/2018
 * desc: inherits from employee class & includes:
 *  1. instance variable to include pay rate
 *  2. constructor that accepts name, ssn, and pay rate as parameters.
 *    - this constructor should call class employee to set the name and & SSN -
 *    this constructor should also set the pay rate instance variable
 *  3. a payCheck method that accepts hours worked as a parameter
 *    - this method should return a String that includes the constructor's
 *    name, SSN, and totalPay (which should be calculated by multiplying pay rate by hours worked)
 *
 *    HINT: You will need to overload payCheck in the parent class then override it
 *    in the constructor class.
 */

// derived class that inherits from the employee
public class Contractor extends Employee {
    // contractor's hourly pay rate
    private double payRate;
    private double hoursWorked;

    // constructor with specific parameters
    public Contractor(String firstName, String lastName, int SSN, double payRate) {
        super(firstName, lastName, SSN);
        this.payRate = payRate;
    }

    // returns totalPay for contractor
    public double totalPay() {
        return payRate * hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String payCheck() {
        return super.payCheck() + String.format("\tTotal pay: %.02f\n", totalPay());
    }

    public String payCheck(double hoursWorked) {
        setHoursWorked(hoursWorked);
        return payCheck();
    }
}
