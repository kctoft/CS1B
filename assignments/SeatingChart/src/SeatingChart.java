/**
 * name: Project 1 Seating Chart
 * created: 10/03/2018
 * updated: 10/09/2018
 * author: Kitana Toft
 * desc: Program for a seating chart.
 * Assigned seating may be altered.
 * If seating chart is full, two students will switch seats.
 * Size of seating chart should be 20 students.
 * Position 0 refers to the person sitting closest to the teacher's desk.
 */

public class SeatingChart {
    private Student seats[];

    // constructor
    public SeatingChart(int maxStudents) {
        seats = new Student[maxStudents];
    }

    public void addStudent(String first, String last, int id, int seatNum) {
        Student student = new Student(first, last, id);
        seats[seatNum] = student;
    }


//    public int findStudent(String first) {
//        // identify name of student
//        // test if name seats[i]
//        if (seats.length == 0) {
//            return -1;
//        }
//
//        for (int i = 0; i < seats.length; i++) {
//            if(seats[i] == null) {
//                continue;
//            }
//
//            if (first == seats[i].getFirst()) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public int findStudent(String first) {
        return binarySearch(this.seats, first, 0, seats.length - 1);
    }


    private int binarySearch(Student[] seats, String first, int firstIndex, int lastIndex) {
        int middle = ((firstIndex + lastIndex) / 2);

        if (seats[middle] != null) {
            if (seats[middle].getFirst() == first) {
                return middle;
            }
        }

        if (middle - 1 >= firstIndex) {
            int left = binarySearch(seats, first, firstIndex, middle - 1);
            if (left != -1) {
                return left;
            }
        }

        if (middle + 1 <= lastIndex) {
            int right = binarySearch(seats, first, middle + 1, lastIndex);
            if (right != -1) {
                return right;
            }
        }

        return -1;
    }

    public void swapStudent(String first, int targetSeat) {
        Student temp;
        int location = findStudent(first);
        if (location == -1) {
            return;
        }

        temp = seats[location];
        seats[location] = seats[targetSeat];
        seats[targetSeat] = temp;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < seats.length - 1; i++) {
            String name = "";
            if (seats[i] != null) {
                name = seats[i].getFirst();
            }

            s += String.format("%d\t%s\n", i, name);
        }

        return s;
    }
}