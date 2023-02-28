package Array.Task75;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask75 {
    public static int getLargestGap(@NonNull final Integer[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr.length must be at least 2 to fina the gap");
        Arrays.sort(arr);
        Integer maxGap = null;
        for (int i = 1; i < arr.length; ++i) {
            if (maxGap == null || arr[i] - arr[i - 1] > maxGap) {
                maxGap = arr[i] - arr[i - 1];
            }
        }
        return maxGap;
    }
}
