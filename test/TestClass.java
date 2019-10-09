public class TestClass extends TestSuite{
    @Override
    protected void testList(){
        testThis();
        testThat();
    }

    public void testThis(){
        int result=5;
        assertEquals(5,5,"testThis failed");
    }

    public void testThat(){
        assertEquals(3,7,"testThat failed");
    }
}