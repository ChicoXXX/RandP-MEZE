
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registros extends javax.swing.JFrame {

    //Conexión a la DB
    public static final String URL = "jdbc:mysql://localhost:3306/Clientes";
    public static final String USR = "root";
    public static final String PASS = "";
    PreparedStatement st;
    ResultSet res;
    public static Connection getConection() {

        Connection oCon = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            oCon = (Connection) DriverManager.getConnection(URL, USR, PASS);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return oCon;
    }
      //Fin Conexión DB 

    public Registros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        btnRegistroP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        btnRegistrarE = new javax.swing.JButton();
        txtBuscar = new javax.swing.JButton();
        txtBuscar1 = new javax.swing.JButton();
        ModDatos = new javax.swing.JButton();
        ModE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Calle");

        jLabel4.setText("Número");

        jLabel5.setText("Colonia");

        btnRegistroP.setText("Registrar");
        btnRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPActionPerformed(evt);
            }
        });

        jLabel6.setText("Registro Datos Generales");

        jLabel7.setText("Registro Empresa");

        jLabel8.setText("Nombre");

        jLabel9.setText("Dirección");

        jLabel10.setText("RFC");

        jLabel11.setText("Teléfono");

        btnRegistrarE.setText("Registrar");
        btnRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEActionPerformed(evt);
            }
        });

        txtBuscar.setText("Buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        txtBuscar1.setText("Buscar");
        txtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar1ActionPerformed(evt);
            }
        });

        ModDatos.setText("Modificar");
        ModDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModDatosActionPerformed(evt);
            }
        });

        ModE.setText("Modificar");
        ModE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtCalle)
                                    .addComponent(txtNum)
                                    .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistroP)
                                .addGap(17, 17, 17)
                                .addComponent(ModDatos)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtRFC)))
                    .addComponent(jLabel11)
                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarE)
                        .addGap(13, 13, 13)
                        .addComponent(ModE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar1)))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroP)
                    .addComponent(btnRegistrarE)
                    .addComponent(txtBuscar)
                    .addComponent(txtBuscar1)
                    .addComponent(ModDatos)
                    .addComponent(ModE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Datos generales
    private void btnRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPActionPerformed
        Connection conn = null;
        try {
        
            conn = getConection();
           st = conn.prepareStatement("INSERT INTO Datos_Generales (Nombres, Apellidos, Calle, Numero, Colonia)VALUES(?,?,?,?,?)"); //? para evitar un sqlinection
           st.setString(1, txtNombre.getText());//Datos que vamos a insertar
           st.setString(2, txtApellido.getText());
           st.setString(3, txtCalle.getText());
           st.setString(4, txtNum.getText());
           st.setString(5, txtColonia.getText());
           
           //Para ejecutar la consulta
           
           st.executeUpdate();
           
           //Se iguala a int para saber si se ejecutó o no
           int rs = st.executeUpdate();
           if(rs>0){
           
               JOptionPane.showMessageDialog(null, "Datos Guradados");
           
           }else{
               JOptionPane.showMessageDialog(null,"Error al Guardar" );
           }
           conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_btnRegistroPActionPerformed

    //Empresa
    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        Connection conn = null;
        try {
        
            conn = getConection();
           st = conn.prepareStatement("INSERT INTO Empresa (Nombre, Direccion, RFC, Telefono)VALUES(?,?,?,?)"); //? para evitar un sqlinection
           st.setString(1, txtNomE.getText());//Datos que vamos a insertar
           st.setString(2, txtDireccion.getText());
           st.setString(3, txtRFC.getText());
           st.setString(4, txtTele.getText());
          ;
           
           //Para ejecutar la consulta
           
           st.executeUpdate();
           
           //Se iguala a int para saber si se ejecutó o no
           int res = st.executeUpdate();
           if(res>0){
           
               JOptionPane.showMessageDialog(null, "Datos Guradados");
           
           }else{
               JOptionPane.showMessageDialog(null,"Error al Guardar" );
           }
           conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnRegistrarEActionPerformed
//Buscar Datos 
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
      
        Connection conn = null;
        
        try{
        
            conn = getConection();
            st=conn.prepareStatement("SELECT * FROM Datos_Generales WHERE Nombres = ?");
            st.setString(1, txtNombre.getText());
                    
            res = st.executeQuery();//traerá los datos de la consulta
                
                 if(res.next()){
                 
                     txtNombre.setText(res.getString("Nombres"));
                     txtApellido.setText(res.getString("Apellidos"));
                     txtCalle.setText(res.getString("Calle"));
                     txtNum.setText(res.getString("Numero"));
                     txtColonia.setText(res.getString("Colonia"));
                 }else{
                 
                     JOptionPane.showMessageDialog(null, "No existe el regostro");
                 }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_txtBuscarActionPerformed
//Buscar Empresa
    private void txtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar1ActionPerformed
          Connection conn = null;
        
        try{
        
            conn = getConection();
            st=conn.prepareStatement("SELECT * FROM Empresa WHERE Nombre = ?");
            st.setString(1, txtNomE.getText());
                    
            res = st.executeQuery();//traerá los datos de la consulta
                
                 if(res.next()){
                 
                     txtNomE.setText(res.getString("Nombre"));
                     txtDireccion.setText(res.getString("Direccion"));
                     txtRFC.setText(res.getString("RFC"));
                     txtTele.setText(res.getString("Telefono"));
                     
                 }else{
                 
                     JOptionPane.showMessageDialog(null, "No existe la Empresa");
                 }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_txtBuscar1ActionPerformed

    //Modificar Datos
    private void ModDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModDatosActionPerformed
        
        Connection conn = null;
        try {
        
            conn = getConection();
           st = conn.prepareStatement("UPDATE Datos_Generales SET Nombres=?, Apellidos=?, Calle=?, Numero=?, Colonia=? WHERE Nombres=?"); //? para evitar un sqlinection
           st.setString(1, txtNombre.getText());//Datos que vamos a insertar
           st.setString(2, txtApellido.getText());
           st.setString(3, txtCalle.getText());
           st.setString(4, txtNum.getText());
           st.setString(5, txtColonia.getText());
           
           //Para ejecutar la consulta
           
           st.executeUpdate();
           
           //Se iguala a int para saber si se ejecutó o no
           int rs = st.executeUpdate();
           if(rs>0){
           
               JOptionPane.showMessageDialog(null, "Datos Guradados");
           
           }else{
               JOptionPane.showMessageDialog(null,"Error al Guardar" );
           }
           conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ModDatosActionPerformed
//Modificar Empres
    private void ModEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModEActionPerformed
        Connection conn = null;
        try {
        
            conn = getConection();
           st = conn.prepareStatement("UPDATE INTO Empresa SET Nombre=?, Direccion=?, RFC=?, Telefono=? WHERE Nombre=?"); //? para evitar un sqlinection
           st.setString(1, txtNomE.getText());//Datos que vamos a insertar
           st.setString(2, txtDireccion.getText());
           st.setString(3, txtRFC.getText());
           st.setString(4, txtTele.getText());
          ;
           
           //Para ejecutar la consulta
           
           st.executeUpdate();
           
           //Se iguala a int para saber si se ejecutó o no
           int res = st.executeUpdate();
           if(res>0){
           
               JOptionPane.showMessageDialog(null, "Datos Guradados");
           
           }else{
               JOptionPane.showMessageDialog(null,"Error al Guardar" );
           }
           conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ModEActionPerformed

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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModDatos;
    private javax.swing.JButton ModE;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JButton btnRegistroP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JButton txtBuscar1;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNomE;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
