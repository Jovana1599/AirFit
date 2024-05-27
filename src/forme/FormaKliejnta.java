/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Discplina;
import model.Klijent;
import model.Trener;


/**
 *
 * @author Jovana
 */
public class FormaKliejnta extends javax.swing.JDialog {
private GlavnaForma gf;
private controller.Controller c;

    /**
     * Creates new form FormaKliejnta
     */
    public FormaKliejnta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        c = Controller.getInstance();
        popuniListuTrenera();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Naziv1 = new javax.swing.JLabel();
        jTextFieldImeKlijenta = new javax.swing.JTextField();
        Naziv2 = new javax.swing.JLabel();
        jTextFieldPrezimeKlijenta = new javax.swing.JTextField();
        Naziv3 = new javax.swing.JLabel();
        jTextFieldBrojTelefona = new javax.swing.JTextField();
        Naziv4 = new javax.swing.JLabel();
        Naziv5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Naziv6 = new javax.swing.JLabel();
        jTextFieldEmailKlijenta1 = new javax.swing.JTextField();
        jComboBoxTrener = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("DODAJ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Naziv1.setText("Ime");

        Naziv2.setText("Prezime");

        Naziv3.setText("e-mail");

        Naziv4.setText("Broj telefona");

        Naziv5.setText("Disciplina");

        jComboBox1.setModel(new DefaultComboBoxModel(Discplina.values()));

        Naziv6.setText("Trener");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Naziv2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(199, 199, 199)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Naziv1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrezimeKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldImeKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Naziv4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Naziv5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Naziv6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Naziv3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmailKlijenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTrener, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldImeKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naziv1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Naziv2)
                    .addComponent(jTextFieldPrezimeKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Naziv4)
                    .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Naziv3)
                    .addComponent(jTextFieldEmailKlijenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Naziv6)
                    .addComponent(jComboBoxTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naziv5))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String ime  = jTextFieldImeKlijenta.getText();
      String prezime = jTextFieldPrezimeKlijenta.getText();
      String email =jTextFieldEmailKlijenta1.getText();
      
      int brojTelefona;
     try{
        //radis parsiranje a ne kastovanje
         brojTelefona = Integer.parseInt(jTextFieldBrojTelefona.getText());
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina mora biti broj", "Greska", JOptionPane.WARNING_MESSAGE);
            return;
        } 
     
     Trener trener = (Trener) jComboBoxTrener.getSelectedItem();
     Discplina dis = (Discplina) jComboBox1.getSelectedItem();
    
    
     Klijent nk = new Klijent(0, ime, prezime, trener, brojTelefona, prezime, dis);
 c.dodajKlijenta(nk);
 //gf.osveziPodatke();
JOptionPane.showMessageDialog(this, "Dodatooo");
this.dispose();
 
 
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Naziv1;
    private javax.swing.JLabel Naziv2;
    private javax.swing.JLabel Naziv3;
    private javax.swing.JLabel Naziv4;
    private javax.swing.JLabel Naziv5;
    private javax.swing.JLabel Naziv6;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<Trener> jComboBoxTrener;
    private javax.swing.JTextField jTextFieldBrojTelefona;
    private javax.swing.JTextField jTextFieldEmailKlijenta1;
    private javax.swing.JTextField jTextFieldImeKlijenta;
    private javax.swing.JTextField jTextFieldPrezimeKlijenta;
    // End of variables declaration//GEN-END:variables

    private void popuniListuTrenera() {
    jComboBoxTrener.removeAllItems();
       List<Trener> treneri = c.ucitajListuTreneraIzBaze();
       for(Trener tr : treneri) {
          jComboBoxTrener.addItem(tr);
       }
    }
}
