package Array.Task52;

import lombok.NonNull;

public class ArrayTask52 {
    public static void evenFirst(@NonNull final int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j;) {
            while (i < j && arr[i] % 2 == 0) ++i;
            while (j > i && arr[j] % 2 == 1) --j;
            if (i != j) {
                final int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
