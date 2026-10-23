package day3;

import java.util.Scanner;

public class PrimeNumber2 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter A Number:");
    int num = sc.nextInt();

    if (checkPrime(num)) {
        System.out.println("Prime");
    } else {
        System.out.println("Not Prime");
    }

    sc.close();
}

public static boolean checkPrime(int num) {

    if (num <= 1) {
        return false;
    }

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}


}
