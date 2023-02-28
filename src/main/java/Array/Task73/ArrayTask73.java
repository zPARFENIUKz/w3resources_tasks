package Array.Task73;

import lombok.NonNull;


public class ArrayTask73 {
    public static <T extends Comparable<? super T>> T[] sortWhereTwoUnsorted(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr.length must be at least 2");
        int maxIndex = 0;
        Integer lastWrongIndex = null;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                lastWrongIndex = i;
            } else if (arr[i].compareTo(arr[maxIndex]) > 0){
                maxIndex = i;
            }
        }
        if (lastWrongIndex != null) {
            swap(arr, maxIndex, lastWrongIndex);
        }
        return arr;
    }

    private static <T extends Comparable<? super T>> void swap(final T[] arr, final int index1, final int index2) {
        final T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
