package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> itr = numbers.listIterator();
        while (itr.hasNext()) {
            Integer value = itr.next();
            if (value % 2 == 1) {
                itr.set(100);
            }
        }
        System.out.println(numbers);
    }
}