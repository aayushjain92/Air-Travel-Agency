/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Customer;
import Business.CustomerDirectory;
import Business.BookingDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info
 */
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountPanel
     */
    private CustomerDirectory custDir;
    private BookingDirectory bookingDir;
    private JPanel rightPanel;

    ManageCustomerPanel(JPanel rightPanel, CustomerDirectory custDir, BookingDirectory bookingDir) {
        initComponents();
        this.custDir = custDir;
        this.bookingDir = bookingDir;
        populate();
        this.rightPanel = rightPanel;
    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblDirectory.getModel();
        dtm.setRowCount(0);

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        df.setLenient(false);
        for (Customer a : custDir.getCustomerDirectory()) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = df.format(a.getDateOfBirth());
            row[2] = a.getEmail();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        lblManage = new javax.swing.JLabel();
        lblSearchCustNo = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Date of Birth", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setText("Manage Customer");

        lblSearchCustNo.setText("Search by Customer Name");

        btnDelete.setText("Delete Customer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewCustomer.setText("View Customer");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblManage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSearchCustNo)
                            .addGap(18, 18, 18)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClear))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnViewCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchCustNo)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnClear))
                .addGap(15, 15, 15)
                .addComponent(btnViewCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Customer cust = (Customer) tblDirectory.getValueAt(selectedRow, 0);
                if (bookingDir.searchBooking(cust.getEmail()) == null) {
                    custDir.deleteCustomer(cust);
                    populate();
                } else {
                    JOptionPane.showMessageDialog(null, "There is a booking against this customer, please cancel the booking before deleting the customer");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // TODO add your handling code here:
        int row = tblDirectory.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            return;
        }
        Customer customer = (Customer) tblDirectory.getValueAt(row, 0);
        ViewCustomerPanel viewPanel = new ViewCustomerPanel(rightPanel, customer, custDir);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        rightPanel.add(viewPanel);
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtsearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchtext = txtsearch.getText().trim().toLowerCase();
        Customer customer = null;
        if (searchtext.length() > 0) {
            for (Customer a : custDir.getCustomerDirectory()) {
                if (a.getName().trim().toLowerCase().equals(searchtext)) {
                    customer = a;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter search text");
            return;
        }

        if (customer != null) {
            ViewCustomerPanel viewPanel = new ViewCustomerPanel(rightPanel, customer, custDir);
            CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
            rightPanel.add(viewPanel);
            cardLayout.next(rightPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Search text did not match with any customers");
            return;
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblSearchCustNo;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
