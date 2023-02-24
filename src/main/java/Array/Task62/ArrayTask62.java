package Array.Task62;

import lombok.NonNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTask62 {
    public static Set<Integer> getEquilibriumIndexes(@NonNull final Integer[] arr) {
        if (arr.length < 1) throw new IllegalStateException("arr must contains elements");
        Set<Integer> equilibriumIndexes = new HashSet<>();
        final long totalSum = Arrays.stream(arr).reduce(Integer::sum).get();
        long currentSum = totalSum;
        for (int i = 0; i < arr.length; ++i) {
            if (totalSum - currentSum - arr[i] == currentSum) {
                equilibriumIndexes.add(i);
            }
            currentSum += arr[i];
        }
        return equilibriumIndexes;
    }
}
