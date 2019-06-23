import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] nums = new int[]{1000,6,89,435,68,10,176};
        int x = nums [0];
        int y = nums[0];
        for (int i=0; i<nums.length; i++){
            if (nums[i]>=x){
                x=nums[i];
            }
            System.out.println("Максимальное значение "+ x);
        }
    }
}
