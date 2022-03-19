package Database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection instance = null;

    private DBConnection(){

        Properties props = new Properties();
        FileInputStream in = null;
        try{
            System.out.println("Path: " + Paths.get(".").toAbsolutePath().normalize().toString());
            in = new FileInputStream("src/Database/db.props");
            props.load(in);
            in.close();
            String url = props.getProperty("jdbc.url");
            String name = props.getProperty("jdbc.username");
            String pw = props.getProperty("jdbc.pw");
            String schema = props.getProperty("jdbc.schema");

            //get a connection with DriverManager
            instance = DriverManager.getConnection(url+schema, name, pw);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }

    }

    public static Connection getInstance() {
        if (instance == null) {
            new DBConnection();
        }
        return instance;
    }
}
