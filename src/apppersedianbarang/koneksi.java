/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppersedianbarang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
public static Connection conn;
public static Statement stm;
 
 public static Connection getConnection(){
    if (conn==null){
        try {
            String url ="jdbc:mysql://localhost:3306/db_apkpersedian";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            stm =  conn.createStatement();
        } catch (Exception e) {
        Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, e); // Logging exception
        }
    }
    return conn;
    }       
}
