package Array.Task37;

import lombok.NonNull;

import java.lang.reflect.Array;

public class ArrayTask37 {
    @SuppressWarnings("unchecked")
    public static <T> T[][] antiDiagonals(@NonNull final T[][] arr) {
        if (arr.length == 0) return arr;
        final Class<?> tClass = arr[0][0].getClass();
        T[][] resultMatrix = (T[][]) Array.newInstance(tClass, arr.length * 2 - 1, 1);
        for(int i = 0; i < resultMatrix.length; ++i) {
            int size = i < arr.length ? i + 1 : arr.length - ((i + 1) % arr.length);
            resultMatrix[i] = (T[]) Array.newInstance(tClass, size);
            int horIndex = (i < arr.length)? 0 : (i % arr.length) + 1;
            int vertIndex = (i < arr.length)? i : arr.length - 1;
            int writeIndex = 0;
            while (writeIndex < resultMatrix[i].length) {
                resultMatrix[i][writeIndex++] = arr[horIndex++][vertIndex--];
            }
        }
        return resultMatrix;
    }
}

