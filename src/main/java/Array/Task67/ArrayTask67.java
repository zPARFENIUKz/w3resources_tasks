package Array.Task67;

import lombok.NonNull;

public class ArrayTask67 {
    public static long getLargestContiguousSubarraySumInCircularArr(@NonNull final int[] arr) {
        if (arr.length < 1) throw new IllegalArgumentException("arr is empty");
        int min_pos = 0;
        long max_sum = arr[0];
        long local_sum = arr[0];
        int start_pos = 0;
        for (int i = 1;;i = (i + 1) % arr.length) {
            if (i == min_pos || i == start_pos) break;
            local_sum += arr[i];
            if (local_sum <= 0) {
                start_pos = i;
                local_sum = 0;
            } else if (local_sum > max_sum){
                max_sum = local_sum;
            }
            if (arr[i] > max_sum) {
                max_sum = arr[i];
                start_pos = i;
            }
            if (arr[i] < arr[min_pos]) min_pos = i;
        }
        return max_sum;
    }
}
