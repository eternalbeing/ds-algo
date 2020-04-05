package ds.strings;


/**
 * Given a string s , find the longest palindromic substring in s .
 * For example,
 * for the input "babad" , the output would be "bab" .
 * For the input "cbbd" , the output would be "bb" .
 */
public class LongestPalindromicSubstring {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (s == null || len < 1) return "";
        if (len < 2) return s;

        for (int i = 0; i < len - 1; i++) {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        }
        return s.substring(resultStart, resultLength + resultStart);

    }

    private void expandRange(String s, int start, int end) {

        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        if (resultLength < end - start - 1) {
            resultStart = start + 1;
            resultLength = end - start - 1;
        }

    }

}
