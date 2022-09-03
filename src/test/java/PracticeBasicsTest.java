import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeBasicsTest {

    @Test
    void testFor15()

    {

        //Given
        int number = 15;
        //When
        String actual =  PracticeBasics.fizzBuzz(number);
        //Then
        assertEquals("fizzbuzz", actual);

    }
}