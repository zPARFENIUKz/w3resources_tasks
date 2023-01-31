package Array.Task19;

import lombok.NonNull;

public class ArrayTask19 {
    // We can't use generics for this task because there's no way to add generic types
    // (actually it's possible, but in this situation there's no have any sense)
    // You can uncomment this and try
//    @SuppressWarnings("unchecked")
//    public static <T extends Number> T[][] matricesSum(@NonNull final T[][] m1, @NonNull final T[][] m2) {
//        if (m1.length != m2.length) throw new IllegalStateException("matrices must be the same size");
//        Class<? extends Number> tClass = m1[0][0].getClass();
//        T[][] resultMatrix = (T[][]) Array.newInstance(tClass, m1.length, m1[0].length);
//        for (int i = 0; i < m1.length; ++i) {
//            if (m1[i].length != m2[i].length) throw new IllegalArgumentException("matrices are the different sizes");
//            for (int j = 0; j < m1[i].length; ++j) {
//                resultMatrix[i][j] = m1[i][j] + m2[i][j];
//            }
//        }
//        return resultMatrix;
//    }

    public static double[][] matricesSum(@NonNull final double[][] m1, @NonNull final double[][] m2) {
        if (m1.length != m2.length) throw new IllegalStateException("matrices must be the same size");
        double[][] resultMatrix = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; ++i) {
            if (m1[i].length != m2[i].length) throw new IllegalStateException("matrices must be the same size");
            for (int j = 0; j < m1[i].length; ++j) {
                resultMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultMatrix;
    }
}
