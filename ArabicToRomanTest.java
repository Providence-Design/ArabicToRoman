import org.junit.Test;

public class ArabicToRomanTest {
    @Test
    public  void shouldConvertOne(){
        assertEquals("I", arabicToRoman.convert(1));
    }
}