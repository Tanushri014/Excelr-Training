
package day14;

public class MultiThreadingUsingLambda2 {

    public static void main(String[] args) {

        // First thread
        Runnable r1 = () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());

            for (int i = 0; i < 1000; i++) {
                System.out.println("\t" + i);
            }
        };

        Thread tx = new Thread(r1);
        tx.start();

        // Second thread
        Runnable r2 = () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());

            for (int i = 1000; i < 2000; i++) {
                System.out.println("\t" + i);
            }
        };

        Thread ty = new Thread(r2);
        ty.start();
    }
}

