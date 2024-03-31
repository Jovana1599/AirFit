/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jovana
 */
public class Klijent {
    private int idKlijent;
    private String ime;
    private  String prezime;
private Trener trener;
private int brojTelefona;
private String emailKlijenta;
private Discplina disciplina; 

    public Klijent() {
    }

    public Klijent(int idKlijent, String ime, String prezime, Trener trener, int brojTelefona, String emailKlijenta, Discplina disciplina) {
        this.idKlijent = idKlijent;
        this.ime = ime;
        this.prezime = prezime;
        this.trener = trener;
        this.brojTelefona = brojTelefona;
        this.emailKlijenta = emailKlijenta;
        this.disciplina = disciplina;
    }

 

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    
    public int getIdKlijent() {
        return idKlijent;
    }

    public void setIdKlijent(int idKlijent) {
        this.idKlijent = idKlijent;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getEmailKlijenta() {
        return emailKlijenta;
    }

    public void setEmailKlijenta(String emailKlijenta) {
        this.emailKlijenta = emailKlijenta;
    }

    public Discplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Discplina disciplina) {
        this.disciplina = disciplina;
    }



}
