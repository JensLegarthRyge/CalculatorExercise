import java.util.Scanner;
public class CalculatorSubstraction {
    public static void main(String[] args) {
        //Minus lommeregner
        //Version 1 (Med void)
       /* System.out.println("Welcome to the substraction calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first number here: ");
        int fNumb = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write your second number here: ");
        int lNumb = scanner1.nextInt();

        subtraction(fNumb,lNumb);

    }
    public static void subtraction(int first, int second){

        int result = first-second;

        System.out.println("Your result gonna be "+result);
*/

        //Version 2 (Uden void)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first number here: ");
        int fNumb = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write your second number here: ");
        int lNumb = scanner1.nextInt();

        int result = substraction(fNumb, lNumb);

        System.out.println("Your number gonna be "+result);
    }

    public static int substraction(int first, int second) {

        int result2 = first-second;
    return result2;
    }
}