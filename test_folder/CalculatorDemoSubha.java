import java.util.Scanner;

// Parent class
class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() { return num1; }
    public double getNum2() { return num2; }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

// Child class
class AdvancedCalculator extends Calculator {
    public AdvancedCalculator(double num1, double num2) {
        super(num1, num2);
    }

    public double power() {
        return Math.pow(getNum1(), getNum2());
    }

    @Override
    public double multiply() {
        System.out.println("Multiplying using AdvancedCalculator...");
        return super.multiply();
    }
}

// Main class
public class CalculatorDemoSubha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        AdvancedCalculator calc = new AdvancedCalculator(number1, number2);

        System.out.println("\n--- Results ---");
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        try {
            System.out.println("Division: " + calc.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Power: " + calc.power());

        scanner.close();
    }
}
