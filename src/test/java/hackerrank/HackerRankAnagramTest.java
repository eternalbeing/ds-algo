package hackerrank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HackerRankAnagramTest {


    @ParameterizedTest
    @MethodSource("dataSet")
    void checkAnagram(String input, int expected) {
        int actualValue = new Anagram().checkAnagram(input);
        assertEquals(expected, actualValue);
    }

    @Test
    void makeAnagram(){
        int result = new Anagram().makeAnagram("abc", "amnop");
        int result1 = new Anagram().makeAnagram("cde", "abc");
        assertEquals(6, result);
        assertEquals(4, result1);
    }

    private static Stream<Arguments> dataSet() {
        return Stream.of(
                Arguments.of("aaabbb", 3),
                Arguments.of("ab", 1),
                Arguments.of("abc", -1),
                Arguments.of("mnop", 2),
                Arguments.of("xyyx", 0),
                Arguments.of("xaxbbbxx", 1)
        );
    }

}