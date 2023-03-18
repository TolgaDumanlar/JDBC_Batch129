import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test4 {
    @Test

    public void test01(){
        createConnection();
        String s1="select * from ogrenciler";
        Assert.assertTrue("test failed",
                getColumnData(s1,"ogrenci_ismi").
                        contains("tolga"));
        closeConnection();
    }

}
