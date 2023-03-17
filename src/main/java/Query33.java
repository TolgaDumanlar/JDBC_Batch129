import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query33 {
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

        //"görevliler" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.

        //String sq01="Create table staff (staff_id int, staff_name varchar (30), staff_salary int)";
        //        //st.execute(sq01);

        //staff tablosuna adres sutunu ekleyin

       // String sq02="Alter Table staff add staf_address varchar (50)";
        //st.execute(sq02);

        //Staff tablosunu siliniz

        //execute ()-> create, drop, alter table (DDL) için kullanılır.
    }
}
