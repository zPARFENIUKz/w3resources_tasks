package Array.Task72;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask72 {
    public static <T extends Comparable<? super T>> T[] getUnsortedSubArray(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr.length must be at least 2");
        Integer firstWrong = null;
        Integer lastWrong = null;
        T min = null;
        T max = null;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                 if (firstWrong == null) {
                     firstWrong = i;
                     min = arr[i];
                     max = arr[i];
                 } else {
                     if (arr[i].compareTo(min) < 0) {
                         min = arr[i];
                     }
                     else if (arr[i].compareTo(max) > 0) {
                         max = arr[i];
                     }
                 }
                lastWrong = i;
            }
        }
        if (lastWrong == null) return null;
        for (int i = 0; i < arr.length; ++i) {
            if (i == firstWrong) {
                i = lastWrong;
                continue;
            }
            if (i < firstWrong && arr[i].compareTo(min) > 0) {
                firstWrong = i;
                i = lastWrong;
            } else if (i >= lastWrong) {
                if (arr[i].compareTo(max) < 0) {
                    lastWrong = i;
                }
            }
        }
        return Arrays.copyOfRange(arr, firstWrong, lastWrong + 1);
    }
}
