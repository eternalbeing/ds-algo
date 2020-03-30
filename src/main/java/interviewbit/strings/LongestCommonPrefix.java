package interviewbit.strings;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public String commonPrefix(String[] strs) {

        StringBuilder out = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            char[] strArr = strs[i].toCharArray();
            for (int j = 0; j < strArr.length && j < out.length(); j++) {
                if (strArr[j] != out.toString().toCharArray()[j]) {
                    out.delete(j, out.length());
                    break;
                }
            }
            if (out.toString().isEmpty()) break;
        }
        return out.toString();
    }

}
