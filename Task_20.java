public class Task_20 {
    public static void main(String[] args) {
        String s = "То, что справедливо и несправедливо – не дано судить людям. Люди вечно заблуждались и будут заблуждаться, и ни в чем больше, как в том, что они считают справедливым и несправедливым.";
StringBuilder l = new StringBuilder();
String[] words= s.split("\\s+");
for (String word: words)
    l.append(word.toCharArray()[word.length()-1]);
    System.out.println("String: "+ s);
        System.out.println("Result: "+ l.toString());
    }
}
