package day17;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch4 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the amount you want to exchange:");
    int amount = sc.nextInt();

    System.out.println("Enter how many denominations are there in your country:");
    int no_of_notes = sc.nextInt();

    int currency[] = new int[no_of_notes];
    int notes[] = new int[no_of_notes];

    System.out.println("Enter denominations one by one:");

    for (int i = 0; i < no_of_notes; i++) {
        currency[i] = sc.nextInt();
    }

    // Sort denominations in descending order
    SelectionSort.selection_sort(currency);

    System.out.println("Sorted denominations: "
            + Arrays.toString(currency));

    // Calculate the number of notes required
    for (int i = 0; i < currency.length; i++) {
        notes[i] = amount / currency[i];
        amount = amount % currency[i];
    }

    System.out.println("Number of notes: "
            + Arrays.toString(notes));

    // Display denominations and their counts
    for (int i = 0; i < currency.length; i++) {
        if (notes[i] != 0) {
            System.out.println(currency[i] + " x " + notes[i]);
        }
    }

    if (amount != 0) {
        System.out.println("Remaining amount: " + amount);
    }

    sc.close();
}


}
