package Day_25;

public class Q97 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i = i + 1;
            }
            else {
                arr3[k] = arr2[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j = j + 1;
            k = k + 1;
        }

        System.out.println("Merged Array:");
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
