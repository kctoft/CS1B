# Inheriting Employees

For this assignment, you will use *inheritance*.
Your project should include **four classes** as described below.

# 1. Create  class that contains the **main method**. This class should
have a main method (**required**) and can have more static methods
(optional). The method(s) should perform the following tasks:

    * Create an object/instance of the **employee class**, an object
    of the **salaried class**, and an object of the **contractor class**
    (described *below*). You will have a minimum of **3 objects**:
    1 employee, 1 salaried, 1 contractor.

    * Create an **array of employee objects**. Pull all instances of
    the employee class, salaried class, and contractor class into
    the array.

    * Call the **payCheck method** with each employee object in the array
    and display the returning String.


# 2. Create a cass called **employee** that includes:

    *  A **constructor** that accepts *parameters* or the *instance variables*.

    * *Instance variables* to hold the **name** and **SSN** of an employee.

    * **Accessor methods** for each of the instance variables.

    * A payCheck function that returns a String that includes the employee
    name and SSN.

# 3. Create a class called **FTE** for Full Time Employees that inherits
from the employee class that includes:

    * Instance variable to hold the employee's salary.

    * A constructor that accepts the name, SSN, and salary of the employee.
    This constructor should *call* the employee class constructor to
    set the name and SSN. The constructor should also set the salary
    variable.

    * Override the payCheck function to return a String that includes the
    this information: **employee name**, **SSN**, and the **salary divided by 12**.
    This will be the monthly paycheck.

# 4. Write a class called **contractor** that inherits from the employee
class that includes:

    * Instance variable to hold the constructor's hold the constructor's
    hourly pay rate.

    * A constructor that accepts the name, SSN, and pay rate as parameters
    The constructor should call the employee class constructor to set up
    the name and SSN.

    * A payCheck method that accepts the hours worked as a parameter.
    This method should return a String that includes the contractor's
    name, SSN, and total pay, which should be calculated by multiplying
    the pay rate times by the hours worked.

    HINT: You will need to overload the payCheck in the parent class
    and then override it in the constructor class.