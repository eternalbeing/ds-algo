package strings;

/**
 * Check whether two strings are anagram of each other
 */
public class Anagrams {

public boolean checkAnagram(String string1, String string2) {

    if(string1.length() != string2.length())
        return false;

    int[] count = new int[26];

    for(int i=0; i<string1.length(); i++){
        count[string1.charAt(i) - 'a']++;
        count[string2.charAt(i) - 'a']--;
    }

    for(int i=0; i<26; i++){
        if(count[i] != 0){
            return false;
        }
    }

    return true;
}

}
