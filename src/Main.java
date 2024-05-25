import java.util.Scanner;

/**
 * @author PampSPP
 */

public class Main {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number:");

        float number = var.nextFloat();
        Float number1 = number;

        System.out.println("This number is a: "+ number1.getClass());
    }
}