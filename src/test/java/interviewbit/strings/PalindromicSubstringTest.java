package interviewbit.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringTest {

    PalindromicSubstring service = new PalindromicSubstring();

    @ParameterizedTest
    @MethodSource("testData")
    void isPalindrome(String A, int expected) {
        int result = service.isPalindrome(A);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", 1),
                Arguments.of("race a car", 0)
        );
    }
}