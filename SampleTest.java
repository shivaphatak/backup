package Snapshot.AWSTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }
	  
    @Test
    public void testMethodTwo(){
	Assert.assertTrue(false);
    }
	  
    @Test(dependsOnMethods={"testMethodTwo"})
        public void testMethodThree(){
        Assert.assertTrue(true);
    }

    
 /*   @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
       System.out.println("Parameterized value is : " + myName);
    }*/
}
