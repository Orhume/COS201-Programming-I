import java.util.Scanner;
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following details for the item:");        
        System.out.print("Item name: ");
        String itemName = input.nextLine();
        System.out.print("Item price: ");
        double price = input.nextDouble();
        System.out.print("Quantity of the item(s): ");
        int quantity = input.nextInt();

        double totalCost = price * quantity;

        System.out.println("\n--- PURCHASE SUMMARY ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: ₦%.2f%n", price);
        System.out.printf("Total Cost: ₦%.2f%n", totalCost);
        input.close();
    }
}