import java.sql.*;

public class Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1) Driver Tanımla
        Class.forName("org.postgresql.Driver");

        //2) Database'e Bağlan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Mina2017.");

        //3) Statement
        Statement st= con.createStatement();

        // Orn:region id si 1 olan country name degerlerini cagirin.

        String sql01= "select country_name from countries where region_id=1";

        //4)ResultSet
        ResultSet veri=st.executeQuery(sql01);

        //5)Dataları Al
        while (veri.next()){
            System.out.println(
                    veri.getString(1));

        }

        //Soru: "region_id"nin 2'den büyük olduğu "country_id" ve "country_name" değerlerini çağırın.

        String sql02= "select country_id, country_name from countries where region_id>2";

        //4)ResultSet
        ResultSet veri2=st.executeQuery(sql02);

        //5)Dataları Al
        while (veri2.next()){
            System.out.println(
                    veri2.getString("country_id")+veri2.getString("country_name"));
    }
        //Bağlantıları Kapatma
        con.close();
        st.close();
        veri.close();
        veri2.close();
    }
}