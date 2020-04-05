package ds.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring service = new LongestPalindromicSubstring();

    @ParameterizedTest
    @MethodSource("testData")
    void longestPalindrome(String s, String expected) {
        String result = service.longestPalindrome(s);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb")
        );
    }
}