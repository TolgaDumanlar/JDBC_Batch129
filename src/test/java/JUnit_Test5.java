import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test5 {
    @Test
    public void test01(){
        createConnection();
        String s="select * from ogrenciler";
        Assert.assertTrue("test failed",
                getColumnData(s,"ogrenci_ismi").
                        contains("Derya Soylu"));
        closeConnection();
    }
}
