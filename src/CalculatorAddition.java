import java.util.Scanner;

public class CalculatorAddition {
    public static int add (int valueOne, int valueTwo){
        int valuesAdded=valueOne+valueTwo;
        return valuesAdded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//////////// LOMMEREGNER ////////////"+"\n"+
                "Provide first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Provide second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Result equals: "+add(firstValue,secondValue));
    }
}
