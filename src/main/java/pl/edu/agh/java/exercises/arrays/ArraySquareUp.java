package pl.edu.agh.java.exercises.arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * <p>
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
    public int[] squareUp(int n) {
        int[] array = new int[n * n];

        if (n == 0)
            return array;

        for (int i = n - 1; i < n * n; i += n) {
            for (int j = i; j >= i - i / n; j--) {
                array[j] = i - j + 1;
            }
        }

        return array;
    }
}
