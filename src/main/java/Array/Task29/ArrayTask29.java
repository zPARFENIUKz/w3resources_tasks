package Array.Task29;

import lombok.NonNull;

import java.math.BigInteger;
import java.util.TreeMap;

public class ArrayTask29 {
    public static int getAverageV1(@NonNull final int[] arr) {
        if (arr.length < 1) throw new IllegalArgumentException("arr length must be at least 1");
        int min = arr[0], max = min;
        BigInteger sum = BigInteger.ZERO;
        for (final int val : arr) {
            if (val > max) max = val;
            else if (val < min) min = val;
            sum = sum.add(BigInteger.valueOf(val));
        }
        int count = 0;
        for (final int val : arr) {
            if (val == min || val == max) sum = sum.subtract(BigInteger.valueOf(val));
            else ++count;
        }
        return sum.divide(BigInteger.valueOf(count)).intValue();
    }

    @SuppressWarnings("IntegerMultiplicationImplicitCastToLong")
    public static int getAverageV2(@NonNull final int[] arr) {
        if (arr.length < 1) throw new IllegalArgumentException("arr length must be at least 1");
        final TreeMap<Integer, Integer> values = new TreeMap<>();
        for (final int val : arr) {
            if (values.containsKey(val)) {
                values.put(val, values.get(val) + 1);
            } else {
                values.put(val, 1);
            }
        }
        values.remove(values.firstKey());
        values.remove(values.lastKey());
        BigInteger sum = BigInteger.ZERO;
        int count = 0;
        for (final var entry : values.entrySet()) {
            sum = sum.add(BigInteger.valueOf(entry.getKey() * entry.getValue()));
            count += entry.getValue();
        }
        return sum.divide(BigInteger.valueOf(count)).intValue();
    }
}
