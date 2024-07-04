package academy.devdojo.java.test;

import academy.devdojo.java.domain.Location;
import academy.devdojo.java.domain.Seminar;
import academy.devdojo.java.domain.Student;
import academy.devdojo.java.domain.Teacher;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Location location = new Location("Example address");
        Student student1 = new Student("Jhon", 16);
        Student student2 = new Student("David", 17);
        Teacher teacher = new Teacher("Charlie", "Math");

        Seminar seminar = new Seminar("Example seminar", new Student[]{student1, student2}, location);
        teacher.setSeminars(new Seminar[]{seminar});
        student1.setSeminar(seminar);

        seminar.print();
        student1.print();

        input.close();
    }
}
