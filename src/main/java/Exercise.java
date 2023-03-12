import java.sql.*;

public class Exercise {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1) Driver Tanımla
        Class.forName("org.postgresql.Driver");

        //2) Database'e Bağlan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/techproeducation",
                "postgres",
                "Mina2017.");

        //3) Statement
        Statement st= con.createStatement();

        //4)ResultSet
        ResultSet veri=st.executeQuery("select eleman_id from elemanlar where eleman_id=100 ");

        while (veri.next()){
            System.out.println(veri.getInt(1));
        }
    }
}
