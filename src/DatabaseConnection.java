import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection connect() {

        try {
            String url = "jdbc:postgresql://localhost:5432/DBmarket";
            String user = "postgres";
            String password = "0000";

            Connection conn =
                    DriverManager.getConnection(url, user, password);

            System.out.println("Connected to PostgreSQL!");
            return conn;

        } catch (Exception e) {
            System.out.println("Connection error!");
            e.printStackTrace();
            return null;
        }
    }
}