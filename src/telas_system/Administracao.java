package telas_system;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas_livro.Cadastro_Livro;
import telas_livro.Principal;

/**
 *
 * @author maria
 */
public class Administracao extends javax.swing.JFrame {
    Principal principal;
    Usuarios usuarios;
    Tela_Categoria categoria;
    Cadastro_Livro livro;
    Tela_Editora editora;
    /**
     * Creates new form Administracao
     */
    public Administracao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//Para abrir a tela inteira automáticamente
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel4 = new javax.swing.JPanel();
        lbLivros = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbHistorico = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel4.setBackground(new java.awt.Color(0, 0, 0));

        lbLivros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbLivros.setForeground(new java.awt.Color(255, 255, 255));
        lbLivros.setText("LIVRO");
        lbLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLivrosMouseClicked(evt);
            }
        });

        lbCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lbCategoria.setText("CATEGORIA");
        lbCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCategoriaMouseEntered(evt);
            }
        });

        lbHistorico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbHistorico.setForeground(new java.awt.Color(255, 255, 255));
        lbHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEditora.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbEditora.setForeground(new java.awt.Color(255, 255, 255));
        lbEditora.setText("EDITORA");
        lbEditora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditoraMouseClicked(evt);
            }
        });

        lbUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("USUÁRIO");
        lbUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuarioMouseClicked(evt);
            }
        });

        lbHome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("HOME");
        lbHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel4Layout = new javax.swing.GroupLayout(painel4);
        painel4.setLayout(painel4Layout);
        painel4Layout.setHorizontalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbLivros)
                .addGap(129, 129, 129)
                .addComponent(lbCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(lbEditora)
                .addGap(98, 98, 98)
                .addComponent(lbHistorico)
                .addGap(27, 27, 27)
                .addComponent(lbUsuario)
                .addGap(511, 511, 511)
                .addComponent(lbHome)
                .addGap(81, 81, 81))
        );
        painel4Layout.setVerticalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLivros)
                        .addComponent(lbCategoria)
                        .addComponent(jLabel13)
                        .addComponent(lbHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(painel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1360, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LIVRA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 130, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLivrosMouseClicked

       // Ao clicar em livros:
        
        try {
            livro = new Cadastro_Livro();
            livro.setVisible(true);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_lbLivrosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // Ao fechar a tela:
            principal = new Principal();
            principal.setVisible(true);
            dispose();
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        // Ao clicar em home:
  
        try {  
            principal = new Principal();
            principal.setVisible(true);
            dispose();
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_lbHomeMouseClicked

    private void lbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCategoriaMouseClicked
        //Ao clicar em categoria:
        
        try {
            categoria = new Tela_Categoria();
            categoria.setVisible(true);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lbCategoriaMouseClicked

    private void lbEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditoraMouseClicked
        //Ao clicar em Editora:
        
        try {
            editora = new Tela_Editora();
            editora.setVisible(true);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lbEditoraMouseClicked

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
        // Ao clicar em Usuario:
       
        try {
            usuarios = new Usuarios();
            usuarios.setVisible(true);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Administracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Conectar ao banco:
    }//GEN-LAST:event_formWindowOpened

    private void lbCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbCategoriaMouseEntered

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
            java.util.logging.Logger.getLogger(Administracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Administracao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbHistorico;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLivros;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painel4;
    // End of variables declaration//GEN-END:variables
}
