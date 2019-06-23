//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int result = 1;
        for (int i= 1; i <= x; i++){
            result = result*i;
        }

        System.out.println(x);
        System.out.println(result);}


}