import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.DatabaseUtilty.*;

public class TestNG_Test1 {
    @Test
    public void test01(){
        createConnection();
        String s1="select * from ogrenciler";
        Assert.assertTrue(getColumnData
                (s1,"ogrenci_ismi").contains("Derya Soylu"),
                "test failed");
        closeConnection();
    }
    @Test
    public void test02(){
        createConnection();
        String s2="select * from ogrenciler";
        Assert.assertTrue(getColumnData
                        (s2,"okul_no").contains(120),
                        "test failed");
        closeConnection();
    }
}
