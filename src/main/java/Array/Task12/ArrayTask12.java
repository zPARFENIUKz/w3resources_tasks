package Array.Task12;

import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

public class ArrayTask12 {
    public static <T> Set<T> findDuplicates(@NonNull final T[] arr) {
        final Set<T> values = new HashSet<>();
        Set<T> duplicates = new HashSet<>();
        for (final T val : arr) {
            if (values.contains(val)) {
                duplicates.add(val);
            } else {
                values.add(val);
            }
        }
        return duplicates;
    }

}
