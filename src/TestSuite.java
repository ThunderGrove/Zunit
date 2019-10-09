public abstract class TestSuite{
    private int passed;
    private int failed;

    public void runTestSuite(){
        passed=0;
        failed=0;

        testList();

        System.out.println("Tests passed: "+passed);
        System.out.println("Tests failed: "+failed);
    }

    protected abstract void testList();

    public void assertEquals(int expected,int actual,String msg){
        if(expected==actual){
            passed++;
        }else{
            System.out.println("Failed: Expected "+expected+" but received "+actual+"\n"+msg);
            failed++;
        }
    }

    public void assertEquals(long expected,long actual,String msg){
        if(expected==actual){
            passed++;
        }else{
            System.out.println("Failed: Expected "+expected+" but received "+actual+"\n"+msg);
            failed++;
        }
    }

    public void assertEquals(double expected,double actual,String msg){
        if(expected==actual){
            passed++;
        }else{
            System.out.println("Failed: Expected "+expected+" but received "+actual+"\n"+msg);
            failed++;
        }
    }

    public void assertEquals(String expected,String actual,String msg){
        if(expected.equals(actual)){
            passed++;
        }else{
            System.out.println("Failed: Expected "+expected+" but received "+actual+"\n"+msg);
            failed++;
        }
    }

    public void assertEquals(float expected,float actual,String msg){
        if(expected==actual){
            passed++;
        }else{
            System.out.println("Failed: Expected "+expected+" but received "+actual+"\n"+msg);
            failed++;
        }
    }
}