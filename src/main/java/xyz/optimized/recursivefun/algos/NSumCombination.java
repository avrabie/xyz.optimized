package xyz.optimized.recursivefun.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class NSumCombination {
    public static void main(String[] args) {
        //test
        List<Integer> list = List.of(2, 3, 4, 5, 7, 3, 9);
        int n = 9;
        NSumCombination nSumProblem = new NSumCombination();
        System.out.println(nSumProblem.allOrdersOfUniqueCombinations(list, n));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return allOrdersOfUniqueCombinations(Arrays.stream(candidates).boxed().toList(), target);

    }

    public List<List<Integer>> allOrdersOfUniqueCombinations(List<Integer> list, int target) {
        int order = determineOrder(list, target);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = order; i > 0; i--) {
            List<List<Integer>> uniqueCombinations = findUniqueCombinations(list, target, i);
            result.addAll(uniqueCombinations);
        }
        return result;
    }


    /**
     * Finds all unique combinations of numbers in a list that sum up to a given target number.
     *
     * @param list  the list of numbers to target
     * @param n     the target number
     * @param order the order of the combinations (e.g., 2 for pairs, 3 for triplets)
     * @return a list of lists, where each inner list represents a unique combination of numbers
     */
    public List<List<Integer>> findUniqueCombinations(List<Integer> list, int n, int order) {
        List<List<Integer>> lists = findNSumCombinations(list, n, order);
        // given a List<List<Integer>> we make a HashMap of <IntValues, Frequencies> then we use the distinct
        // to remove the dublicates as [2,3,4] is the same as [3,4,2] as an example
        // then we explode the hashmap and recreate a list of numbers
        List<List<Integer>> uniqueCombinations = lists.stream()
                .map(this::createFrequencyMap)
                .distinct()
                .map(m -> m.entrySet().stream()
                        .flatMap(this::explodeEntry)
                        .toList())
                .toList();
        return uniqueCombinations;
    }



    public List<List<Integer>> findNSumCombinations(List<Integer> list, int n, int order) {

        List<List<Integer>> result = new ArrayList<>();
        if (order == 1) {
            return list.stream().anyMatch(i -> i == n) ? List.of(List.of(n)) : result;
        }
        List<Integer> smallerNumbers = list.stream().filter(i -> i <= n).toList();

        for (int i = 0; i < smallerNumbers.size(); i++) {
            int num = smallerNumbers.get(i);

            List<Integer> mutableSmallerNumbers = new ArrayList<>(smallerNumbers);
            // uncomment this line if you don't want to reuse the numbers in the array
//            mutableSmallerNumbers.remove(i);
            List<List<Integer>> lists = findNSumCombinations(mutableSmallerNumbers, n - num, order - 1);
            if (lists.size() > 0) {
                for (int j = 0; j < lists.size(); j++) {
                    List temp = new ArrayList<>();
                    temp.add(num);
                    temp.addAll(lists.get(j));
                    result.add(temp);
                }
            }
        }

        return result.isEmpty() ? result : result
                .stream()
                .filter(l -> l.size() == order)
                .toList();

    }

    private int determineOrder(List<Integer> list, int n) {
        Integer minValue = list.stream().min(Integer::compare).orElse(1);
        return n / minValue;
    }
    /**
     * Creates a frequency map of integers in a list.
     *
     * @param l the list of integers
     * @return a map where each key is an integer from the list and the value is the frequency of that integer
     */
    private Map<Integer, Long> createFrequencyMap(List<Integer> l) {
        return l.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Explodes a Map.Entry into a Stream of integers.
     *
     * @param integerLongEntry the Map.Entry to explode
     * @return a Stream of integers representing the exploded entry
     * example: Given a Map.Entry<Integer, Long> entry = Map.entry(4, 3L);
     * You would have a Stream object containing the values: 4, 4, 4.
     * In an array representation [4, 4, 4].
     */
    private Stream<Integer> explodeEntry(Map.Entry<Integer, Long> integerLongEntry) {
        return IntStream.range(0, integerLongEntry.getValue().intValue())
                .mapToObj(i -> integerLongEntry.getKey());
    }
}
