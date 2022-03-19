import Database.DBConnection;

import java.sql.*;

public class Main {
    public static void main (String[] args) throws SQLException {

        Statement st = DBConnection.getInstance().createStatement();
        ResultSet rs = st.executeQuery("SELECT * from test");
//        while (rs.next()){
//            //do Something
//        }
        rs.next();
        int num = rs.getInt("personId");
        String cj = rs.getString(2);
        float nu = rs.getFloat(3);
        System.out.println(num + " hello " + cj + nu);
        st.close();

    }
}


