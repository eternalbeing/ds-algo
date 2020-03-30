package interviewbit.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    Reverse service = new Reverse();

    @ParameterizedTest
    @MethodSource("testData")
    void reverse(String A, String expected) {
        String result = service.reverse(A);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("this is ib", "ib is this")
        );
    }
}