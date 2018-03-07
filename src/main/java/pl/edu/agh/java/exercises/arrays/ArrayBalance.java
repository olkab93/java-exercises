package pl.edu.agh.java.exercises.arrays;

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
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
        }

        for (int j = array.length - 1; j >= 0; j--) {
            sumLeft -= array[j];
            sumRight += array[j];
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
        //throw new UnsupportedOperationException();
    }
}
