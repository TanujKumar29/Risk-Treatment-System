package com.rts.admin;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateSpocSF.java
 *
 * Created on Aug 31, 2012, 6:21:38 PM
 */
import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SupportFunctionsDAO;
import com.rts.pojoclasses.SFID;
import com.rts.pojoclasses.SF_Spoc;
import com.rts.pojoclasses.SupportFunctions;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author bhandrah
 */
public class UpdateSpocSF extends javax.swing.JFrame
{

     SupportFunctionsDAO supportFunctionsDAO = MySQLDAOFactory.getDAOFactory().getSupportFunctionsDAO();
    SFID supportFunctions = new SFID();
    SFID sfToPass = new SFID();
    SF_Spoc spocs = new SF_Spoc();

     List<SFID>list;
    /** Creates new form UpdateSpocSF */
    public UpdateSpocSF() {
        initComponents();
       list =supportFunctionsDAO.getSupportFunctions();
        Object [] sfArray = new Object[list.size()];
        for(int i=0; i< list.size();i++)
        {
            supportFunctions = list.get(i);
            sfArray[i]=supportFunctions.getSF_Name();
        }

        DefaultComboBoxModel model = new DefaultComboBoxModel(sfArray);
        jComboBox1.setModel(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Select SF : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("SF Owner :");
        jLabel3.setEnabled(false);

        jTextField1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("SF SPOC :");
        jLabel4.setEnabled(false);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Update");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("New SF SPOC : ");
        jLabel5.setEnabled(false);

        jTextField2.setEnabled(false);

        jButton2.setText("Add");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton2)
                .addGap(61, 61, 61)
                .addComponent(jButton3)
                .addContainerGap(452, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField1.setEditable(false);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jList1.setEnabled(true);

        String sfName = (String)jComboBox1.getSelectedItem();
         supportFunctions=supportFunctionsDAO.getSupportFunctionFromName(sfName);
         
         List<SF_Spoc> list = supportFunctionsDAO.getSpocsForSF(supportFunctions.getSFId());
         DefaultListModel model= new DefaultListModel();
             jTextField1.setText(supportFunctions.getSF_Owner());
             if(!list.isEmpty())
             {
                 
                 Iterator iterator = list.iterator();
                 while(iterator.hasNext())
                 {
                     model.addElement(iterator.next());
                 }
             }
             else
            {
                model.addElement("SPOCs not defined");
            }

             
             jList1.setModel(model);
         

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Object[] select=jList1.getSelectedValues();

        if(select.length==1)
        {
            String updatedName=jTextField3.getText();
          //  String selected = (String)select[0];
            spocs.setSfSpocName(updatedName);
            spocs.setSupportFunctions(supportFunctions);

            supportFunctionsDAO.modifySFSpocToDb(spocs);
         }
        else
        {
            JOptionPane.showConfirmDialog(this, "Please select only one spoc to update!", "Update Spoc", JOptionPane.DEFAULT_OPTION);
           

        }
        jComboBox1ActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

          Object [] selected = jList1.getSelectedValues();

        for(int i=0;i<selected.length;i++)
        {
            System.out.println("Selected values are: "+selected[i].toString());
        }
        for(int i=0;i<selected.length;i++)
        {
            int id =supportFunctionsDAO.getSFSpocsFromName(selected[i].toString());
            spocs.setSfSpocId(id);
            spocs.setSupportFunctions(supportFunctions);
            spocs.setSfSpocName(selected[i].toString());
            supportFunctionsDAO.deleteSpocFromDB(spocs);
        }

        jComboBox1ActionPerformed(evt);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String newSpocName = jTextField2.getText();
        String [] splitted = newSpocName.split(",");

        spocs.setSupportFunctions(supportFunctions);
        for(int i=0;i<splitted.length;i++)
        {

            spocs.setSfSpocName(splitted[i]);
            supportFunctionsDAO.addSpocsToSFToDb(spocs);

        }
        jTextField2.setText("");

        jComboBox1ActionPerformed(evt);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSpocSF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
