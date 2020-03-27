package ds.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringTest {

    LongestSubString service = new LongestSubString();

    @Test
    public void distinctKCharacters() {
        String string = "aabacbebebe";
        String result = service.longestSubstringWithKDistinctCharacters(string, 3);
        assertEquals("cbebebe", result);
    }

    @ParameterizedTest
    @MethodSource("testDataSet")
    public void longestUniqueSubSequece(String input, String expected) {
        String actualValue = service.longestSubstringWithoutRepeatingCharacters(input);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @MethodSource("testDataSetForLength")
    void lengthOfLongestUniqueSubSequece(String input, int expected) {
        int actualValue = service.lengthOfLongestSubstringWithoutRepeatingCharacters(input);
        assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> testDataSet() {
        return Stream.of(
                Arguments.of("aabacbebebe", "acbe"),
                Arguments.of("CODINGISAWESOME", "NGISAWE"),
                Arguments.of("always be coding", "be coding")
        );
    }

    private static Stream<Arguments> testDataSetForLength() {
        return Stream.of(
                Arguments.of("aabacbebebe", 4),
                Arguments.of("CODINGISAWESOME", 7),
                Arguments.of("always be coding", 9)
        );
    }


}