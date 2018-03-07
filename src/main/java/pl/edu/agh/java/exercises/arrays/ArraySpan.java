package pl.edu.agh.java.exercises.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * <p>
 * Przyjmijmy, że odstęp "span" danej wartości w tablicy to liczba elementów
 * pomiędzy pierwszym i ostatniem jej wystąpieniem, włączając je same. Jeśli
 * wartość pojawia się w tablicy tylko raz, jej "span" jest równe 1. Metoda
 * maxSpan powinna zwracać największy istniejący odstęp w zadanej tablicy.
 *
 * @see http://codingbat.com/prob/p189576
 */
public class ArraySpan {
    public int maxSpan(int[] array) {
        Map<Integer, Integer> spanSet = new HashMap<Integer, Integer>();
        int maxSpan = 0;
        int span = 1;

        for (int i = 0; i < array.length; i++) {
            if (spanSet.containsKey(array[i])) {
                span = i - spanSet.get(array[i]) + 1;

            } else {
                spanSet.put(array[i], i);
            }
        }

        for (int key : spanSet.keySet()) {
            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
        //throw new UnsupportedOperationException();
    }
}
