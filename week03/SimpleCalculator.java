import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Select an operator ('+', '-', '*' or '/'): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter your second number: ");
        double b = input.nextDouble();
        double result = 0;
        switch (operator) {
            case '+':
                result = a +  b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0){
                    System.out.print("Error: Division by zero is not allowed.");
                    input.close();
                    return;
                } else {
                    double quotient = a / b;
                    result = quotient;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                input.close();
                return;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
        input.close();
    }
}