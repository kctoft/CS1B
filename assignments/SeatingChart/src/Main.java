/**
 * name: Main class for Student/Seating Chart Project 1
 * created on: 10/3/2018
 * updated: 10/09/2018
 * author: Kitana Toft
 * desc: Testing environment for Student and Seating Chart
 *
 */

public class Main {

    public static void testStudentGetFirst() {
        Student student = new Student("Charlie", "Hunt", 1);

        if (student.getFirst() != "Charlie") {
            System.out.println("Student name does not match expected name.");
            java.lang.System.exit(1);
        }
    }

    public static void testFindStudent() {
        SeatingChart chart = new SeatingChart(20);

        chart.addStudent("Bobby", "Brown", 3, 0);

        if (chart.findStudent("Bobby") != 0) {
            System.out.println("Bobby was not found in the seating chart.");
            java.lang.System.exit(1);
        }
    }

    public static void testFindMultipleStudents() {
        SeatingChart chart = new SeatingChart(20);

        chart.addStudent("Bobby", "Brown", 3, 0);
        chart.addStudent("Katya", "Ivanovich", 45, 2);
        chart.addStudent("Xiao", "Yu", 98, 8);

        if (chart.findStudent("Xiao") != 8) {
            System.out.println("Xiao was not found in the correct position in the seating chart.");
            java.lang.System.exit(1);
        }

        if (chart.findStudent("Xiao") == -1) {
            System.out.println("Xiao was not found in the seating chart.");
            java.lang.System.exit(1);
        }
    }

    public static void testFindNonExistantStudent() {
        SeatingChart chart = new SeatingChart(20);

        if (chart.findStudent("Jake") != -1) {
            System.out.println("We found a non-existent student.");
            java.lang.System.exit(1);
        }
    }

    public static void testSwapStudent() {
        SeatingChart chart = new SeatingChart(20);
        chart.addStudent("Mary","Joe",3, 12);
        chart.addStudent("Jon", "Baker",23,17);

        chart.swapStudent("Mary",17);

        if (chart.findStudent("Mary") != 17) {
            System.out.println("Mary did not swap seats.");
            java.lang.System.exit(1);
        }

        if (chart.findStudent("Jon") != 12) {
            System.out.println("Jon did not swap seats.");
            java.lang.System.exit(1);
        }
    }

    public static void main(String[] args) {
        testStudentGetFirst();
        testFindStudent();
        testFindMultipleStudents();
        testFindNonExistantStudent();
        testSwapStudent();

        java.lang.System.exit(0);
    }
}
