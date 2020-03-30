package algorithms.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotatedSortedArrayTest {

    RotatedSortedArray service = new RotatedSortedArray();

    @ParameterizedTest
    @MethodSource("testData")
    void minimumElement(int[] input, int expected) {
        int result = service.minimumElement(input);
        assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("testSearchData")
    void searchElementTest(int[] A, int B, int expected) {
        int result = service.findElement(A, B);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{5, 6, 1, 2, 3, 4}, 1),
                Arguments.of(new int[]{1, 2, 3, 4}, 1),
                Arguments.of(new int[]{2, 1}, 1)
        );
    }

    private static Stream<Arguments> testSearchData() {
        return Stream.of(
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2, 3}, 4, 0),
                Arguments.of(new int[]{5, 6, 7, 0, 1, 2, 3, 4}, 4, 7),
                Arguments.of(new int[]{5, 17, 100, 3}, 6, -1)
        );
    }
}