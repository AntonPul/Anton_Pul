//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество
public class Task_18 {
    public static void main(String[] args) {

    String str = "То, что справедливо и несправедливо – не дано судить людям. Люди вечно заблуждались и будут заблуждаться, и ни в чем больше, как в том, что они считают справедливым и несправедливым.";
    int n = str.length();
    char symbol;
        for (int i = 0; i < n; i++){
            symbol = str.charAt(i);
            if (symbol==',' || symbol=='.' || symbol=='-'){
                n++;
            }
        }

        System.out.println("Количество знаков препинания = "+ n);}
}
