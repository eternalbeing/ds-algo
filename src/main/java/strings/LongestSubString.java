package strings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Sliding Window :
 *
 * https://medium.com/leetcode-patterns/leetcode-pattern-2-sliding-windows-for-strings-e19af105316b
 *
 *
 */

public class LongestSubString {


    public String longestSubstringWithoutRepeatingCharacters(String string) {

        return null;
    }

    public String longestSubstringWithKDistinctCharacters(String string, int k) {

        StringBuilder out = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end;
        int maxLength = 0;

        for (end = 0; end < string.length(); end++) {
            char c = string.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() > k) {
                maxLength = Math.max(maxLength, end - start);
                while (map.size() > k) {
                    char startChar = string.charAt(start);
                    if (map.get(startChar) == 1) {
                        map.remove(startChar);
                    } else {
                        map.put(startChar, map.get(startChar) - 1);
                    }
                    start++;
                }
            }
        }

        for(int i=start; i<end; i++){
            out.append(string.charAt(i));
        }
        return out.toString();
    }


    public String kDistinct(String s, int k){

        int begin = 0, end = 0, counter = 0, len = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < s.length()){
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            if(map.get(endChar) == 1) counter++;

            while(counter > k){

                char beginChar = s.charAt(begin);
                map.put(beginChar, map.get(beginChar) - 1 );
                if(map.get(beginChar) == 0) counter--;
                begin++;

            }

            len = Math.max(len, end - begin);
        }

        return s.substring(begin, end);
    }

}
