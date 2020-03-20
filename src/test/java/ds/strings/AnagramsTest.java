package ds.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    Anagrams service = new Anagrams();

    @Test
    public void checkAnagram(){
        String string1 = "geeksforgeeks";
        String string2 = "forgeeksgeeks";
        boolean result = service.checkAnagram(string1, string2);
        assertTrue(result);
    }

}