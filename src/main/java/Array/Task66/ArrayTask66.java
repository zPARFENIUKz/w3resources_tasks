package Array.Task66;

import lombok.NonNull;

public class ArrayTask66 {
    public static long getLargestContiguousSubarraySum(@NonNull final int[] arr) {
        if (arr.length < 1) throw new IllegalArgumentException("arr is empty");
        int max = arr[0];
        int local_sum = 0;
        int max_sum = 0;
        for (int i : arr) {
            if (i > max) max = i;
            local_sum += i;
            if (local_sum < 0) local_sum = 0;
            if (local_sum > max_sum) max_sum = local_sum;
        }
        return (max <= 0)? max : max_sum;
    }
}
