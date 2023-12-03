import org.junit.Test;
import static org.junit.Assert.*;

public class TestsIntegerDecode {
    @Test(expected = NumberFormatException.class)
    public void checkZeroLenght(){
        Integer.decode("");
    }

    @Test(expected = NumberFormatException.class)
    public void checkStartMinusSing(){
        Integer.decode("#-2");
    }

    @Test(expected = NumberFormatException.class)
    public void checkStartPlusSing(){
        Integer.decode("#+2");
    }

    @Test
    public void checkBaseTen(){
        assertEquals(Integer.decode("123"), new Integer( 123));
    }
    @Test
    public void checkBaseEight(){
        assertEquals(Integer.decode("0121"), (Integer) 81);
    }
    @Test
    public void checkBaseHexWithXSmall(){
        assertEquals(Integer.decode("0x114"), (Integer) 276);
    }

    @Test
    public void checkBaseHexWithXBig(){
        assertEquals(Integer.decode("0X114"), (Integer) 276);
    }

    @Test
    public void checkBaseHexWithGrid(){
        assertEquals(Integer.decode("#114"), (Integer) 276);
    }

    @Test
    public void checkNegativeBaseTen(){
        assertEquals(Integer.decode("-123"), new Integer(-123));
    }
    @Test
    public void checkNegativeBaseEight(){
        assertEquals(Integer.decode("-0121"), new Integer(-81));
    }
    @Test
    public void checkNegativeBaseHexWithXSmall(){
        assertEquals(Integer.decode("-0x114"), new Integer(-276));
    }

    @Test
    public void checkNegativeBaseHexWithXBig(){
        assertEquals(Integer.decode("-0X114"), new Integer(-276));
    }

    @Test
    public void checkNegativeBaseHexWithGrid(){
        assertEquals(Integer.decode("-#114"), new Integer(-276));
    }
    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectBaseTen(){
        Integer.decode("0L");
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectBaseEight(){
        Integer.decode("099");
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectBaseHexWithXSmall(){
        Integer.decode("0xL");
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectBaseHexWithXBig(){
        Integer.decode("0XL");
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectBaseHexWithGrid(){
        Integer.decode("#L");
    }
}

