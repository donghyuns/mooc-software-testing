package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({"abc, efg", "xyz, bcd"})
    public void testCaesarShiftCipher(String ori, String shifted) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String strReturn = csc.CaesarShiftCipher(ori, 4);
        Assertions.assertEquals(shifted, strReturn);
    }
}
