package Array.Task38;

import lombok.NonNull;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ArrayTask38 {
    public static <T> T getMajorityElement(@NonNull final T[] arr) {
        final HashMap<T, Integer> valuesCount = new HashMap<>();
        for (final T val : arr) {
            if (valuesCount.containsKey(val)) {
                valuesCount.put(val, valuesCount.get(val) + 1);
            } else {
                valuesCount.put(val, 1);
            }
        }
        Map.Entry<T, Integer> majorityEntry = valuesCount.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);
        return (majorityEntry != null && majorityEntry.getValue() > arr.length / 2)? majorityEntry.getKey() : null;
    }
}
