package Comercial.vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Comercial.datos.CobradorDao;
import Comercial.dominio.Cobrador;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;
import seguridad.vista.Aplicacion_Perfil;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;
import seguridad.vista.MDI_Components;

/**
 *
 * @author PERSONAL
 */
public class Mantenimiento_Cobrador extends javax.swing.JInternalFrame {

    int codigoAplicacion = 3001;

//    void habilitarAcciones() {
//
//        int codigoAplicacion = 3001;
//        var usuario = Login.usuarioComercial;
//
//        btnAgregar.setEnabled(false);
//        btnModificar.setEnabled(false);
//        btnEliminar.setEnabled(false);
//        btnBuscar.setEnabled(false);
//
//        GenerarPermisos permisos = new GenerarPermisos();
//
//        String[] permisosApp = new String[4];
//
//        for (int i = 0; i < 4; i++) {
//            permisosApp[i] = permisos.getAccionesAplicacion(codigoAplicacion, usuario)[i];
//        }
//
//        if (permisosApp[0].equals("1")) {
//            btnAgregar.setEnabled(true);
//        }
//        if (permisosApp[1].equals("1")) {
//            btnBuscar.setEnabled(true);
//        }
//        if (permisosApp[2].equals("1")) {
//            btnModificar.setEnabled(true);
//        }
//        if (permisosApp[3].equals("1")) {
//            btnEliminar.setEnabled(true);
//        }
//    }

    public void llenadoDeTablas() {
        /**
         *
         * creaccion de la tabla de de titulos
         */
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codico Cobrador");
        modelo.addColumn("Nombre Cobrador");
   

        modelo.addColumn("Estatus Cobrador");
      

        CobradorDao ventasDAO = new CobradorDao();

        List<Cobrador> ventas = ventasDAO.select();
        JtProductos1.setModel(modelo);
        String[] dato = new String[8];
        for (int i = 0; i < ventas.size(); i++) {
            dato[0] = (ventas.get(i).getCodigo_Cobrador());
            dato[1] = ventas.get(i).getNombre_Cobrador();
            
            dato[2] = (ventas.get(i).getEstatus_Cobrador());
         

            System.out.println("vendedor:" + ventas);
            modelo.addRow(dato);
        }
    }

    public void buscarVendedor() {

      CobradorDao Clientes = new CobradorDao();

        Cobrador Buscar = new Cobrador() ;
        Buscar.setCodigo_Cobrador(Txt_codigo.getText());
        Buscar = Clientes.query(Buscar);
        Txt_nombre.setText(Buscar.getNombre_Cobrador());
      
        Txt_estatus.setText(Buscar.getEstatus_Cobrador());
       
   

    }

    public void limpiar() {
        Txt_codigo.setText("");
        Txt_nombre.setText("");
     
        Txt_estatus.setText("");
       
        
    
    }

    /**
     * Creates new form Mantenimiento_Cliente
     */
    public Mantenimiento_Cobrador() {
        int codigoAplicacion = 3001;
        initComponents();
//        habilitarAcciones();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Btn_Modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Btn_Agregar = new javax.swing.JButton();
        Txt_codigo = new javax.swing.JTextField();
        Txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtProductos1 = new javax.swing.JTable();
        Txt_estatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Btn_reporte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimieto Cliente\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Modificar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 210, 90, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento Cobrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 11, -1, -1));

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 210, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Codigo Cobrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 81, -1, -1));

        Btn_Buscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 78, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nombre Cobrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 113, -1, -1));

        Btn_Agregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_Agregar.setText("Guardar");
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 210, 90, 30));

        Txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 78, 193, -1));
        getContentPane().add(Txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 110, 193, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Estatus Cobrador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 150, -1, -1));

        JtProductos1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JtProductos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JtProductos1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 536, 138));

        Txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_estatusActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 148, 193, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Ayuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 14, 100, 30));

        Btn_reporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Btn_reporte.setText("Reporte");
        Btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_reporteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 136, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 460, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed

        CobradorDao dao = new CobradorDao();

        Cobrador modi = new Cobrador();
        
         modi.setCodigo_Cobrador(Txt_codigo.getText());
         modi.setNombre_Cobrador(Txt_nombre.getText());
     
            
         modi.setEstatus_Cobrador(Txt_estatus.getText());
         
        dao.update(modi);
        llenadoDeTablas();
        limpiar();
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();

        Insertar.setAccion("Modificar");
        Insertar.setId_Usuario(Login.usuarioComercial);
        GenerarPermisos permisos = new GenerarPermisos();
        MDI_Components mdi_Components = new MDI_Components();
        Insertar.setCodigoAplicacion("3003");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
//
         CobradorDao acreedor = new  CobradorDao();

         Cobrador vendedorAEliminar = new  Cobrador();
            vendedorAEliminar.setCodigo_Cobrador(Txt_codigo.getText());
         vendedorAEliminar.setNombre_Cobrador(Txt_nombre.getText());
       
           
         vendedorAEliminar.setEstatus_Cobrador(Txt_estatus.getText());
      
      
        acreedor.delete(vendedorAEliminar);
        llenadoDeTablas();
        limpiar();
        JOptionPane.showMessageDialog(null, "Cliente Eliminado.");
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();

        Insertar.setAccion("Eliminar");
        GenerarPermisos permisos = new GenerarPermisos();
        MDI_Components mdi_Components = new MDI_Components();
        Insertar.setCodigoAplicacion("3003");
        Insertar.setModulo("3000");
        Insertar.setId_Usuario(Login.usuarioComercial);
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        buscarVendedor() ;
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();

        Insertar.setAccion("Buscar");
        GenerarPermisos permisos = new GenerarPermisos();
        MDI_Components mdi_Components = new MDI_Components();
        Insertar.setCodigoAplicacion("3003");
        Insertar.setModulo("3000");
        Insertar.setId_Usuario(Login.usuarioComercial);
        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
 
//        buscarVendedor();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed

////        GenerarPermisos permisos = new GenerarPermisos();
////        MDI_Components mdi_Components = new MDI_Components();
////
////        String id = "0";
         CobradorDao ClienteDAO = new  CobradorDao();

         Cobrador AInsertar = new  Cobrador();
        AInsertar.setCodigo_Cobrador(Txt_codigo.getText());
        AInsertar.setNombre_Cobrador(Txt_nombre.getText());
        AInsertar.setEstatus_Cobrador(Txt_estatus.getText());
      
        ClienteDAO.insert(AInsertar);

        llenadoDeTablas();
        limpiar();
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Insertar");

        Insertar.setCodigoAplicacion("3003");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
   JOptionPane.showMessageDialog(null, " La ejecunsion a  sido un exito");
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\cobrador.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\cobrador.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_estatusActionPerformed
private Connection connection = null;
    private void Btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_reporteActionPerformed
//  Map p = new HashMap();
//        JasperReport report;
//        JasperPrint print;
//
//        try {
//            connection = Conexion.getConnection();
//            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
//                    + "/src/main/java/Comercial/reportes/MantenimientoCliente.jrxml");
//            print = JasperFillManager.fillReport(report, p, connection);
//            JasperViewer view = new JasperViewer(print, false);
//            view.setTitle("cliente ");
//            view.setVisible(true);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_reporteActionPerformed

    private void Txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_codigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_reporte;
    private javax.swing.JTable JtProductos1;
    private javax.swing.JTextField Txt_codigo;
    private javax.swing.JTextField Txt_estatus;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
