/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;


import java.util.ArrayList;
import java.util.List;
import model.Klijent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Discplina;
import model.Trener;
/**
 *
 * @author Jovana
 */
public class DBBroker {

    public List<Klijent> ucitajListuKlijenataIzBaze() {
 
       List<Klijent> lista = new ArrayList<>();
   
        try {
            String upit = "SELECT * FROM klijent k  JOIN trener t ON k.idKlijent = t.idTrenera;";
            Statement  st = Konekcija.getInstance().gettConnection().createStatement();
         ResultSet rs = st.executeQuery(upit);
         while(rs.next()){
             int idK = rs.getInt("k.idKlijent");
             String ime = rs.getString("k.ime");
                     String prezime = rs.getString("k.prezime");
                             int brojTelefona = rs.getInt("k.brojTelefona");
                                     String emailKlijenta = rs.getString("k.emailKlijenta");
                          String disciplina =rs.getString("k.dispilina");
                       Discplina d = Discplina.valueOf(disciplina);
                       int idT = rs.getInt("t.idTrenera");
                       String imeTrenera = rs.getString("t.imeTrenera");
                               String prezimeTrenera = rs.getString("t.prezimeTrenera");
                                       String emailTrenera = rs.getString("t.emailTrenera");
                                       
         Trener t = new Trener(idT, imeTrenera, prezimeTrenera,emailTrenera);
        Klijent k = new Klijent(idK, ime, prezime, t, brojTelefona, emailKlijenta, d);
        
         lista.add(k);
         
         } }
        catch (Exception e) {
                  Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, e);
        }
  return lista;
    
    }

    public List<Trener> ucitajListuTreneraIzBaze() {
      
  List<Trener> lista = new ArrayList<>();
        try {
            String upit = "Select * from trener t;";
            Statement st = Konekcija.getInstance().gettConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){
                int idT = rs.getInt("t.idTrenera");
                String ime = rs.getString("t.imeTrenera");
                
                String prezime = rs.getString("t.prezimeTrenera");
                String email = rs.getString("t.prezimeTrenera");
                Trener t = new Trener(idT, ime, prezime, email);
                lista.add(t);
            }
            
            
            
        } catch (Exception e) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
}
}
