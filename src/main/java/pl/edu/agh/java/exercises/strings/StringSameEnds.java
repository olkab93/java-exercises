package pl.edu.agh.java.exercises.strings;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without
 * overlapping. For example, sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku i na końcu, bez nachodzenia na siebie.
 * Przykłądowo, sameEnds("abXab") to "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
    public String sameEnds(String string) {
        int stringLength = string.length();
        String longestFoundSubstring = "";

        for (int i = 0; i <= stringLength/2; i++) {
            for (int j = stringLength/2; j < stringLength; j++) {
                if (string.substring(0, i).equals(string.substring(j))) {
                    longestFoundSubstring += string.substring(0, i);
                }
            }
        }

        return longestFoundSubstring;
    }

}
