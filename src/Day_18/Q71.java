package Day_18;

public class Q71 {
    public static void main(String[] args) {
        //Write a program to Binary search.

        int[] arr1 = {2, 8, 9, 23, 41, 48, 55, 56, 78, 82,90, 97 };
        int[] arr2 = {97, 88, 78, 62, 51, 43, 33, 20, 17, 11, 5};
        int target1 = 56;
        int target2 = 78;

        int search1 = binarySearch(arr1, target1);
        int search2 = binarySearch(arr2, target2);

        System.out.println(search1);
        System.out.println(search2);
    }

    static boolean isAsc(int[] arr){
        return arr[0] <= arr[arr.length - 1];
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end= arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAsc(arr)){
                if(arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return  - 1;
    }
}
