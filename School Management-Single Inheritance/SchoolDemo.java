package studentmanagement;
import java.util.Scanner;

public class SchoolDemo {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter student age: ");
        student.setAge(sc.nextInt());

        System.out.print("Enter roll number: ");
        student.setRollNo(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter course: ");
        student.setCourse(sc.nextLine());

        System.out.println("\n--- Student Details ---");

        student.displayPersonDetails();
        student.displayStudentDetails();

        sc.close();
    }
}
