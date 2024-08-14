package RecursionAndBacktracking;

import java.util.Arrays;

public class CheckIsArrayInSortedOrderUsingIterative {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4};

//        int[] arr = {1, 2, 3, 4, 5};
//        arr = new int[]{1, 3, 2, 4, 5};

        int n = arr.length;
        boolean ab = isArraySortedOrder(arr, n);
        System.out.println("The Array " + Arrays.toString(arr) + " " + ((ab) ? "is" : "is not ") + "sorted.");
    }
    public static boolean isArraySortedOrder(int[] array, int n) {
        if (n == 0 || n == 1) return true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
//                System.out.println("Enter value of " + array[i - 1] + ">" + array[i]);
                return false;
            }
        }
        return true;
    }
}
