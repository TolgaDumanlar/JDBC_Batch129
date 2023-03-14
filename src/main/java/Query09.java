import pojos.Doctor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query09 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Mina2017.");

        Statement st = con.createStatement();

        //Doctor tablosunu olusturun

        //String  sql01="create table doctors (id int, isim varchar (30), bolum varchar (20), ucret int)";
        //st.execute(sql01);

        //POJO class kullanarak tabloya veri ekleyiniz.
        List<Doctor> kayitlar= new ArrayList<>();
        kayitlar.add(new Doctor(20, "Ali Can", "Cildiye", 500));
        kayitlar.add(new Doctor(30, "Veli Can", "Dahiliye", 400));
        kayitlar.add(new Doctor(40, "Hasan Can", "Genel Cerrahi", 300));
        kayitlar.add(new Doctor(50, "Ahmet Can", "KBB", 600));
        kayitlar.add(new Doctor(60, "Selami Can", "Göz", 700));
        kayitlar.add(new Doctor(70, "Ayşe Can", "Psikiyatr", 900));

        PreparedStatement data=con.prepareStatement("insert into doctors values(?,?,?,?)");

        for(Doctor each:kayitlar){
            data.setInt(1,each.getId());
            data.setString(2, each.getIsim());
            data.setString(3,each.getBolum());
            data.setDouble(4, each.getUcret());

            data.addBatch(); //Dataları bir araya getirir.
        }
            data.executeBatch();
            con.close();
            data.close();

    }
}
