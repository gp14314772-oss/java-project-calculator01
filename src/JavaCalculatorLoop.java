import java.util.Scanner;

public class JavaCalculatorLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Bye!");
                break;
            }

            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble(); // Precise calculations ke liye double
            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();
            double result = 0;

            switch (choice) {
                case 1: result = n1 + n2; break;
                case 2: result = n1 - n2; break;
                case 3: result = n1 * n2; break;
                case 4:
                    if (n2 != 0) result = n1 / n2;
                    else System.out.println("Error: Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue; // Loop ke start pe wapas le jayega
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Final Result: " + result);
            }

        } while (choice != 5);

        sc.close();
    }
}