/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Klijent;

/**
 *
 * @author Jovana
 */
public class ModelTabele extends AbstractTableModel {
    private List<Klijent> lk;
    private String[] kolone = {"Ime ", "Prezime", "Trener","Disciplina"};

public ModelTabele(List<Klijent> lk){
    this.lk = lk;
}

   
    public List<Klijent> getLk() {
        return lk;
    }

    public void setLk(List<Klijent> lk) {
        this.lk = lk;
    }

    public String[] getKolone() {
        return kolone;
    }

    public void setKolone(String[] kolone) {
        this.kolone = kolone;
    }

    @Override
    public int getRowCount() {
        return lk.size(); // 
    }

    @Override
    public int getColumnCount() {
      return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Klijent kl = lk.get(rowIndex);
        switch (columnIndex) {
            case 0: return kl.getIme();
            case 1: return kl.getPrezime();
            case 2:return kl.getTrener().getImeTrenera();
            case 3: return kl.getDisciplina();
             
            default:
             return "B/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    void osveziPodatkee() {
        fireTableDataChanged();
    }
    
    
    
}
