package Array.Task16;

import lombok.NonNull;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ArrayTask16 {
    @SuppressWarnings("unchecked")
    // I know that here and in the tests there is actually one implementation, but in my opinion it is the fastest and simplest
    public static <T> T[] removeDuplicates(@NonNull final T[] arr) {
        final HashSet<T> uniqueValues = Arrays.stream(arr).collect(Collectors.toCollection(HashSet::new));
        T[] newArr = (T[]) Array.newInstance(arr[0].getClass(), uniqueValues.size());
        newArr = uniqueValues.toArray(newArr);
        return newArr;
    }
}
