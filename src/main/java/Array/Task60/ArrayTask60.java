package Array.Task60;

import lombok.NonNull;

import java.util.Random;

public class ArrayTask60 {
    public static void shuffle(@NonNull final int[] arr) {
        final Random random = new Random();
        for (int i = 0; i < arr.length; ++i) {
            swap(arr, i, random.nextInt(arr.length));
        }
    }

    private static void swap(final int[] arr, int index1, int index2) {
        final int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
