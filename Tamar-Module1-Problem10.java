import java.util.Scanner;

public class EmployeePayrollRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        
        System.out.print("Enter employee ID: ");
        String empId = scanner.nextLine();
        
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        
        System.out.println("\n--- Payroll Information Record ---");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Position: " + position);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Processed for: Marian Tamar");
        
        scanner.close();
    }
}
