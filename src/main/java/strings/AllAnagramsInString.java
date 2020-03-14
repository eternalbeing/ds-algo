package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 * <p>
 * Input:
 * s: "abab" p: "ab"
 * <p>
 * Output:
 * [0, 1, 2]
 */
public class AllAnagramsInString {


    public List<Integer> allAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int begin = 0, end = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {
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
                    map.put(beginChar, map.get(beginChar) + 1);
                    if (map.get(beginChar) > 0) counter++;
                }

                if (end - begin == p.length()) {
                    result.add(begin);
                }

                begin++;

            }

        }

        return result;

    }

}
