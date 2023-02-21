package Array.Task57;

import lombok.NonNull;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTask57 {
    public static int[] findMaxConsecutive(@NonNull final int[] arr) {
        if (arr.length == 0) return new int[0];
        if (arr.length == 1) return arr;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; ++i) {
            int min = arr[i];
            int max = arr[i];
            for (int j = i + 1; j < arr.length; ++j) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if (checkIfConsecutive(arr, i, j, min, max)) {
                    if (end - start < j - i) {
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    private static boolean checkIfConsecutive(final int[] arr, int i, int j, int min, int max) {
        final Set<Integer> values = IntStream.rangeClosed(min, max)
                .boxed()
                .collect(Collectors.toSet());
        for (int k = i; k <= j; ++k) {
            if (values.contains(arr[k])) {
                values.remove(arr[k]);
            } else return false;
        }
        return values.isEmpty();
    }
}
