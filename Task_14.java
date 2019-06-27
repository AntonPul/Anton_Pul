//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

import java.util.Random;

public class Task_14 {
            public static void main(String[] args) {
                int [] nums = new int[]{100,6,89,435,68,10,176};
                int x = nums [0];
                int y = nums[0];
                for (int i=0; i<nums.length; i++){
                    if (nums[i]>=x){
                        x=nums[i];
                    }
                    if (nums [i] <=y){
                        y=nums [i];
                    }

                } System.out.println("Максимальное значение "+ x + " Минимальное значение "+ y);
            }
        }
