import org.junit.Assert;
import org.junit.Test;

public class FirstTest2 {


    @Test
    public void firstTaste01(){
    Assert.assertTrue
            ("Test failed", 5>1);
}
    @Test
    public void firstTaste02(){
    Assert.assertTrue
            ("test failed", 1>1);
    }

    @Test
    public void firstTaste03(){
        Assert.assertEquals("test failed",4,4);
    }


}
