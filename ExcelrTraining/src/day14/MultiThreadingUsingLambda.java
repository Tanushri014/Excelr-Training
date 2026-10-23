
package day14;

public class MultiThreadingUsingLambda {

    public static void main(String[] args) {

        // First thread
         new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());

            for (int i = 0; i < 1000; i++) {
                System.out.println("\t" + i);
            }
        }).start();

        
        // Second thread
        new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());

            for (int i = 1000; i < 2000; i++) {
                System.out.println("\t" + i);
            }
        }).start();

        ;
    }
}

