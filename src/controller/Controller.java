package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Discplina;
import model.Klijent;
import model.Trener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jovana
 */
public class Controller {
    private DBBroker dbb;
    private List<Trener> treneri = new ArrayList<>();
    private List<Klijent> klijenti = new ArrayList<>();
    private static Controller instance;
    
    public static Controller getInstance(){
    if(instance == null){
    instance = new Controller();
} 
    return instance;
    
    
    
}

    private Controller() {
        dbb = new DBBroker();
  /*  Trener t1 = new Trener(1, "Katarina ", "Belic", "tbelic@gmail.com");
    Trener t2 = new Trener(2, "Sofija ", "Popović", "mpopovic@gmail.com");     
    Trener t3 = new Trener(1, "Marija ", "Marković", "mmarkovic@gmail.com");
    
   Klijent k1= new Klijent(1, "Mara", "Sokic", t1, 06655555, "hjcejn@gmail.com", Discplina.PRACTICE);
   Klijent k2= new Klijent(2, "Sara", "Maric", t1, 06655555, "hjcejn@gmail.com", Discplina.POLE_DANCE);
 Klijent k3= new Klijent(3, "Dara", "Marjanovic", t3, 06655555, "hjcejn@gmail.com", Discplina.AERIAL_HAMMOCK);
    
   treneri.add(t3);
   treneri.add(t2);
   treneri.add(t1);
    
    klijenti.add(k3);
    klijenti.add(k2);
    klijenti.add(k1);
    
    */
    }

    public List<Trener> getTreneri() {
        return treneri;
    }

    public void setTreneri(List<Trener> treneri) {
        this.treneri = treneri;
    }

    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }

    public void obrisiKlijenta(int sk) {
        klijenti.remove(sk);
    }

    public void dodajKlijenta(Klijent nk) {
      klijenti.add(nk);
    }

    public List<Klijent> ucitajListuKlijenataIzBaze() {
      return dbb.ucitajListuKlijenataIzBaze();
   
       
    }

    public List<Trener> ucitajListuTreneraIzBaze() {
     return dbb.ucitajListuTreneraIzBaze();
    }
    
    
    
    
    
}
