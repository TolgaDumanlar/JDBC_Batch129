import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Mina2017.");

        Statement st = con.createStatement();


        //SORU: Öğrenciler tablosuna yen bir kayıt ekleyin (300, 'Sena Can', 12, 'K')

        //int s1 = st.executeUpdate("insert into ogrenciler values (313, 'Sena Can', 12, 'K')");
        //System.out.println(s1 + " satır database eklendi.");

        //SORU: Öğrenciler tablosuna birden fazla veri ekleyin
        // (400, 'Sena Can', 12, 'K'), (401, 'Sena Can', 12, 'K'), (402, 'Sena Can', 12, 'K')


        /*
        String [] veri = {"insert into ogrenciler values  (700, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values  (701, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values  (702, 'Sena Can', 12, 'K')"};

        //1.Yol

        int count=0;
        for(String each:veri){
            count = count + st.executeUpdate(each);
        }

        System.out.println( count +" satır eklendi");
        */

        //2.Yol
        String [] veri = {"insert into ogrenciler values  (800, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values  (801, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values  (802, 'Sena Can', 12, 'K')"};

        for(String each:veri){
            st.addBatch(each); //Yukarıdaki dataların hepsini birleştiriyor ve hepsini tek seferde gönderiyor
        }

        st.executeBatch();      //Dataları tek seferde gönderiyor
    }
}
