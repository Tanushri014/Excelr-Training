package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionChaining {

    public static void main(String[] args) {
        try {
            takeInput();
        } catch (Exception ex) {
            System.out.println("Top-level error: " + ex.getMessage());
            System.out.println("Root cause     : " + ex.getCause());
        }
    }

    // Level 1: lowest level. Original exception happens here
    public static double divide(int a, int b) {
        return a / b;   // throws ArithmeticException if b == 0
    }

    // Level 2: catches low-level exceptions and CHAINS them into a new one
    public static boolean takeInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number:");
            int n1 = sc.nextInt();
            System.out.println("Enter number:");
            int n2 = sc.nextInt();

            double result = divide(n1, n2);
            System.out.println("Result = " + result);
            return true;

        } catch (InputMismatchException ex) {
            // new exception, original passed as cause
            throw new Exception("Invalid input: please enter integers only", ex);

        } catch (ArithmeticException ex) {
            throw new Exception("Calculation failed", ex);
        }
    }
}