import java.util.Scanner;

public class ShoppingBillWithVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        double subtotal = price * quantity;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;
        
        System.out.println("\n--- Shopping Bill ---");
        System.out.println("Subtotal: PHP " + subtotal + "; VAT: PHP " + vat + "; Total: PHP " + total);
        System.out.println("Prepared by: Marian Tamar");
        
        scanner.close();
    }
}
