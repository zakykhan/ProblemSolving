package ProblemSolving;

import java.util.Arrays;

public class insertionSort {
    public static void insertionSort(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            int current = unsorted[i];
            int j = i;
            while (j > 0 && unsorted[j - 1] > current) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = current;
        }
    }

    public static void main(String args[]) {
        int[] unsorted = { 33, 1, 2, 11, 44, 23, 54, 65, 6, 75 };
        System.out.println("Original : "
                + Arrays.toString(unsorted));

        insertionSort(unsorted);

        System.out.println("Not Original : " + Arrays.toString(unsorted));
    }


}
