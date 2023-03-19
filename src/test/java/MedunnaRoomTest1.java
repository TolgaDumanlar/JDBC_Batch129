import org.junit.Assert;
import org.junit.Test;
import utilities.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MedunnaRoomTest1 {

    //"john_doe" isimde kullanıcı tarafından oda oluşturmuş mu?
    @Test

    public void roomTest() throws SQLException {
        //Database bağlandık

        JdbcUtils.connectToDataBase("medunna.com",
                "medunna_db",
                "medunna_user",
                "medunna_pass_987");

        Statement statement=JdbcUtils.createStatement();
        String s1="select created_by from room";

        ResultSet resultSet1=statement.executeQuery(s1);
        List<String>created_byList=new ArrayList<>();

        while (resultSet1.next()){
            created_byList.add(resultSet1.getString(1));
        }
        System.out.println("oda oluşturanlar" + created_byList);

        Assert.assertTrue("test failed", created_byList.contains("john_doe"));

        JdbcUtils.closeConnectionAndStatement();
}
}