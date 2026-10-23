package day14;

import java.util.Arrays;

import day3.PrimeNumber2;

public class StreamingApiDemo5 {


public static void main(String[] args) {

    int arr[] = {23, 18, 25, 40, 29};

//    Arrays.stream(arr)
//        .filter(num -> {
//            int flag = 0;
//
//            if (num < 2) {
//                return false;
//            }
//
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    flag = 1;
//                    break;
//                }
//            }
//
//            return flag == 0;
//        })
//        .forEach(n -> System.out.println(n + " is Prime"));

 
    Arrays.stream(arr).filter(PrimeNumber2::checkPrime).forEach(n->System.out.println(n));
}


}
