package hackerrank;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Two words are anagrams of one another if their letters can be rearranged to form the other word.
 * <p>
 * In this challenge, you will be given a string. You must split it into two contiguous substrings, then determine the minimum number of characters to change to make the two substrings into anagrams of one another.
 * <p>
 * For example, given the string 'abccde', you would break it into two parts: 'abc' and 'cde'. Note that all letters have been used, the substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.
 * <p>
 * For each test case, print an integer representing the minimum number of changes required to make an anagram. Print  if it is not possible.
 * <p>
 * Sample Input
 * <p>
 * 6
 * aaabbb
 * ab
 * abc
 * mnop
 * xyyx
 * xaxbbbxx
 * <p>
 * Sample Output
 * <p>
 * 3
 * 1
 * -1
 * 2
 * 0
 * 1
 */
public class Anagram {

    public int checkAnagram(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int mid = n / 2;
        String s1 = s.substring(0, mid);
        String s2 = s.substring(mid, n);
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
            if (map.get(s2.charAt(i)) == 0) map.remove(s2.charAt(i));
        }

        int sumValue = map.values().stream().map(i -> Math.abs(i)).reduce(0, Integer::sum);
        return sumValue / 2;
    }

    /**
     * Given two strings,  and , that may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
     * <p>
     * For example,  and . The only characters that match are the 's so we have to remove  from  and  from  for a total of  deletions.
     *
     * @param s1
     * @param s2
     * @return
     */
    public int makeAnagram(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) - 1);
        }

        return map.values().stream().map(val -> Math.abs(val)).reduce(0, Integer::sum);

    }

}
