package Day_25;

public class Q99 {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Amit", "Neha", "Priya", "Karan"};
        String temp;

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
