package Day_25;

public class Q98 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "plane";
        System.out.print("Common characters: ");

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    System.out.print(str1.charAt(i) + " ");
                    break;
                }
            }
        }
    }
}
