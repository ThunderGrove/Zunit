public class TestClass extends TestSuite{
    @Override
    protected void testList(){
        testInt1();
        testInt2();
        testDouble1();
        testDouble2();
    }

    public void testInt1(){
        assertEquals(5,5,"Int test 1 failed");
    }

    public void testInt2(){
        assertEquals(3,7,"Int test 2 failed");
    }

    public void testDouble1(){
        assertEquals(10.0001,10.0001,"Double test 1 failed");
    }

    public void testDouble2(){
        assertEquals(0.5,0.9,"Double test 2 failed");
    }
}