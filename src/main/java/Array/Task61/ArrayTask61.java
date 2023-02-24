package Array.Task61;

import lombok.NonNull;

public class ArrayTask61 {
    public static <T extends Comparable<? super T>> void everySecondLarderThanItsNeighbors(@NonNull final T[] arr) {
        if (arr.length < 3) throw new IllegalStateException("arr length must be at least 3");
        for (int i = 1; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                final T localMax = max(arr[i - 1], arr[i], arr[i + 1]);
                if (localMax.equals(arr[i - 1])) {
                    swap(arr, i - 1, i);
                } else if (localMax.equals(arr[i + 1])) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                }
            }
        }
    }

    private static <T extends Comparable<? super T>> T max(T a, T b, T c) {
        final int comp = a.compareTo(c);
        if (comp > 0) {
            return b.compareTo(a) > 0? b : a;
        } else {
            return b.compareTo(c) > 0? b : c;
        }
    }

    private static <T extends Comparable<? super T>> void swap(T[] arr, int index1, int index2) {
        final T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
