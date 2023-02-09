package Array.Task48;

import lombok.NonNull;

public class ArrayTask48 {
    public static void rearrangeArrayNegativeFirst(@NonNull final int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; ++i) {
            while (j > i && arr[j] > 0) --j;
            if (i != j && arr[i] >= 0) {
                final int buff = arr[i];
                arr[i] = arr[j];
                arr[j] = buff;
            }
        }
    }
}
