package school.basic;

import java.util.Arrays;

public class School {
    String name;
    int numberOfStudents;
    Student[] students;
    int currentStudent;

    public School(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.students = new Student[numberOfStudents];
        this.currentStudent = 0;
    }

    public void addStudent(Student stud) {
        if (currentStudent == numberOfStudents) {
            System.out.println("School is full, couldnt add " + stud);
            return;
        }
        students[currentStudent] = stud;
        System.out.println(stud + " added to school");
        currentStudent++;
    }

    public void deleteStudent(int studentToDelete) {

        if (studentToDelete < 0) {
            System.out.println("Are you fucking stupid?");
            return;
        }

        System.out.println("Deleted student: " + students[studentToDelete]);

        for (int i = studentToDelete; i < numberOfStudents - 1; i++) {
            if (students[i] == null) {
                break;
            }
            students[i] = students[i + 1];
        }
        currentStudent--;
        students[currentStudent] = null;
    }

    public void print() {
        System.out.println(Arrays.toString(students));
    }

    public double getAverageAge() {
        double totalAge = 0;

        for (Student student : students) {
            if (student == null) {
                break;
            }
            totalAge += student.age;
        }

        return totalAge / currentStudent;
    }
}
