import java.util.Scanner;

public class CourseEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter subject code: ");
        String subjectCode = scanner.nextLine();
        
        System.out.print("Enter subject title: ");
        String subjectTitle = scanner.nextLine();
        
        System.out.print("Enter units: ");
        int units = scanner.nextInt();
        
        System.out.print("Enter section letter: ");
        char sectionLetter = scanner.next().charAt(0);
        
        System.out.println("\n--- Course Enrollment Record ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Title: " + subjectTitle);
        System.out.println("Units: " + units);
        System.out.println("Section: " + sectionLetter);
        System.out.println("Programmed by: Marian Tamar");
        
        scanner.close();
    }
}
