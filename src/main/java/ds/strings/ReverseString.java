package ds.strings;

/**
 * reverse words of a given String in Java without using any of the String library function
 * <p>
 * Input : "Welcome to geeksforgeeks"
 * Output : "geeksforgeeks to Welcome"
 * <p>
 * Input : "I love Java Programming"
 * Output :"Programming Java love I"
 */
public class ReverseString {

    public String reverse(String str) {


        return str;
    }

    public String reverseWord(String str) {
        int start = 0, end = str.length() - 1;
        char[] strArr = str.toCharArray();
        while (start <= end) {
            swap(strArr, start, end);
            start++;
            end--;
        }
        return new String(strArr);
    }

    private char[] swap(char[] strArr, int start, int end) {
        char temp = strArr[start];
        strArr[start] = strArr[end];
        strArr[end] = temp;
        return strArr;
    }
}
