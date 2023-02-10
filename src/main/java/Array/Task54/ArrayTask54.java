package Array.Task54;

import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

public class ArrayTask54 {
    public static boolean hasSubArraySumZero(@NonNull final int[] arr) {
        final Set<Integer> set = new HashSet<>();
        set.add(0);
        int subArraySum = 0;
        for (int val : arr) {
            subArraySum += val;
            if (set.contains(subArraySum)) return true;
            set.add(subArraySum);
        }
        return false;
    }
}
