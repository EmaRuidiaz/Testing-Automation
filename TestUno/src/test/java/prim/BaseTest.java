package prim;

import org.testng.annotations.*;

public abstract class BaseTest {

    @AfterMethod
    public void tearDown() {
        System.out.println("Despues de los test");
    }

    @BeforeMethod
    public  void tercer(){
        System.out.println("Antes de cualquier test.");
    }



    @AfterClass
    public void finaal(){
        System.out.println("Al final de la clase");
    }

    @BeforeClass
    public void prinicio(){
        System.out.println("Al principio de la clase");
    }
}
