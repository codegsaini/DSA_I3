package november_3.classwork;

import java.util.Scanner;

public class QuickSort {

    static int pivot = 0;
    static int left = 0;
    static int right;
    static int length;

    static int[] array;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        right = length;

        for (int i=0; i<length; i++) {
            array[i] = scan.nextInt();
        }

        QuickSort(left, right);

    }


    static void QuickSort(int left, int right) {

        if (left < right) {

        }

    }

    static void swapLandR() {
        int temp = right;
        right = left;
        left = temp;
    }

    static void swapRandP() {
        int temp = right;
        right = pivot;
        pivot = temp;
    }

}
