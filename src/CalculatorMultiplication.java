import java.util.Scanner;

public class CalculatorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//////////// LOMMEREGNER ////////////" + "\n");
        System.out.println("You are now in the multiplication tab");
        System.out.println("Please enter your first number: ");
        int valueOne = scanner.nextInt();
        System.out.println("Please enter your second number to multiply: ");
        int valueTwo = scanner.nextInt();

        System.out.println("Result equals: " + multiply(valueOne,valueTwo));
//


    }
    public static int multiply (int valueOne, int valueTwo) {
        int calculate = valueOne * valueTwo;
        return calculate;
    }
}
