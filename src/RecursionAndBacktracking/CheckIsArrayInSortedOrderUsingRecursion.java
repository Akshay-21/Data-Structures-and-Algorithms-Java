package RecursionAndBacktracking;

import java.util.Arrays;

public class CheckIsArrayInSortedOrderUsingRecursion {
    public static void main(String[] args) {

        int[] a = new int[]{3, 4, 6, 7, 8, 9};  // Sorted.
//        int[] a = new int[]{5, 3, 4, 6, 7, 8, 9}; // Unsorted.
        int index = a.length;
        boolean isSorted = checkIsArrayInSortedOrder(a, index);
        System.out.println("The Array " + Arrays.toString(a) + " " + (isSorted ? "is " : " is not ") + "sorted.");
    }

    public static boolean checkIsArrayInSortedOrder(int[] a, int index) {
        if (index == 0 || index == 1) {
            return true;
        }

        return a[index - 2] <= a[index - 1] && checkIsArrayInSortedOrder(a, index - 1);
    }
}
