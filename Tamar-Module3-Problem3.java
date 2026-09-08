import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("\n--- Temperature Conversion ---");
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Converted by: Marian Tamar");
        
        scanner.close();
    }
}
