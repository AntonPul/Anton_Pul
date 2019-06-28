//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1


public class Task_17 {
    public static void main(String[] args) {
        int a = 25;
        int[][] arr =new int[a][];
        for (int i=0; i<a; i++){
            arr [i]= new int [a];
        }
        for (int i=0; i<a/2+1; i++){
            for (int j=0; j<i+1; j++){
                arr[i][j]= 1;
                arr [i][a-1-j]=1;
                arr[a-1-i][j]=1;
                arr[a-1-i][a-1-j]=1;

            }}
        for (int i=0; i<a; i++ ){
            for (int j=0; j<a; j++){
                System.out.print    (arr[i][j]+" ");
            }System.out.println();
        }

        }

    }