
package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class FrmSearch extends javax.swing.JFrame {

    private int x, y;
    
    public FrmSearch() {
        initComponents();
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
        stylusTable1 = new stylustable.StylusTable();
        paneHeader = new javax.swing.JPanel();
        btnLogIn1 = new javax.swing.JButton();
        txtNombreEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(479, 600));
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

        stylusTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stylusTable1);
        if (stylusTable1.getColumnModel().getColumnCount() > 0) {
            stylusTable1.getColumnModel().getColumn(0).setResizable(false);
            stylusTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 480, 330));

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
        txtNombreEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEstudiante.setText("jTextField1");
        txtNombreEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 170, 250)));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogIn1ActionPerformed

    private void lblTopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblTopBarMousePressed

    private void lblTopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopBarMouseDragged
        setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblTopBarMouseDragged

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
    private stylustable.StylusTable stylusTable1;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables

}
