/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficaprofesional2;


import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonParser;
import com.mysql.cj.xdevapi.JsonValue;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import jdk.internal.org.xml.sax.InputSource;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;
import org.w3c.dom.NodeList;
import sun.net.www.http.HttpClient;

        
/**
 *
 * @author Pc
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(800, 600));
     //   ctrl.iniciar();
        
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
        Button1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 122, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(0, 0, 102));
        Button1.setText("Salir");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 80, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contrase??a:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, 30));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 240, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 390, 130));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_Button1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            if(jTextUser.getText().isEmpty() || jPasswordField1.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Por favor ingrese la informacion en los campos", "Acesso no permitido",JOptionPane.ERROR_MESSAGE);
            
            } else {
                
             //Campos solicitados post
         Map<String, Object> params = new LinkedHashMap<>();
        params.put("searchEmail", jTextUser.getText());
         params.put("searchPass", jPasswordField1.getText());
         //Inicializo url en clase dao
        DaoConnection dao = new DaoConnection("search.php?case=login");
        
                try {
                    //Realizo peticion tipo post
                    dao.setPost(params);
                    //retorno respuesta
                    Reader in = dao.getResponsePost();
                    System.out.println("in response "+in);
                    //doy manejo a la respuesta
                       String data = "";
                        for (int c = in.read(); c != -1; c = in.read())
                            data += (char) c;


                         JsonParser parser = new JsonParser();
                            final String[] ready;
                            DbDoc jsonTree = parser.parseDoc(data);
                            jsonTree.values().forEach(( t) -> {

                               if(t.toFormattedString().split(":")[0].replace( "\"","").replace("{", "").contains("response")){
                                     JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrecta","Acceso No Permitido",JOptionPane.ERROR_MESSAGE);
                               }else{

                                   System.out.println(t.toFormattedString());

                                   String id = t.toFormattedString().split("\"id\" :")[1].split("\"rol\" :")[0].replace(",", "").replace("\"", "");
                                   String nombre =t.toFormattedString().split("\"Nombre\" :")[1].split("\"Telefono\" :")[0].replace(",", "").replace("\"", "")
                                           +" "+t.toFormattedString().split("\"Apellido\" :")[1].split("\"Ciudad\"")[0].replace(",", "").replace("\"", "").replace("{", "").replace(" ","");
                                   String rol = t.toFormattedString().split("\"rol\" : \"")[1].split("\"\n" +"}")[0];   
                                    
                                   char [] cadena_cr = id.toCharArray();
                                   String n = "";
                                   for(int i = 0;i< cadena_cr.length;i++){
                                       if(Character.isDigit(cadena_cr[i])){
                                           n+=cadena_cr[i];
                                       }
                                   }
                                   
                                   int idInt = Integer.parseInt(n);
                                   JOptionPane.showMessageDialog(null, "??Bienvenido "+ rol +" "+nombre +"\nAcesso Permitido!");
                                    Conexion Next = new Conexion(idInt);
                                    Next.setVisible(true);
                                    this.setVisible(false);
                               }
                            });
                            
                       dao.closeResponse();
                       dao.destroyConn();
                } catch (IOException ex) {
                    System.out.println("ERROR "+ex);
                }
                   
         
     
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

       
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}
