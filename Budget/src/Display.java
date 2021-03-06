/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomas
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
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

        titleLab = new javax.swing.JLabel();
        workIncomeLab = new javax.swing.JLabel();
        extraIncomeLab = new javax.swing.JLabel();
        rentCostLab = new javax.swing.JLabel();
        internetLab = new javax.swing.JLabel();
        powerLab = new javax.swing.JLabel();
        foodLab = new javax.swing.JLabel();
        leftOverLab = new javax.swing.JLabel();
        totalBudgetLab = new javax.swing.JLabel();
        fuelLab = new javax.swing.JLabel();
        workIncomeInp = new javax.swing.JTextField();
        extraIncomeInp = new javax.swing.JTextField();
        rentCostInp = new javax.swing.JTextField();
        foodInp = new javax.swing.JTextField();
        powerInp = new javax.swing.JTextField();
        internetInp = new javax.swing.JTextField();
        fuelInp = new javax.swing.JTextField();
        totalBudgetInp = new javax.swing.JTextField();
        leftOverInp = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        titleLab.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLab.setText("Budget Application");
        titleLab.setToolTipText("");

        workIncomeLab.setText("Work Income:");

        extraIncomeLab.setText("Extra Income:");

        rentCostLab.setText("Rent:");
        rentCostLab.setToolTipText("");

        internetLab.setText("Internet:");

        powerLab.setText("Power");

        foodLab.setText("Food:");

        leftOverLab.setText("Left Over:");

        totalBudgetLab.setText("Total Budget:");

        fuelLab.setText("Fuel:");

        workIncomeInp.setText("0");
        workIncomeInp.setToolTipText("");
        workIncomeInp.setName(""); // NOI18N
        workIncomeInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workIncomeInpActionPerformed(evt);
            }
        });

        extraIncomeInp.setText("0");
        extraIncomeInp.setToolTipText("");
        extraIncomeInp.setName(""); // NOI18N

        rentCostInp.setText("0");
        rentCostInp.setToolTipText("");
        rentCostInp.setName(""); // NOI18N

        foodInp.setText("0");
        foodInp.setToolTipText("");
        foodInp.setName(""); // NOI18N

        powerInp.setText("0");
        powerInp.setToolTipText("");
        powerInp.setName(""); // NOI18N
        powerInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerInpActionPerformed(evt);
            }
        });

        internetInp.setText("0");
        internetInp.setToolTipText("");
        internetInp.setName(""); // NOI18N

        fuelInp.setText("0");
        fuelInp.setToolTipText("");
        fuelInp.setName(""); // NOI18N
        fuelInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelInpActionPerformed(evt);
            }
        });

        totalBudgetInp.setEditable(false);
        totalBudgetInp.setToolTipText("");

        leftOverInp.setEditable(false);
        leftOverInp.setToolTipText("");

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Weekly - ");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Monthly -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titleLab, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftOverLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalBudgetLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(internetLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(powerLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fuelLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rentCostLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(extraIncomeLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workIncomeLab, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuelInp)
                            .addComponent(internetInp)
                            .addComponent(powerInp)
                            .addComponent(foodInp)
                            .addComponent(rentCostInp)
                            .addComponent(extraIncomeInp)
                            .addComponent(workIncomeInp)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(leftOverInp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(totalBudgetInp, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(enterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workIncomeLab)
                            .addComponent(workIncomeInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extraIncomeLab)
                            .addComponent(extraIncomeInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rentCostLab)
                            .addComponent(rentCostInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodLab)
                            .addComponent(foodInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuelLab)
                            .addComponent(fuelInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerLab)
                    .addComponent(powerInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internetLab)
                    .addComponent(internetInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterBtn)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBudgetLab)
                    .addComponent(totalBudgetInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftOverLab)
                    .addComponent(leftOverInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        // TODO add your handling code here:
        try {
            String workIncome = workIncomeInp.getText();
            String extraIncome = extraIncomeInp.getText();
            String rent = rentCostInp.getText();
            String food = foodInp.getText();
            String fuel = fuelInp.getText();
            String power = powerInp.getText();
            String internet = internetInp.getText();

            String total_budget = Double.toString(Double.parseDouble(extraIncome) + Double.parseDouble(workIncome));
            String weekly = Double.toString(Double.parseDouble(fuel) + Double.parseDouble(food) + Double.parseDouble(rent));
            String monthly = Double.toString(((Double.parseDouble(power) + Double.parseDouble(internet)) / 4));
            String left_over = Double.toString(Double.parseDouble(total_budget) - (Double.parseDouble(weekly) + Double.parseDouble(monthly)));
            totalBudgetInp.setText(total_budget);
            leftOverInp.setText(left_over);
        } catch (NumberFormatException ex){
            leftOverInp.setText("Only numbers");
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void workIncomeInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workIncomeInpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_workIncomeInpActionPerformed

    private void powerInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerInpActionPerformed

    private void fuelInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelInpActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterBtn;
    private javax.swing.JTextField extraIncomeInp;
    private javax.swing.JLabel extraIncomeLab;
    private javax.swing.JTextField foodInp;
    private javax.swing.JLabel foodLab;
    private javax.swing.JTextField fuelInp;
    private javax.swing.JLabel fuelLab;
    private javax.swing.JTextField internetInp;
    private javax.swing.JLabel internetLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField leftOverInp;
    private javax.swing.JLabel leftOverLab;
    private javax.swing.JTextField powerInp;
    private javax.swing.JLabel powerLab;
    private javax.swing.JTextField rentCostInp;
    private javax.swing.JLabel rentCostLab;
    private javax.swing.JLabel titleLab;
    private javax.swing.JTextField totalBudgetInp;
    private javax.swing.JLabel totalBudgetLab;
    private javax.swing.JTextField workIncomeInp;
    private javax.swing.JLabel workIncomeLab;
    // End of variables declaration//GEN-END:variables
}
