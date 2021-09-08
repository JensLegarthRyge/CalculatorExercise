import java.util.Scanner;

public class CalculatorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are now in the multiplication tab");
        System.out.println("Please enter your first number");
        double valueOne = scanner.nextDouble();
        System.out.println("Please enter your second number to multiply");
        double valueTwo = scanner.nextDouble();

        System.out.println("Your number is gonna be " + multiply(valueOne,valueTwo));



    }
    public static String multiply (double valueOne, double valueTwo) {
        double calculate = valueOne * valueTwo;
        return String.format("%.2f",calculate);
    }
}
