//Найдите сумму первых n целых чисел, которые делятся на 3

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(10);
        int sum = 0;
        for (int i =1; i<=x; i++)
            sum += i*3;
        System.out.println("Сумма "+x+" чисел кратных 3м = " + sum);
    }
}
