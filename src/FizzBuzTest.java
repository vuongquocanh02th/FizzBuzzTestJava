import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzTest {

    private final FizzBuz fizzBuzzTranslate = new FizzBuz();

    // Kiểm thử phương thức translate
    @Test
    public void testTranslate() {
        // Kiểm tra số chia hết cho 3
        assertEquals("Fizz", fizzBuzzTranslate.translate(3));
        assertEquals("Fizz", fizzBuzzTranslate.translate(6));
        assertEquals("Fizz", fizzBuzzTranslate.translate(9));

        // Kiểm tra số chia hết cho 5
        assertEquals("Buzz", fizzBuzzTranslate.translate(5));
        assertEquals("Buzz", fizzBuzzTranslate.translate(10));
        assertEquals("Buzz", fizzBuzzTranslate.translate(20));

        // Kiểm tra số chia hết cho cả 3 và 5
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(15));
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(30));

        // Kiểm tra số không chia hết
        assertEquals("7", fizzBuzzTranslate.translate(7));
        assertEquals("8", fizzBuzzTranslate.translate(8));

        // Kiểm tra số chứa chữ số 3
        assertEquals("Fizz", fizzBuzzTranslate.translate(13));
        assertEquals("Fizz", fizzBuzzTranslate.translate(23));
        assertEquals("Fizz", fizzBuzzTranslate.translate(33));

        // Kiểm tra số chứa chữ số 5
        assertEquals("Buzz", fizzBuzzTranslate.translate(5));
        assertEquals("Buzz", fizzBuzzTranslate.translate(25));
        assertEquals("Buzz", fizzBuzzTranslate.translate(35));
    }

    // Kiểm thử phương thức numberToWords
    @Test
    public void testNumberToWords() {
        assertEquals("một", fizzBuzzTranslate.numberToWords(1));
        assertEquals("hai", fizzBuzzTranslate.numberToWords(2));
        assertEquals("mười ba", fizzBuzzTranslate.numberToWords(13));
        assertEquals("hai mươi sáu", fizzBuzzTranslate.numberToWords(26));
        assertEquals("chín mươi chín", fizzBuzzTranslate.numberToWords(99));

        // Test số không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTranslate.numberToWords(100));
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTranslate.numberToWords(-1));
    }
}
