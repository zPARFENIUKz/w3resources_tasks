package Array.Task43;

import lombok.NonNull;

import java.util.*;

public class ArrayTask43 {
    static Set<List<Integer>> getFourGivesInSumTarget(@NonNull final Integer[] arr, final int target) {
        if (arr.length < 4) throw new IllegalArgumentException("arr.length must be greater or equals 4");
        final HashMap<Integer, Integer> values = new HashMap<>(arr.length);
        for (final Integer val : arr) {
            if (values.containsKey(val)) {
                values.put(val, values.get(val) + 1);
            } else {
                values.put(val, 1);
            }
        }
        Set<List<Integer>> resultValues = new HashSet<>();
        for (final Integer val1 : values.keySet()) {
            final int threeSum = target - val1;
            for (final Integer val2 : values.keySet()) {
                final int twoSum = threeSum - val2;
                for (final Integer val3 : values.keySet()) {
                    final int val4 = twoSum - val3;
                    if (values.containsKey(val4)) {
                        final List<Integer> fourValues = List.of(val1, val2, val3, val4);
                        boolean allMatch = fourValues.stream()
                                .allMatch(val -> Collections.frequency(fourValues, val) <= values.get(val));
                        if (allMatch) {
                            resultValues.add(fourValues.stream().sorted().toList());
                        }
                    }
                }
            }
        }
        return resultValues;
    }
}
//