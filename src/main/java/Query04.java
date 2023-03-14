import java.sql.*;

public class Query04 {

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

        ResultSet rs = st.executeQuery("select * from ogrenciler");

        ResultSetMetaData rsmd=rs.getMetaData();
        System.out.println("Sütun sayisi:"  + rsmd.getColumnCount());
        System.out.println("1.Sütunun ismi:" +rsmd.getColumnName(1));
        System.out.println("2.Sütunun ismi:" +rsmd.getColumnName(2));
        System.out.println("3.Sütunun ismi:" +rsmd.getColumnName(3));
        System.out.println("4.Sütunun ismi:" +rsmd.getColumnName(4));

        System.out.println("Tablo ismi :" + rsmd.getTableName(2));

        System.out.println(rsmd.getColumnTypeName(4));
    }
}
