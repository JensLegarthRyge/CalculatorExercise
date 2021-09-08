import java.util.Scanner;

public class CalculatorExercise {
    public static void main(String[] args) {
        System.out.println("///////////////// CALCULATOR /////////////////");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please input value: ");
        int valueOne = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Would you like to +, - or * ?");
        String method = scanner1.nextLine();

        if (method.equalsIgnoreCase("+")){
            System.out.println("Please input value to add: ");
          int valueTwo = scanner.nextInt();
            System.out.println(valueOne+" + "+valueTwo+" = "+add(valueOne,valueTwo));

        } else if (method.equalsIgnoreCase("-")){
            System.out.println("Please input value to subtract: ");
            int valueTwo = scanner.nextInt();
            System.out.println(valueOne+" - "+valueTwo+" = "+subtract(valueOne, valueTwo));

        } else if (method.equalsIgnoreCase("*")){
            System.out.println("Please input value to multiply by: ");
            int valueTwo = scanner.nextInt();
            System.out.println(valueOne+" * "+valueTwo+" = "+multiply(valueOne, valueTwo));

        } else if (method.equalsIgnoreCase("x")){
            System.out.println("Please input value to multiply by: ");
            int valueTwo = scanner.nextInt();
            System.out.println(valueOne+" * "+valueTwo+" = "+multiply(valueOne, valueTwo));

        } else{
            System.out.println("fuck dig");
        }

    }
    public static int add (int valueOne, int valueTwo){
        int valuesAdded=valueOne+valueTwo;
        return valuesAdded;
    }
    public static int subtract(int first, int second) {
        int result2 = first-second;
        return result2;
    }
    public static int multiply (int valueOne, int valueTwo) {
        int calculate = valueOne * valueTwo;
        return calculate;
    }
}
