import java.util.Scanner;

public class CalculatorAddition {
    public static int add (int valueOne, int valueTwo){
        int valuesAdded=valueOne+valueTwo;
        return valuesAdded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//////////// LOMMEREGNER ////////////"+"\n"+
                "Indtast dit første tal: ");
        int firstValue = scanner.nextInt();
        System.out.println("Indtast dit næste tal: ");
        int secondValue = scanner.nextInt();
        System.out.println("Resultatet er: "+add(firstValue,secondValue));
    }
}
