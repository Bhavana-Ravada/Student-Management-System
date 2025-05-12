import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, age, grade);
        students.add(student);
        System.out.println("Student added successfully.\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.\n");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public void updateStudent() {
        System.out.print("Enter ID of the student to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new Name: ");
                s.setName(scanner.nextLine());
                System.out.print("Enter new Age: ");
                s.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Enter new Grade: ");
                s.setGrade(scanner.nextLine());
                System.out.println("Student updated successfully.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public void deleteStudent() {
        System.out.print("Enter ID of the student to delete: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student removed successfully.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }
}
