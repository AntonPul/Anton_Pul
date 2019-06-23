//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

import java.util.Random;
public class Task_10 {
        public static void main(String[] args) {
            Random rand = new Random();
            int x = rand.nextInt(10) + 5;
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }

            System.out.println(x);
            System.out.println(result);
        }
    }


