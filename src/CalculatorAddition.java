import java.util.Scanner;

public class CalculatorAddition {
    public static double add (double valueOne, double valueTwo){
        double valuesAdded=valueOne+valueTwo;
        return valuesAdded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//////////// LOMMEREGNER ////////////");
        double firstValue = scanner.nextDouble();
        System.out.println(firstValue);
        String method = scanner.nextLine();
        System.out.println();
        double secondValue = scanner.nextDouble();
    }
}
