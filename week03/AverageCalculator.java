
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your course scores:");

        System.out.print("Course 1: ");
        double a = input.nextDouble();

        System.out.print("Course 2: ");
        double b = input.nextDouble();

        System.out.print("Course 3: ");
        double c = input.nextDouble();

        double total = a + b + c;
        double average = total / 3.0;

        System.out.println("\n--- STUDENT RESULT ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("Your course scores are: " + a + ", " + b + ", " + c);
        System.out.printf("Total score: %.2f%n", total);
        System.out.printf("Average score: %.2f%n", average);

        input.close();
    }
}
