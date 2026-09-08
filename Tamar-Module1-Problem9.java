import java.util.Scanner;

public class OnlineGamePlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter character name: ");
        String charName = scanner.nextLine();
        
        System.out.print("Enter level: ");
        int level = scanner.nextInt();
        
        System.out.print("Enter experience points: ");
        long expPoints = scanner.nextLong();
        
        scanner.nextLine(); // Consume newline
        System.out.print("Enter rank: ");
        String rank = scanner.nextLine();
        
        System.out.println("\n--- Player Profile ---");
        System.out.println("Username: " + username);
        System.out.println("Character Name: " + charName);
        System.out.println("Level: " + level);
        System.out.println("Experience Points: " + expPoints);
        System.out.println("Rank: " + rank);
        System.out.println("Created by: Marian Tamar");
        
        scanner.close();
    }
}
