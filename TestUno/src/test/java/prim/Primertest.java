package prim;

import org.testng.annotations.*;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class Primertest extends BaseTest {

    @DataProvider(name = "Name")
    public static Object[][] Name() {
        return  new Object[][]{
                {'1', "Juan"}
        };
    }

    @Test
    public void primermetodo(){
        System.out.println("Test 1");
        assertTrue(true, "");
    }

    @Test
    public void segundometodo(){
        System.out.println("test 2");
    }

}
