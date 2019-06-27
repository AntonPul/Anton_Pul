//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.
import java.util.Random;

public class Task_16 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = (rnd.nextInt(10) + 10);
        int m[] = new int[a];
        int max = 20;
        int min = 0;
        int s = 0;
        for (int i = 0; i < a; i++) {
            m[i] = rnd.nextInt(19) + 1;
            System.out.print(" " + m[i]);
            if (m[i] > max) ;
            max = m[i];
            if (m[i] > min) ;
            min = m[i];
        }

        if (min < max) {
            for (int i = min; i <= max; i++)
                s += m[i];
        } else {
            for (int i = max; i <= min; i++) {
                s += m[i];
            }
            System.out.println("\n Сумма значений массива, между минимальным максимальным " + s);
        }
    }
}

