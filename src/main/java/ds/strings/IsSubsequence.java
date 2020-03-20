package ds.strings;


/**
 * Given a string 's' and string 't', check if s is subsequence of t.
 * <p>
 * "ace" is a subsequence of "abcde" while "aec" is not
 * <p>
 * Example 1:
 * s = "abc", t = "ahbgdc"
 * <p>
 * Return true.
 * <p>
 * Example 2:
 * s = "axc", t = "ahbgdc"
 * <p>
 * Return false.
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int s_pointer = 0;
        int t_pointer = 0;

        while (t_pointer < t.length()) {

            if (t.charAt(t_pointer) == s.charAt(s_pointer)) {
                s_pointer++;
                if (s_pointer == s.length()) {
                    return true;
                }
            }

            t_pointer++;

        }

        return false;
    }

}
