import org.junit.*;

public class RunTest {

    @Before
    public void beforeTest() {
        System.out.println("before");
    }

    @Test
    public void test() {
        System.out.println("test");
        String string1 = "cтрока";
        String string2 = "cтрока";
        Assert.assertEquals(string1, string2);
    }

    @Test
    public void badTest() {
        System.out.println("badTest");
        String string1 = "cтрока";
        String string2 = "cтрока1";
        Assert.assertEquals(string1, string2);
    }

    @After
    public void afterTest() {
        System.out.println("after");
    }
}
