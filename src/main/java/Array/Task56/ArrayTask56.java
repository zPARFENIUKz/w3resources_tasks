package Array.Task56;

import lombok.NonNull;

public class ArrayTask56 {
    public static void sortBinaries(@NonNull final int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; ++i) {
            if (arr[i] != 0 && arr[i] != 1 || arr[j] != 0 && arr[j] != 1) throw new IllegalArgumentException("arr must contains only 0 and 1");
            while (i < j && arr[i] == 0) ++i;
            while (j > i && arr[j] == 1) --j;
            if (i < j) swap(arr, i, j);
        }
    }

    private static void swap(final int[] arr, final int index1, final int index2) {
        final int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
