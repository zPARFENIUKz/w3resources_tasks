package Array.Task36;

import lombok.NonNull;

import java.util.*;
import java.util.stream.Stream;

public class ArrayTask36 {
    public static Set<List<Integer>> findTargetSumTriplets(@NonNull final Integer[] arr, final int target) {
        final HashMap<Integer, Integer> values = new HashMap<>(arr.length);
        Set<List<Integer>> triplets = new HashSet<>();
        for (final Integer val : arr) {
            if (values.containsKey(val)) {
                values.put(val, values.get(val) + 1);
            } else {
                values.put(val, 1);
            }
        }
        for (final Integer val : values.keySet()) {
            final int diff = target - val;
            for (final Integer val2 : values.keySet()) {
                final int lastVal = diff - val2;
                if (values.containsKey(lastVal)) {
                    List<Integer> triplet = Stream.of(val, val2, lastVal).sorted().toList();
                    if (values.get(val) >= Collections.frequency(triplet, val)
                        && values.get(val2) >= Collections.frequency(triplet, val2)
                        && values.get(lastVal) >= Collections.frequency(triplet, lastVal))
                    {
                        triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }
}
