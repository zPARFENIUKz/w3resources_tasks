package Array.Task40;

import org.junit.jupiter.api.Test;

import java.util.Map;

class ArrayTask40Test {

    @Test
    void getElementsWhichSumIsClosestToZeroTest() {
        // don't wanna write full tests for this task :)
        final Integer[] arr = new Integer[] {1, 5, -4, 7, 8, -6};
        Map.Entry<Integer, Integer> elementsWhichSumIsClosestToZero = ArrayTask40.getElementsWhichSumIsClosestToZero(arr);
        System.out.println(elementsWhichSumIsClosestToZero.getKey() + " : " + elementsWhichSumIsClosestToZero.getValue());
    }
}