package hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperReducedStringTest {

    SuperReducedString service = new SuperReducedString();

    @Test
    public void test() {
        String s = "aaabccddd";
        String result = service.reduce(s);
        String expected = "abd";
        String s1 = "aa";
        String expected1 = "Empty String";
        String result1 = service.reduce(s1);
        assertEquals(expected, result);
        assertEquals(expected1, result1);
    }
}