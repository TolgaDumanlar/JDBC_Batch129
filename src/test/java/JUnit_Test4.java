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
                        contains("Derya Soylu"));

        Assert.assertTrue("test failed",
                getColumnData(s1,"ogrenci_ismi").
                        contains("Ahmet Aslan"));
        closeConnection();
    }

    @Test

    public void test02(){
        createConnection();
        String s2="select * from ogrenciler";

        Assert.assertTrue("test failed",
                getColumnData(s2,"okul_no").
                        contains(100));

        closeConnection();
    }

    @Test


    public void test03(){
        createConnection();

        String s3="select * from ogrenciler";
        Assert.assertTrue("test failed",
                getColumnData(s3,"sinif").
                        contains("9"));

        closeConnection();
    }


}
