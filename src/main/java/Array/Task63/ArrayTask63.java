package Array.Task63;

import lombok.NonNull;

import java.util.stream.IntStream;

public class ArrayTask63 {
    public static long[] getProdsEveryOtherElements(@NonNull final int[] arr) {
        if (arr.length < 2) throw new IllegalStateException("arr length must be at least 2");
        long[] result = new long[arr.length];
        long prev_prod = 1;
        Integer next_prod = null;
        for (int i = 0; i < arr.length; ++i) {
            if (next_prod == null || arr[i] == 0) {
                next_prod = IntStream.range(i + 1, arr.length)
                        .boxed()
                        .map(k -> arr[k])
                        .reduce((a, b) -> a * b).orElse(1);
            }
            if (arr[i] != 0) {
                next_prod /= arr[i];
            }
            result[i] = prev_prod * next_prod;
            prev_prod *= arr[i];
        }
        return result;
    }
}
