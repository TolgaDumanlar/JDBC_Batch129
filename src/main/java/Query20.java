import pojos.Malzeme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtilty.createConnection;

public class Query20 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Mina2017.");

        Statement st = con.createStatement();

        //String s01="create table malzemeler (id int, String varchar(30), fiyat int)";

       // st.executeQuery(s01);

        List<Malzeme>kayitlar= new ArrayList<>();
        kayitlar.add(new Malzeme(1,"Lavabo",12));
        kayitlar.add(new Malzeme(2,"Musluk",15));
        kayitlar.add(new Malzeme(3,"Duşakabin", 45));
        kayitlar.add(new Malzeme(4,"Şofben",80));

        PreparedStatement data=con.prepareStatement("insert into malzemeler values (?,?,?)");

        for(Malzeme each:kayitlar){
            data.setInt(1,each.getId());
            data.setString(2, each.getIsim());
            data.setDouble(3, each.getFiyat());

            data.addBatch();
        }

        data.executeBatch();
        con.close();
        data.close();
    }
}
