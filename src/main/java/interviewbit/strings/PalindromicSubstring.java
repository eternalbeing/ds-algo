package interviewbit.strings;


/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Example:
 * <p>
 * "A man, a plan, a canal: Panama" is a palindrome.
 * <p>
 * "race a car" is not a palindrome.
 * <p>
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class PalindromicSubstring {

    public int isPalindrome(String A) {

        StringBuilder sb = new StringBuilder("");
        for (char c : A.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        boolean result = str.equals(sb.reverse().toString());
        return result ? 1 : 0;
    }

}
