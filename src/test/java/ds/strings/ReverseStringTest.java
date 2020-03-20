package ds.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString service = new ReverseString();

    @Test
    public void reverseWordTest(){
        String str = "Reverse";
        String result = service.reverseWord(str);
        assertEquals("esreveR", result);

    }

}