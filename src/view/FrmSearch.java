
package view;

import DAO.DaoManager;
import DAO.DaoPaciente;
import DaoMysql.DaoManagerMysql;
import Model.Paciente;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class FrmSearch extends javax.swing.JFrame {

    private int x, y;
    DaoManager manager;
    DaoPaciente daoPaciente;
    ArrayList<Paciente> listaPacientes;
    public FrmSearch() {
        initComponents();
        manager = DaoManagerMysql.getDaoManager();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinimize = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblTopBar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        paneHeader = new javax.swing.JPanel();
        btnLogIn1 = new javax.swing.JButton();
        txtNombreEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimize.setBackground(new java.awt.Color(90, 170, 250));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setText("_");
        btnMinimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 170, 250)));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.setFocusPainted(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 2, 30, 20));

        btnClose.setBackground(new java.awt.Color(90, 170, 250));
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 170, 250)));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 2, 30, 20));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTitle.setForeground(java.awt.Color.white);
        lblTitle.setText("SISTEMA EXPERTO PARA EL DIAGNÓSTICO DE DESNUTRICIÓN INFANTIL");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 390, 20));

        lblTopBar.setBackground(new java.awt.Color(90, 170, 250));
        lblTopBar.setOpaque(true);
        lblTopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTopBarMouseDragged(evt);
            }
        });
        lblTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTopBarMousePressed(evt);
            }
        });
        getContentPane().add(lblTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 24));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePacientes);
        if (tablePacientes.getColumnModel().getColumnCount() > 0) {
            tablePacientes.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 330));

        paneHeader.setBackground(new java.awt.Color(90, 170, 250));
        paneHeader.setPreferredSize(new java.awt.Dimension(10, 0));

        btnLogIn1.setBackground(new java.awt.Color(80, 160, 240));
        btnLogIn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogIn1.setForeground(java.awt.Color.white);
        btnLogIn1.setText("BUSCAR");
        btnLogIn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogIn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn1.setFocusPainted(false);
        btnLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogIn1ActionPerformed(evt);
            }
        });

        txtNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreEstudiante.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEstudiante.setText("Nombre del paciente");
        txtNombreEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 170, 250)));
        txtNombreEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreEstudianteMouseClicked(evt);
            }
        });
        txtNombreEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstudianteKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreEstudianteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEstudianteKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BUSCAR ESTUDIANTES");

        javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
        paneHeader.setLayout(paneHeaderLayout);
        paneHeaderLayout.setHorizontalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneHeaderLayout.createSequentialGroup()
                        .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEstudiante))
                        .addGap(35, 35, 35))))
        );
        paneHeaderLayout.setVerticalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneHeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(paneHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogIn1ActionPerformed
        if(txtNombreEstudiante.getText().trim().length() ==0)return;
        this.buscarPaciente(txtNombreEstudiante.getText().trim());
    }//GEN-LAST:event_btnLogIn1ActionPerformed

    private void lblTopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblTopBarMousePressed

    private void lblTopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopBarMouseDragged
        setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblTopBarMouseDragged

    private void txtNombreEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudianteKeyReleased
        
    }//GEN-LAST:event_txtNombreEstudianteKeyReleased

    private void txtNombreEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEstudianteMouseClicked
        if(txtNombreEstudiante.getText().equals("Nombre del paciente")){
            txtNombreEstudiante.setText("");
            txtNombreEstudiante.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreEstudianteMouseClicked

    private void txtNombreEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudianteKeyPressed
        if(evt.getKeyCode()==Event.ENTER){
            this.buscarPaciente(txtNombreEstudiante.getText().trim());
        }
    }//GEN-LAST:event_txtNombreEstudianteKeyPressed

    private void txtNombreEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudianteKeyTyped
        if(txtNombreEstudiante.getText().trim().length()>0){
            this.buscarPaciente(txtNombreEstudiante.getText().trim());
        }
    }//GEN-LAST:event_txtNombreEstudianteKeyTyped

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogIn1;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTopBar;
    private javax.swing.JPanel paneHeader;
    private javax.swing.JTable tablePacientes;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
   private void buscarPaciente(String nombreApellido){
       daoPaciente = manager.getDaoPaciente();
       listaPacientes = daoPaciente.buscarPaciente(txtNombreEstudiante.getText().trim());
       this.mostrarLista();
   }
   private void mostrarLista(){
       DefaultTableModel dtm= (DefaultTableModel) tablePacientes.getModel();
       int tam= tablePacientes.getRowCount();
       for(int i =0 ;i< tam ; i++){
           dtm.removeRow(0);
       }
       
       for(int i=0 ; i<listaPacientes.size();i++){
           String nomApe= listaPacientes.get(i).getNombre() + " "+ listaPacientes.get(i).getApellido();
           dtm.addRow(new Object[]{nomApe});
       }
   }
}
