package Array.Task71;

import lombok.NonNull;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayTask71 {
    public static BigInteger getLargestFormedValues(@NonNull final Integer[] arr) {
        final String numStr = Arrays.stream(arr).sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
        return new BigInteger(numStr);
    }
}
