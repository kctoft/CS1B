/**
 * name: Student method for Project 1
 * created: 10/3/18
 * updated: 10/09/2018
 * author: Kitana Toft
 * desc: A method used for creating a student variable
 * with first/last name and id number.
 *
 * Steps
 * 1. create a "Student" class
 *  i. private member data
 *      a. String first name
 *      b. String last name
 *      c. int student ID
 *
 *  ii. public methods
 *      a. public Student(String first, String last, int id)
 *          : a constructor with parameters to et the instance variables
 *      b. public toString()
 *          : method returns a string that contains all private vars
 *           -> this is an accessor(getter) instance
 */

public class Student {
    // declare and initialize variables
    private String first;
    private String last;
    private int id;

    // new instance of a student with input parameters
    // Student student = new Student("Charles", "Yen", 2);
    // constructor(type var, ...)
    public Student(String first, String last, int id) {
        // using "this" pointer to refer to private variables
        this.first = first;
        this.last = last;
        this.id = id;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    public int getid() { return this.id; }


    // method ; function that belongs to a class
    // visibility, [options], return type, name of fcn([optional] inputs - type var)
    public String toString() {
        String s = "Student: " +
            "\n First name: " + first +
            "\n Last Name: " + last +
            "\n Student ID: " + id;
        return s;
    }
}