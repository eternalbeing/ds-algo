package ds.strings;


import java.util.HashMap;
import java.util.Map;

/**
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * <p>
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 */
public class MinimumWindowSubString {

    public String getString(String s, String t) {

        String res = "";

        int begin = 0, end = 0;
        int len = Integer.MAX_VALUE;
        int head = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();
        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) counter--;
            }
            end++;

            while (counter == 0) {
                char beginChar = s.charAt(begin);
                if (map.containsKey(beginChar)) {
                    map.put(endChar, map.get(endChar) + 1);
                    if (map.get(endChar) > 0) counter++;
                }

                if(end - begin < len){
                    len = end - begin;
                    head = begin;
                }

                begin++;

            }

        }

        if(len == Integer.MAX_VALUE) return "";
        return s.substring(head, head+len);

    }
}
