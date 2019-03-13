package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {
    @ParameterizedTest
    @CsvSource({"xxggxx, true", "xxgxx, false", "xxggyygxx, false", "gg, true"})
    public void testGHappy(String str, boolean expected) {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy(str);
        Assertions.assertEquals(expected, result);
    }
}
