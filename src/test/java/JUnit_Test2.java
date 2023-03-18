import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;


public class JUnit_Test2 {
@Test
    public void test01(){

    createConnection();
    String sql01="select * from ogrenciler";
    //System.out.println(getColumnData(sql01, "ogrenci_ismi"));
    Assert.assertTrue("test failed",getColumnData(sql01,
            "ogrenci_ismi").contains("Derya Soylu"));







    //System.out.println(getColumnNames(sql01));
    //System.out.println(getColumnData(sql01, "cinsiyet"));
    closeConnection();
    }
}
