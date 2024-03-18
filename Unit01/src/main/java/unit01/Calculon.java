package unit01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculon {
    public static double add (double a, double b) {
        return a + b;
    }

    public static double sub (double a, double b) {
        return a - b;
    }

    public static double mul (double a, double b) {
        return a * b;
    }

    public static double div (double a, double b) {
        return a / b;
    }

    public static double raise (double a, double b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter two numbers: ");
        try {
            double a = in.nextDouble ();
            double b = in.nextDouble ();

            System.out.println (add (a, b));
            System.out.println (sub (a, b));
            System.out.println (mul (a, b));
            System.out.println (div (a, b));
            System.out.println (raise (a, b));
        } catch (InputMismatchException ime) {
            System.out.println ("All values must be numbers.");
        }

        in.close ();
    }
}
