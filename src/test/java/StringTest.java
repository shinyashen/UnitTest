import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class StringTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    public void assertEqual(boolean src, boolean des, String str) {
        if (src ^ des)
            System.err.println(str + "Error!");
        else System.out.println(str + "Pass!");
    }


    /**
     *
     * Method: isEmpty(final CharSequence cs)
     *
     */
    @Test
    public void testIsEmpty() throws Exception{
        assertEqual(StringUtils.isEmpty(""), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty(null), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty("test"), false, "testIsEmpty ");
    }

    /**
     *
     * Method: isNotEmpty(final CharSequence cs)
     *
     */
    @Test
    public void testIsNotEmpty() {
        assertEqual(StringUtils.isNotEmpty(""), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty(null), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty("test"), true, "testIsNotEmpty ");
    }

    /**
     *
     * Method: isBlank(final CharSequence cs)
     *
     */
    @Test
    public void testIsBlank() {
        assertEqual(StringUtils.isBlank(""), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank(" "), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank("test"), false, "testIsBlank ");
    }
}
