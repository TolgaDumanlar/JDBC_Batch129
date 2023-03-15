import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void firstTest01(){

        Assert.assertTrue(4<5);


    }

    @Test
    public void firstTest02(){

        Assert.assertTrue("Test Fail", 5<9);
        //Test kaldığında mesaj alırız.
    }

    @Test
    public void firstTest03(){

        Assert.assertEquals("Sayılar eşit değil", "3","3");
        //Sayiların birbirine eşitliğini kontrol eder. Eşit değilse string ifade ile mesaj verir.
    }


}
