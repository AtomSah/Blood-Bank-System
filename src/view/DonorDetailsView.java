package view;

import java.sql.ResultSet;
//import Project.ConnectionProvider;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.awt.event.ComponentListener;
//import java.awt.event.w;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Acer
 */
public class DonorDetailsView extends javax.swing.JFrame {

    /**
     * Creates new form allDonorDetails
     */
    public DonorDetailsView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonorDetails = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("All Donor Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 14, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 700, 10));

        tblDonorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDonorDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 688, 293));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, 694, 10));

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 407, -1, -1));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 407, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addTableListner(ComponentListener listenForComponent) {
        this.addComponentListener(listenForComponent);

    }

    public void setDonorDetails(ResultSet rs) {
        tblDonorDetails.setAutoResizeMode(tblDonorDetails.AUTO_RESIZE_OFF);
        tblDonorDetails.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        try {
//    Connection con = ConnectionProvider.getCon();
//    Statement st = con.createStatement();
//    ResultSet rs = st.executeQuery("SELECT * FROM donor");
//    tblDonorDetails.setAutoResizeMode(tblDonorDetails.AUTO_RESIZE_OFF);
//    tblDonorDetails.setModel(DbUtils.resultSetToTableModel(rs));
//} catch (Exception e) {
//    JOptionPane.showMessageDialog(null, e);
//    
//}


    }//GEN-LAST:event_formComponentShown

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
//        // TODO add your handling code here:
//        try{
//            jTable1.print(JTable.PrintMode.NORMAL);
//
//        
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        
//        }

// ...
// TODO add your handling code here:
        try {
            MessageFormat headerFormat = new MessageFormat(" All Donors' Details ");
            MessageFormat footerFormat = new MessageFormat("- {0} -");
            tblDonorDetails.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, e);
        }

//MessageFormat header = new MessageFormat("::: All Customers :::");
//        MessageFormat footer = new MessageFormat("Bhat-Bhateni POS Management System");
//        try{
//            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
//            
//        }
//        catch (PrinterException e){
//            JOptionPane.showMessageDialog(null,"Error! Cannot Print"+e.getMessage());
//        }

    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        this.dispose();
//        new Dashboard().setVisible(true);

    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonorDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonorDetailsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblDonorDetails;
    // End of variables declaration//GEN-END:variables
}
