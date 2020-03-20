package ds.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringTest {

    LongestSubString service = new LongestSubString();

    @Test
    public void distinctKCharacters(){
        String string = "aabacbebebe";
        String result = service.longestSubstringWithKDistinctCharacters(string, 3);
        assertEquals("cbebebe", result);
    }

    @Test
    public void longestUniqueSubSequece(){
        String string = "aabacbebebe";
        String result = service.longestSubstringWithoutRepeatingCharacters(string);
        assertEquals("acbe", result);
    }

}