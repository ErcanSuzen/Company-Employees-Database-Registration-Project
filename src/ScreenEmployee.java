
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author ERCAN
 */
public class ScreenEmployee extends javax.swing.JDialog {
    DefaultTableModel model; 
    EmployeeOperations employeeOperations = new EmployeeOperations();
    

    /**
     * Creates new form ScreenEmployee
     */
    public ScreenEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) employee_table.getModel();
        employeeReview();
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
        employee_table = new javax.swing.JTable();
        searchArea = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameArea = new javax.swing.JTextField();
        surnameArea = new javax.swing.JTextField();
        departmentArea = new javax.swing.JTextField();
        salaryArea = new javax.swing.JTextField();
        messageLabel2 = new javax.swing.JLabel();
        buttonnewadd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "name", "surname", "department", "salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employee_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employee_table);
        if (employee_table.getColumnModel().getColumnCount() > 0) {
            employee_table.getColumnModel().getColumn(0).setResizable(false);
            employee_table.getColumnModel().getColumn(1).setResizable(false);
            employee_table.getColumnModel().getColumn(2).setResizable(false);
            employee_table.getColumnModel().getColumn(3).setResizable(false);
            employee_table.getColumnModel().getColumn(4).setResizable(false);
        }

        searchArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAreaKeyReleased(evt);
            }
        });

        jLabel1.setText("Name :");

        jLabel2.setText("Surname :");

        jLabel3.setText("Department :");

        jLabel4.setText("Salary :");

        messageLabel2.setForeground(new java.awt.Color(255, 0, 0));

        buttonnewadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonnewadd.setText("Add  New Employee");
        buttonnewadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnewaddActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUpdate.setText("Update Employee");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDelete.setText("Delete Employee");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameArea)
                            .addComponent(surnameArea)
                            .addComponent(departmentArea)
                            .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonnewadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonnewadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surnameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departmentArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void dynamicSearch(String search){
    TableRowSorter<DefaultTableModel> tr= new  TableRowSorter<DefaultTableModel>(model);
    employee_table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(search));
    
}
    private void searchAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAreaKeyReleased
     String search = searchArea.getText();
     dynamicSearch(search);
    }//GEN-LAST:event_searchAreaKeyReleased

    private void buttonnewaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnewaddActionPerformed
       messageLabel2.setText("");
       String name = nameArea.getText();
       String surname = surnameArea.getText();
       String department = departmentArea.getText();
       String salary = salaryArea.getText();
       
       employeeOperations.employeeAdd(name,surname,department,salary);
       employeeReview();
       messageLabel2.setText("New employee was added successfully...");
    }//GEN-LAST:event_buttonnewaddActionPerformed

    private void employee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_tableMouseClicked
 int selectedrow = employee_table.getSelectedRow();
 nameArea.setText(model.getValueAt(selectedrow,1).toString());
 surnameArea.setText(model.getValueAt(selectedrow,2).toString());
 departmentArea.setText(model.getValueAt(selectedrow,3).toString());
 salaryArea.setText(model.getValueAt(selectedrow,4).toString());
 
    }//GEN-LAST:event_employee_tableMouseClicked

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
       String name = nameArea.getText();
       String surname= surnameArea.getText();
       String department = departmentArea.getText();
       String salary= salaryArea.getText();
       
       int selectedrow = employee_table.getSelectedRow();
       if ( selectedrow== -1){
           if(model.getRowCount() ==0){
               messageLabel2.setText("List has no employee!!!");
                    
           }
           else {
               messageLabel2.setText("Please select the employee for update...");
           }
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           employeeOperations.updateEmployee(id,name,surname,department,salary);
           employeeReview();
           messageLabel2.setText("Update successfully...");
       }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
    messageLabel2.setText("");
    int selectedRow = employee_table.getSelectedRow();
    if (selectedRow ==-1){
        if(model.getRowCount() ==0){
            messageLabel2.setText("List has no employee!!!");
        }
        else {
            messageLabel2.setText("Please select the employee for delete...");
        }
    }
    else{
      int id =(int)model.getValueAt(selectedRow, 0); 
      employeeOperations.deleteEmployee(id);
      employeeReview();
      messageLabel2.setText("Update succesfully");
      
    }
    
    
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void employeeReview(){
        model.setRowCount(0);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees = employeeOperations.employeesfill();
        
        if(employees!=null){
            for(Employee employee : employees){
                Object[] toaddlist = {employee.getId(), employee.getName(), employee.getSurname(), employee.getDepartment(),employee.getSalary()};
                model.addRow(toaddlist);
        }
        }
    }
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
            java.util.logging.Logger.getLogger(ScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScreenEmployee dialog = new ScreenEmployee(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JButton buttonnewadd;
    private javax.swing.JTextField departmentArea;
    private javax.swing.JTable employee_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel messageLabel2;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField salaryArea;
    private javax.swing.JTextField searchArea;
    private javax.swing.JTextField surnameArea;
    // End of variables declaration//GEN-END:variables
}