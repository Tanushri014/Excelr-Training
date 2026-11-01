package day19;

//Rules:
//
//0 → Safe cloud. You can land on it.
//1 → Charged cloud. You cannot land on it.
//You can jump either 1 step or 2 steps.
//You must reach the last cloud.
//Find the minimum number of jumps.

public class CloudJumps {

    public static void main(String[] args) {

        int clouds[] = {0, 0, 1, 0, 0, 1, 0, 0};

        int j = 0;
        int jumps = 0;

        int i = 0;

        while (i < clouds.length - 1) {

            j = i + 2;

            if (j < clouds.length && clouds[j] == 0) {

                i = i + 2;
                jumps++;

            } else {

                i = i + 1;
                jumps++;

            }
        }

        System.out.println(jumps);
    }
}