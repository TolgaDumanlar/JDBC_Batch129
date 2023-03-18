import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test3 {
    @Test
    public void test01(){
        createConnection();

        String sql01="select * from ogrenciler";

        Assert.assertTrue("test failed",
                getColumnData(sql01, "ogrenci_ismi").
                        contains("Derya Soyl"));

        closeConnection();
    }
}
