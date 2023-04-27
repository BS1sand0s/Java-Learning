package ClassBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(41, "Satwik", "JSD"));
        students.add(new Student(32, "Gourav", "Apti"));
        students.add(new Student(53, "Nilesh", "JSD"));
        students.add(new Student(64, "Sandip", "Apti"));
        students.add(new Student(25, "Shyam", "JSD"));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course to filter for: ");
        String course = scanner.nextLine();
        scanner.close();


        Predicate<Student> coursePredicate = student -> student.getCourse().equals(course);
        List<Student> filteredStudents = filterStudents(students, coursePredicate);


        for (Student student : filteredStudents) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Course: " + student.getCourse());
        }
    }

    private static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
