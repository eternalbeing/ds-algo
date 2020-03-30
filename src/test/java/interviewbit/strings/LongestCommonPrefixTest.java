package interviewbit.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix service = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("testData")
    void commonPrefix(String[] strs, String expected) {
        String result = service.commonPrefix(strs);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"abcdefgh", "aefghijk", "abcefgh"}, "a"),
                Arguments.of(new String[]{"abab", "ab", "abcd"}, "ab")
        );
    }
}