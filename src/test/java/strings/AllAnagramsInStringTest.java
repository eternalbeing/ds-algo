package strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllAnagramsInStringTest {

    AllAnagramsInString service = new AllAnagramsInString();

    @Test
    public void testAnagram(){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = service.allAnagrams(s,p);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(6);
        assertEquals(expected, result);
    }

}