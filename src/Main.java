import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Calculator App!");
        System.out.println("Available operations:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.println("5. Clear (C)");
        System.out.println("6. Exit (Q)");

        while (running) {
            System.out.println("\nCurrent result: " + calculator.getResult());
            System.out.print("Enter operation (1-6): ");
            String choice = scanner.nextLine();

            if (choice.equals("6") || choice.equalsIgnoreCase("Q")) {
                running = false;
                continue;
            }

            if (choice.equals("5") || choice.equalsIgnoreCase("C")) {
                calculator.clear();
                System.out.println("Calculator cleared!");
                continue;
            }

            System.out.print("Enter number: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case "1":
                        calculator.add(number);
                        break;
                    case "2":
                        calculator.subtract(number);
                        break;
                    case "3":
                        calculator.multiply(number);
                        break;
                    case "4":
                        try {
                            calculator.divide(number);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Invalid operation!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please try again.");
            }
        }

        System.out.println("Thank you for using Calculator App!");
        scanner.close();
    }
}