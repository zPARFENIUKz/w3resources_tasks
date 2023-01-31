package Array.Task19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask19Test {

    @Test
    void matricesSum() {
        final double[][] m1 = new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        final double[][] m2 = new double[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        final double[][] resultMatrix = new double[][] {
                {10, 10, 10},
                {10, 10, 10},
                {10, 10, 10}
        };

        assertThrows(NullPointerException.class, () -> ArrayTask19.matricesSum(null, m2));
        assertThrows(NullPointerException.class, () -> ArrayTask19.matricesSum(m1, null));
        assertThrows(IllegalStateException.class, () -> ArrayTask19.matricesSum(m1, new double[3][4]));


        assertArrayEquals(resultMatrix, ArrayTask19.matricesSum(m1, m2));
    }
}