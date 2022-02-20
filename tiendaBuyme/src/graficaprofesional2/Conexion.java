package graficaprofesional2;



import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Conexion extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/buyme" ;
  
    public static final String USERNAME = "rubioAdminStore";
     
    public static final String PASSWORD = "sI9Y5xTfSWm065WO";
    public static int ID;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Conexion(int id) {
        this.ID = id;
        initComponents();
    }

   

    public void limpiarCampos(){
        
        NombreProducto.setText(null);
        MarcaProducto.setText(null);
        DesProducto.setText(null);
        RefProducto.setText(null);
        PrecioProducto.setText(null);
        ExisProd.setText(null);
        GaranProducto.setText(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ExisProducto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AGREGAR = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        NombreProducto = new javax.swing.JTextField();
        MarcaProducto = new javax.swing.JTextField();
        RefProducto = new javax.swing.JTextField();
        GaranProducto = new javax.swing.JTextField();
        DesProducto = new javax.swing.JTextField();
        PrecioProducto = new javax.swing.JTextField();
        ExisProd = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        computadores = new javax.swing.JRadioButton();
        tablets = new javax.swing.JRadioButton();
        celulares = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        escritorio.setBackground(new java.awt.Color(255, 122, 0));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     ID PRODUCTO:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE PRODUCTO:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MARCA PRODUCTO:");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REF PRODUCTO:");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCRIPCION  PRODUCTO:");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRECIO  PRODUCTO:");

        ExisProducto.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        ExisProducto.setForeground(new java.awt.Color(255, 255, 255));
        ExisProducto.setText("EXISTENCIA  PRODUCTO:");

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GARANTIA  PRODUCTO:");

        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        NombreProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProductoActionPerformed(evt);
            }
        });

        MarcaProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MarcaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaProductoActionPerformed(evt);
            }
        });

        RefProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RefProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefProductoActionPerformed(evt);
            }
        });

        GaranProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GaranProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaranProductoActionPerformed(evt);
            }
        });

        DesProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DesProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesProductoActionPerformed(evt);
            }
        });

        PrecioProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioProductoActionPerformed(evt);
            }
        });

        ExisProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExisProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExisProdActionPerformed(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        computadores.setBackground(new java.awt.Color(255, 122, 0));
        buttonGroup1.add(computadores);
        computadores.setText("Computadores");

        tablets.setBackground(new java.awt.Color(255, 122, 0));
        buttonGroup1.add(tablets);
        tablets.setText("Tablets");

        celulares.setBackground(new java.awt.Color(255, 122, 0));
        buttonGroup1.add(celulares);
        celulares.setText("Celulares");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(ExisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(RefProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ExisProd, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(GaranProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(computadores)
                                    .addComponent(celulares)
                                    .addComponent(tablets))
                                .addGap(35, 35, 35)))
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(ACTUALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AGREGAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ELIMINAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(computadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celulares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RefProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExisProd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GaranProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void NombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProductoActionPerformed

    private void RefProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefProductoActionPerformed

    private void MarcaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaProductoActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
      Connection con = null;
      
      try{
          
       
          con =  getConection();
          ps =con.prepareStatement("INSERT into productos (Nombre_Producto,Marca_Producto,Ref_Producto,Descripcion_Producto,Precio_Producto,Existencia_Producto,Imagen_Producto,Garantia_Producto,Id_Categoria,Id_Proveedor) VALUES (?,?,?,?,?,?,?,?,?,? )");

          int categoria;
          
         
          if(computadores.isSelected()){
              categoria = 6;
          }else if(celulares.isSelected()){
               categoria = 8;
          }else{
               categoria = 7;
          }
              
          if(!NombreProducto.getText().isEmpty() 
                  && !MarcaProducto.getText().isEmpty() 
                  && !RefProducto.getText().isEmpty()
                  && !DesProducto.getText().isEmpty()
                  && !PrecioProducto.getText().isEmpty()
                  && !ExisProd.getText().isEmpty()
                  && !GaranProducto.getText().isEmpty()){
              
             
          ps.setString(1, NombreProducto.getText());
          ps.setString(2, MarcaProducto.getText());
          ps.setString(3, RefProducto.getText());
          ps.setString(4, DesProducto.getText());
          ps.setDouble(5, Double.parseDouble(PrecioProducto.getText()));
          ps.setInt(6, Integer.parseInt(ExisProd.getText()));
          ps.setString(7," ");
          ps.setString(8, GaranProducto.getText());
          ps.setInt(9, categoria);   
          ps.setInt(10,this.ID);
           System.out.println("llega");
          int verificacion = ps.executeUpdate();
          
          if (verificacion > 0){
              JOptionPane.showMessageDialog(null, "Producto Agregado o Registrado");
                      
          } else {
              
                 JOptionPane.showMessageDialog(null, "Error , Producto No Registrado");
              
          }
              
          }else{
               JOptionPane.showMessageDialog(null, "Error , Complete todos los campos");
          }
         
      
          
          con.close();
          limpiarCampos();
          
      }        
        
      catch (Exception e){
          System.out.println(e);
          
      }
      /**  int categoria;
          
          if(computadores.isSelected()){
              categoria = 6;
          }else if(celulares.isSelected()){
               categoria = 8;
          }else{
               categoria = 7;
          }
              
          if(!NombreProducto.getText().isEmpty() 
                  && !MarcaProducto.getText().isEmpty() 
                  && !RefProducto.getText().isEmpty()
                  && !DesProducto.getText().isEmpty()
                  && !PrecioProducto.getText().isEmpty()
                  && !ExisProd.getText().isEmpty()
                  && !GaranProducto.getText().isEmpty()){
              
              DaoConnection dao = new DaoConnection("insert.php?case=productos&nombre="+NombreProducto.getText()
              +"&marca="+MarcaProducto.getText()
              +"&referencia="+RefProducto.getText()
              +"&descripcion="+DesProducto.getText()
              +"&precio="+PrecioProducto.getText()
              +"&existencia="+ExisProd.getText()
              +"&garantia="+GaranProducto.getText()
              +"&categoria="+categoria
              +"&id_proveedor="+16);
              
                Map<String, Object> params = new LinkedHashMap<>();
                params.put("imagen", "");
              
          try {
               dao.setGet(params);
              Reader in = dao.getResponseGet();
              System.out.println(in);
              
          } catch (IOException ex) {
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
          }
          }*/
      
    }//GEN-LAST:event_AGREGARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
       
         Connection con = null;
      
      try{
          
          con =  getConection();
          ps =con.prepareStatement("UPDATE productos SET Nombre_Producto = ?, Marca_Producto = ?, Ref_Producto = ?,Descripcion_Producto=?,Precio_Producto=?,Existencia_Producto=?,Imagen_Producto=?,Garantia_Producto=? WHERE  id_Producto = ?");
          
          ps.setString(1, NombreProducto.getText());
          ps.setString(2, MarcaProducto.getText());
          ps.setString(3, RefProducto.getText());
          ps.setString(4, DesProducto.getText());
          ps.setDouble(5,Double.parseDouble(PrecioProducto.getText()));
          ps.setInt(6, Integer.parseInt(ExisProd.getText()));
          ps.setString(7, " ");
          ps.setString(8, GaranProducto.getText());
          ps.setInt(9, Integer.parseInt(id.getText()));
          
          int verificacion = ps.executeUpdate();
          
          if (verificacion > 0){
              JOptionPane.showMessageDialog(null, "Producto Actualizado");
                      
          }
          
          else {
              
                 JOptionPane.showMessageDialog(null, "Error , Producto No Actualizado");
              
          }
          
          con.close();
          limpiarCampos();
          
      }        
        
      catch (Exception e){
          System.out.println(e);
          
      }
        
        
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        
          Connection con = null;
      
      try{
          
          con =  getConection();
          ps =con.prepareStatement("SELECT * FROM productos WHERE  id_Producto = ? " );
          
          ps.setInt(1, Integer.parseInt(id.getText()));
             
          rs = ps.executeQuery();
          
          
          if (rs.next( ) ) {
              NombreProducto.setText(rs.getString("Nombre_Producto"));
              MarcaProducto.setText(rs.getString("Marca_Producto"));
              RefProducto.setText(rs.getString("Ref_Producto"));
              DesProducto.setText(rs.getString("Descripcion_Producto"));
              PrecioProducto.setText(rs.getString("Precio_Producto"));
              ExisProd.setText(rs.getString("Existencia_Producto"));
              GaranProducto.setText(rs.getString("Garantia_Producto"));
          }
          
          else {
              
              JOptionPane.showMessageDialog(null,"No hay un Producto asociado  a tal Id");
              
          }
          con.close();
            
      }        
        
      catch (Exception e){
          System.out.println(e);
          
      }
        
               
    }//GEN-LAST:event_BUSCARActionPerformed

    private void GaranProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaranProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GaranProductoActionPerformed

    private void DesProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesProductoActionPerformed

    private void PrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioProductoActionPerformed

    private void ExisProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExisProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExisProdActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        Connection con = null;

        try{

            con =  getConection();
            ps =con.prepareStatement("DELETE FROM productos  WHERE  id_Producto = ?");

            ps.setInt(1, Integer.parseInt(id.getText()));

            int verificacion = ps.executeUpdate();

            if (verificacion > 0){
                JOptionPane.showMessageDialog(null, "Producto Eliminado");

            }

            else {

                JOptionPane.showMessageDialog(null, "Error , Producto No Eliminado");

            }

            con.close();
            limpiarCampos();

        }

        catch (Exception e){
            System.out.println(e);

        }

    }//GEN-LAST:event_ELIMINARActionPerformed

 public static Connection getConection(){
     
     Connection con = null;
     
      try{
         
         Class.forName("com.mysql.jdbc.Driver");
         con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
         
     }
     
     catch(Exception e){
         System.out.println(e);
         
     }
     
      return con;
      
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
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conexion(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField DesProducto;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField ExisProd;
    private javax.swing.JLabel ExisProducto;
    private javax.swing.JTextField GaranProducto;
    private javax.swing.JTextField MarcaProducto;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JTextField PrecioProducto;
    private javax.swing.JTextField RefProducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celulares;
    private javax.swing.JRadioButton computadores;
    private javax.swing.JPanel escritorio;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton tablets;
    // End of variables declaration//GEN-END:variables
}
