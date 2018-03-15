package pl.edu.agh.java.exercises.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * <p>
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 *
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
    public boolean canBalance(int[] array) {

        int length = array.length;
        boolean result = false;

        if (length == 0 || length == 1) {
            return true;
        }

        for (int k = 0; k <= 100000; k++) {
            Collections.shuffle(Arrays.asList(array));
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 0; i < length; i++) {
                sumLeft += array[i];
            }

            for (int j = length - 1; j >= 0; j--) {
                sumLeft -= array[j];
                sumRight += array[j];
                if (length % 2 != 0) {
                    sumRight -= array[(length / 2) + 1];
                }
            }

            if (sumLeft == sumRight) {
                result = true;
            } else {
                result = false;
            }
            //throw new UnsupportedOperationException();
        }
        return result;
    }
}
