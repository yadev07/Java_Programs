import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Operation {
    double a, b;

    Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract public double calculate();
}

class Addition extends Operation {
    Addition(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return a + b;
    }
}

class Subtraction extends Operation {
    Subtraction(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return a - b;
    }
}

class Multiply extends Operation {
    Multiply(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return a * b;
    }
}

class Division extends Operation {
    Division(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Zero_Division_Error..!\nDivision Not possible..!");
            return -1;
        }
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- CALCULATOR ---");
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. Additional Features");
            System.out.println("3. Show History");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int mainChoice = getIntInput();

            switch (mainChoice) {
                case 1:
                    arithmeticMenu();
                    break;
                case 2:
                    additionalFunctionsMenu();
                    break;
                case 3:
                    showHistory();
                    break;
                case 4:
                    System.out.println("Program Exits...!");
                    return;
                default:
                    System.out.println("Invalid choice! Please choose between 1-4.");
            }
        }
    }

    static void arithmeticMenu() {
        while (true) {
            System.out.println("\n--- Arithmetic Operations ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option (1-5): ");

            int choice = getIntInput();

            if (choice == 5)
                return;

            System.out.print("Enter 1st value: ");
            double a = getDoubleInput();
            System.out.print("Enter 2nd value: ");
            double b = getDoubleInput();

            Operation op = null;
            String operationName = "";

            switch (choice) {
                case 1:
                    op = new Addition(a, b);
                    operationName = "Addition";
                    break;
                case 2:
                    op = new Subtraction(a, b);
                    operationName = "Subtraction";
                    break;
                case 3:
                    op = new Multiply(a, b);
                    operationName = "Multiplication";
                    break;
                case 4:
                    op = new Division(a, b);
                    operationName = "Division";
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            double result = op.calculate();
            System.out.println("Result: " + result);
            history.add(operationName + ": " + a + ", " + b + " = " + result);
        }
    }

    static void additionalFunctionsMenu() {
        while (true) {
            System.out.println("\n--- Additional Functions ---");
            System.out.println("1. Square");
            System.out.println("2. Cube");
            System.out.println("3. Power");
            System.out.println("4. Square Root");
            System.out.println("5. Factorial");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option (1-6): ");

            int choice = getIntInput();

            if (choice == 6)
                return;

            double num, result = 0;
            long fact = 1;

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    num = getDoubleInput();
                    result = num * num;
                    System.out.println("Square: " + result);
                    history.add("Square of " + num + " = " + result);
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    num = getDoubleInput();
                    result = num * num * num;
                    System.out.println("Cube: " + result);
                    history.add("Cube of " + num + " = " + result);
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    double base = getDoubleInput();
                    System.out.print("Enter exponent: ");
                    double exponent = getDoubleInput();
                    result = Math.pow(base, exponent);
                    System.out.println("Power: " + result);
                    history.add("Power of " + base + "^" + exponent + " = " + result);
                    break;
                case 4:
                    System.out.print("Enter number: ");
                    num = getDoubleInput();
                    if (num >= 0) {
                        result = Math.sqrt(num);
                        System.out.println("Square Root: " + result);
                        history.add("Square Root of " + num + " = " + result);
                    } else {
                        System.out.println("Invalid input. Square root of negative number is not real.");
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    int n = getIntInput();
                    if (n < 0) {
                        System.out.println("Factorial not possible for negative numbers.");
                        break;
                    }
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial: " + fact);
                    history.add("Factorial of " + n + " = " + fact);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void showHistory() {
        System.out.println("\n--- Operation History ---");
        if (history.isEmpty()) {
            System.out.println("No operations performed yet.");
        } else {
            for (String entry : history) {
                System.out.println(entry);
                System.out.println();
            }
        }
    }

    static int getIntInput() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
                sc.next(); // Clear buffer
            }
        }
    }

    static double getDoubleInput() {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                sc.next(); // Clear buffer
            }
        }
    }
}