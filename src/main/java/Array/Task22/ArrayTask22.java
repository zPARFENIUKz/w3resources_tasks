package Array.Task22;

import lombok.NonNull;

import java.util.*;

public class ArrayTask22 {
    // cannot use generics here
    public static Set<Map.Entry<Integer, Integer>> getPairsThanGivesInSum(@NonNull final int[] arr, int sum) {
        if (arr.length < 2) throw new IllegalArgumentException("arr length must be at least 2 to find two numbers");
        final HashMap<Integer, Integer> valuesFrequency = new HashMap<>(arr.length);
        for (final Integer val : arr) {
            if (valuesFrequency.containsKey(val)) {
                valuesFrequency.put(val, valuesFrequency.get(val) + 1);
            } else {
                valuesFrequency.put(val, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> pairs = new HashSet<>();
        for (final Integer val : arr) {
            final int target = sum - val;
            if (valuesFrequency.containsKey(target)) {
                if (target == val) {
                    if (!(valuesFrequency.get(target) > 1)) continue;
                }
                pairs.add(new AbstractMap.SimpleEntry<>(Math.min(target, val), Math.max(target, val)));
            }
        }
        return pairs;
    }

}
