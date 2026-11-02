package day22;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Fibonacci series:");
        int num = sc.nextInt();

        fibonacciSeries(num, 1);

        sc.close();
    }

    // Prints Fibonacci series
    private static void fibonacciSeries(int length, int start) {

        if (start > length) {
            return;
        }

        System.out.print(fibonacciNumber(start) + " ");

        fibonacciSeries(length, start + 1);
    }

    // Calculates Fibonacci number
    private static int fibonacciNumber(int num) {

        if (num == 1) {
            return 0;
        } 
        else if (num == 2) {
            return 1;
        } 
        else {
            return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
        }
    }
}