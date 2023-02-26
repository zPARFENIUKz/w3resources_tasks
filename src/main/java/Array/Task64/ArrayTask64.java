package Array.Task64;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask64 {
    public static <T extends Comparable<? super T>> T[] getLargestBitonicSubarray(@NonNull final T[] arr) {
        if (arr.length < 3) throw new IllegalArgumentException("arr length must be at least 3");
        int start = 0;
        int end = 0;
        int next_start = 1;
        for (int i = 1; i < arr.length; i = next_start) {
            int new_start = next_start - 1;
            while (i < arr.length && arr[i].compareTo(arr[i - 1]) >= 0) ++i;
            next_start = i + 1;
            while (i < arr.length && arr[i].compareTo(arr[i - 1]) <= 0) ++i;
            if (end - start < i - 1 - new_start) {
                start = new_start;
                end = i - 1;
            }
        }
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
