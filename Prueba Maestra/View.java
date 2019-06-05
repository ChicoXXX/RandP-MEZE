
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class View extends javax.swing.JFrame {
    
    public View() {
        initComponents();
                  try {
            DefaultTableModel modelo = new DefaultTableModel();
            TableCalificaciones.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();

            String sql = "call sp_vista";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre de la materia");
            modelo.addColumn("Promedio");
       
            
            int[] anchos = {50,60, 80, 80,50};
            for (int i = 0; i < TableCalificaciones.getColumnCount(); i++) {
                TableCalificaciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TXTMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BTNBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCalificaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Contenido.setBackground(new java.awt.Color(204, 204, 204));
        Contenido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ContenidoMouseDragged(evt);
            }
        });
        Contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContenidoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ContenidoMouseReleased(evt);
            }
        });

        BarraLateral.setBackground(new java.awt.Color(0, 0, 0));
        BarraLateral.setMaximumSize(new java.awt.Dimension(300, 423));
        BarraLateral.setMinimumSize(new java.awt.Dimension(300, 423));
        BarraLateral.setPreferredSize(new java.awt.Dimension(300, 423));
        BarraLateral.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraLateralMouseDragged(evt);
            }
        });
        BarraLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraLateralMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BarraLateralMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calificaciones");

        TXTMatricula.setBackground(new java.awt.Color(0, 0, 0));
        TXTMatricula.setForeground(new java.awt.Color(255, 255, 255));
        TXTMatricula.setBorder(null);
        TXTMatricula.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TXTMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTMatriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTMatriculaFocusLost(evt);
            }
        });
        TXTMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMatriculaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Matrícula");

        BTNBuscar.setBackground(new java.awt.Color(0, 0, 0));
        BTNBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Search_30px.png"))); // NOI18N
        BTNBuscar.setBorder(null);
        BTNBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sf.png"))); // NOI18N

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(BTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52))
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(BTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_15px_1.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        TableCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nombre", "Apellido", "Nom. Materia", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(TableCalificaciones);

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(125, 125, 125)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//EVENTOS MOVER BARRA LATERAL
    int xx, yy;
    private void BarraLateralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraLateralMousePressed
        setOpacity((float) 0.8);

        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_BarraLateralMousePressed

    private void BarraLateralMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraLateralMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_BarraLateralMouseReleased

    private void BarraLateralMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraLateralMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_BarraLateralMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
//FIN EVENTOS MOVER BARRA LATERAL

    // EVENTO ESCRIBIR 
    private void TXTMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMatriculaActionPerformed
        if (("Buscar...").equals(TXTMatricula.getText())) {
            TXTMatricula.setText("");
        }
    }//GEN-LAST:event_TXTMatriculaActionPerformed

    private void TXTMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTMatriculaFocusGained
        if (("").equals(TXTMatricula.getText())) {
            TXTMatricula.setText("Buscar...");
        }
    }//GEN-LAST:event_TXTMatriculaFocusGained
    //FIN EVENTO ESCRIBIR
    //No se que weas es esto
    private void TXTMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTMatriculaFocusLost

    }//GEN-LAST:event_TXTMatriculaFocusLost
//EVENTOS  MOVER CONTENIDO

    private void ContenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenidoMousePressed
        setOpacity((float) 0.8);

        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_ContenidoMousePressed

    private void ContenidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenidoMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_ContenidoMouseReleased

    private void ContenidoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenidoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);    }//GEN-LAST:event_ContenidoMouseDragged

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
      
           String campo = TXTMatricula.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE Matricula = '" + campo + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            TableCalificaciones.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();

            String sql = "SELECT Matricula AS MATRICULA, Nombres AS NOMBRE, Apellidos AS APELLIDO,Nombre_materia AS MATERIA ,promedio_materia AS CALIFICACION\n" +
                         "FROM DatosAlumnos inner join promedioAlumnos on promedioAlumnos.id=DatosAlumnos.id  " + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre de la materia");
            modelo.addColumn("Promedio");
       
            
            int[] anchos = {50,60, 80, 80,50};
            for (int i = 0; i < TableCalificaciones.getColumnCount(); i++) {
                TableCalificaciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_BTNBuscarActionPerformed
//FIN EVENTOS MOVER CONTENIDOD

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel Contenido;
    private javax.swing.JTextField TXTMatricula;
    private javax.swing.JTable TableCalificaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
