package interviewbit.strings;


import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Given a string A.
 * <p>
 * Return the string A after reversing the string word by word.
 * <p>
 * Input 1:
 * A = "the sky is blue"
 * Output 1:
 * "blue is sky the"
 * <p>
 * Input 2:
 * A = "this is ib"
 * Output 2:
 * "ib is this"
 */
public class Reverse {

    public String reverse(String A) {

        StringTokenizer tokenizer = new StringTokenizer(A, " ");
        StringBuilder sb = new StringBuilder("");
        Stack<String> stack = new Stack<>();
        while (tokenizer.hasMoreElements()) {
            String str = (String) tokenizer.nextElement();
            stack.push(str);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
