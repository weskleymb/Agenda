package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    public Connection connection = null;
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String DATABASE = "db_agenda";
    private final String URL = "jdbc:mariadb://localhost:3306/" + DATABASE;
    private final String USER = "root";
    private final String PASSWORD = "";
    
    //org.mariadb.jdbc.Driver
    //jdbc:mariadb://localhost:3306/
    
    //com.mysql.cj.jdbc.Driver
    //jdbc:mysql://localhost:3306/
    
    public boolean open() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONNECT");
            return true;
        } catch (ClassNotFoundException error) {
            System.out.println("DRIVER NOT FOUND");
            System.out.println("ERRO: " + error.toString());
        } catch (SQLException error) {
            System.out.println("PROBLEMS WITH CONECTION");
            System.out.println("ERRO: " + error.toString());
        }
        return false;
    }
    
    public boolean close() {
        try {
            connection.close();
            System.out.println("DISCONNECT");
            return true;
        } catch (SQLException error) {
            System.out.println("PROBLEMS WITH DISCONECTION");
            System.out.println("ERRO: " + error.toString());
        }
        return false;
    }
    
}
