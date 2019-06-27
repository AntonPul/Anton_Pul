public class Task_15 {
    public static void main(String[] args) {
        int i;
        int n = 10;
        int arr [] = new int[n];
        for (i=0; i<n; i++){
            arr [i] = (int) (Math.random()*11);
            System.out.print(" "+arr[i]);
        }
        System.out.print(" перевернутый массив");
for (i=0; i<n/2; i++){
    int rev = arr [i];
    arr [i] = arr [n - 1 -i];
    arr [n - 1 - i] = rev;

}
        System.out.print("\n");
for (i=0; i<n; i++);
        System.out.print(" " + arr[i]);
    }
}
