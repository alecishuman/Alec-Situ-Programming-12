import java.io.File;
import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DatabaseHandler() {
        createConnection();
    }

    public void createTable(String directory) {
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, directory, null);
            if (tables.next()) {
                System.out.println("Table " + directory + " exists");
            } else {
                String statement = "CREATE TABLE " + directory + " ("
                        + "id varchar(200) primary key, \n"
                        + "filename varchar(200), \n"
                        + "path varchar(200), \n"
                        + "extension varchar(200), \n"
                        + "size varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public boolean execAction(String qu) {
        try {
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException throwables) {
            System.out.println(throwables);
        }
        return false;
    }
    public ResultSet execQuery(String query) {
        ResultSet resultSet;
        try {
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        return resultSet;
    }
}
