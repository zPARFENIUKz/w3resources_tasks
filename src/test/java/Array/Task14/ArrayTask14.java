package Array.Task14;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTask14 {
    public static <T> List<T> getCommon(@NonNull final T[] arr1, @NonNull final T[] arr2) {
        HashSet<T> arr1Set = Arrays.stream(arr1).collect(Collectors.toCollection(HashSet::new));
        List<T> common = new ArrayList<>();
        for (final T val : arr2) {
            if (arr1Set.contains(val)) {
                common.add(val);
            }
        }
        return common;
    }
}
