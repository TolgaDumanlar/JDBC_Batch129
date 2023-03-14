import pojos.Urun;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query07 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Mina2017.");

        Statement st = con.createStatement();

        // SORU: Urunler adında bir tablo olusturalım (id int, isim varchar(10), fiyat int)
        //st.execute("create table urunler (id int, isim varchar(10),fiyat int)");

        //Çok miktarda kayıt eklemek için PrepareStatement () kullanılır.
        //Bunun haricinde POJO class kulanarakta bunu yapabiliriz.

        List <Urun> kayitlar= new ArrayList<>();
        kayitlar.add(new Urun(100, "Laptop", 35000));
        kayitlar.add(new Urun(101, "Mouse", 350));
        kayitlar.add(new Urun(102, "MacBookPro", 95000));
        kayitlar.add(new Urun(103, "Ana Kart", 5000));
        kayitlar.add(new Urun(104, "Klavye", 450));
        kayitlar.add(new Urun(105, "IPad", 45000));

        PreparedStatement tablo=con.prepareStatement("insert into urunler values (?,?,?)");

        for(Urun each:kayitlar){
            tablo.setInt(1, each.getId());
            tablo.setString(2,each.getIsim());
            tablo.setDouble(3,each.getFiyat());

            tablo.addBatch();
        }

        tablo.executeBatch();

        con.close();
        st.close();
        tablo.close();
    }
}
