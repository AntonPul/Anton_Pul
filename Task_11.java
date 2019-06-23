//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

import java.util.Random;

public class Task_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(50);
        System.out.println(a);
        int i;
        for (i = 2; i < a; i++) {
            if (a % 2 == 0) {
                System.out.println(a + " непростое число");
            } else {
                System.out.println(a + " простое число");
            }
        }
    }
}

