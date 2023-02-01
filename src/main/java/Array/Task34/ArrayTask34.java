package Array.Task34;

import lombok.NonNull;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayTask34 {
    public static int getLongestConsecutiveSequenceLength(@NonNull final int[] arr) {
        if (arr.length == 0) return 0;
        Integer[] integers = Arrays.stream(arr).boxed().collect(Collectors.toCollection(TreeSet::new)).toArray(Integer[]::new);
        int count = 1;
        int maxCount = count;
        for (int i = 1; i < integers.length; ++i) {
            if (integers[i] == integers[i - 1] + 1) {
                ++count;
            } else {
                if (maxCount < count) maxCount = count;
                count = 1;
            }
        }
        return maxCount;
    }
}
