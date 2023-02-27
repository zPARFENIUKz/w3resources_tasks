package Array.Task68;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask68 {
    public static <T> List<List<T>> getAllPossiblePermutations(@NonNull final List<T> lst) {
        List<List<T>> permutations = new ArrayList<>();
        if (lst.size() == 2) {
            permutations.add(new ArrayList<>(List.of(lst.get(0), lst.get(1))));
            permutations.add(new ArrayList<>(List.of(lst.get(1), lst.get(0))));
            return permutations;
        }
        for (int i = 0; i < lst.size(); ++i) {
            List<T> newLst = new ArrayList<>();
            for (int j = 0; j < lst.size(); ++j) {
                if (j != i) newLst.add(lst.get(j));
            }
            final List<List<T>> possibleLocalPermutations = getAllPossiblePermutations(newLst);
            for (final List<T> permutation : possibleLocalPermutations) {
                permutation.add(0, lst.get(i));
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}
