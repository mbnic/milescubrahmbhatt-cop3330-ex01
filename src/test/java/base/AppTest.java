package base;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_isCorrect()   {
        App myApp = new App();
        String name = "blah";

        String expectedOutput = "Hello, blah nice to meet you!";

        String actualOutput = myApp.createOutput(name);

        assertEquals(expectedOutput, actualOutput);
    }
}