import static utilities.DatabaseUtilty.*;

public class Query08 {

    public static void main(String[] args) {

        createConnection();

        String sql01="select * from ogrenciler";

        System.out.println(getColumnNames(sql01));

        System.out.println(getColumnData(sql01, "okul_no"));

        System.out.println(getColumnData(sql01, "ogrenci_ismi"));

        System.out.println(getColumnData(sql01, "sinif"));
    }
}
