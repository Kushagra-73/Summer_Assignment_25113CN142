package Day_25;
public class Q100 {
    public static void main(String[] args) {

        String[] words = {"Apple", "Cat", "Elephant", "Dog", "Ball"};
        String temp;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {

                if (words[j].length() > words[j + 1].length()) {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
