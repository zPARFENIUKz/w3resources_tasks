package Array.Task78;

import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

public class ArrayTask78 {
    public static boolean isNegativeDominant(@NonNull final Integer[] arr) {
        final Set<Integer> positives = new HashSet<>();
        final Set<Integer> negatives = new HashSet<>();
        for (Integer integer : arr) {
            if (integer >= 0) positives.add(integer);
            else negatives.add(integer);
        }
        return negatives.size() > positives.size();
    }
}
