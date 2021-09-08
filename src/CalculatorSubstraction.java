import java.util.Scanner;
public class CalculatorSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Første nummer ind her: ");
        int fNumb = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Andet nummer ind her: ");
        int lNumb = scanner1.nextInt();

        subtraction(fNumb,lNumb);

    }
    public static void subtraction(int first, int second){

        int result = first-second;

        System.out.println("Your result gonna be "+result);

    }
}
