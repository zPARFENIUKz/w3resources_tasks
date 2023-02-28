package Array.Task76;

import lombok.NonNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayTask76 {
    public static boolean isArrConsecutiveSortVersion(@NonNull final Integer[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] + 1 != arr[i]) return false;
        }
        return true;
    }

    public static boolean isArrConsecutiveHashSetVersion(@NonNull final Integer[] arr) {
        Set<@NonNull Integer> collect = Arrays.stream(arr).collect(Collectors.toCollection(HashSet::new));
        int counter = 0;
        for (final Integer val : collect) {
            if (!collect.contains(val + 1)) ++counter;
        }
        return counter <= 1;
    }
}
