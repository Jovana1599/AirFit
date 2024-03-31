/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jovana
 */
public class Trener {
    private int idTrenera;
    private String imeTrenera;
    private String prezimeTrenera;
    private String emailTrenera;

    public Trener() {
    }

    public Trener(int idTrenera, String imeTrenera, String prezimeTrenera, String emailTrenera) {
        this.idTrenera = idTrenera;
        this.imeTrenera = imeTrenera;
        this.prezimeTrenera = prezimeTrenera;
        this.emailTrenera = emailTrenera;
    }

    public int getIdTrenera() {
        return idTrenera;
    }

    public void setIdTrenera(int idTrenera) {
        this.idTrenera = idTrenera;
    }

    public String getImeTrenera() {
        return imeTrenera;
    }

    public void setImeTrenera(String imeTrenera) {
        this.imeTrenera = imeTrenera;
    }

    public String getPrezimeTrenera() {
        return prezimeTrenera;
    }

    public void setPrezimeTrenera(String prezimeTrenera) {
        this.prezimeTrenera = prezimeTrenera;
    }

    public String getEmailTrenera() {
        return emailTrenera;
    }

    public void setEmailTrenera(String emailTrenera) {
        this.emailTrenera = emailTrenera;
    }

    @Override
    public String toString() {
        return imeTrenera+" "+ prezimeTrenera;
    }




}
 