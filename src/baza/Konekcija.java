/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql. SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author Jovana
 */
public class Konekcija {
    private static Konekcija instance;
    private Connection connection;

    private Konekcija() {
    
        try {
            String url = "jdbc:mysql://localhost:3003/airfit";
            connection = DriverManager.getConnection(url, "root", "");
      connection.setAutoCommit(false);
        } catch (Exception ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static Konekcija getInstance() {
        if(instance == null){
            instance = new Konekcija();
        }
        return instance;
}
      public Connection gettConnection() {
          return connection;
      }
    
    
    
    
    
     
    
    
    
}
