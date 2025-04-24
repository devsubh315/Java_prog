// Parent class - Calculator (Abstraction + Encapsulation)
class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Methods for basic operations (can be overridden)
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
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

// Child class - AdvancedCalculator (Inheritance + Polymorphism)
class AdvancedCalculator extends Calculator {

    public AdvancedCalculator(double num1, double num2) {
        super(num1, num2);
    }

    // Overriding method to show custom behavior
    @Override
    public double multiply() {
        System.out.println("Multiplying using AdvancedCalculator");
        return super.getNum1() * super.getNum2();
    }

    public double power() {
        return Math.pow(super.getNum1(), super.getNum2());
    }
}

// Main class to run the demo
public class CalculatorDemo {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator(5, 2);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
        System.out.println("Power: " + calc.power());
    }
}
