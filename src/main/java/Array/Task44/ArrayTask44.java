package Array.Task44;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask44 {
    public static int getPossibleTrianglesCount(@NonNull final int[] arr) {
        if (arr.length < 3) throw new IllegalArgumentException("arr.length must be at least 3");
        final int[] sorted = Arrays.stream(arr).sorted().toArray();
        int count = 0;
        for (int i = 0; i < sorted.length - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < sorted.length; ++j) {
                while (k < sorted.length && sorted[i] + sorted[j] > sorted[k])
                    ++k;
                if (k > j)
                    count += k - j - 1;
            }
        }
        return count;
    }
}
