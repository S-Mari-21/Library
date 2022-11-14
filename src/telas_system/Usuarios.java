package telas_system;

import classes_banco.Conexao_db;
import classes_basic.Gerenciar_Usuario;
import classes_basic.Usuario;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class Usuarios extends javax.swing.JFrame {
    Conexao_db conexao;
    Connection con;
    Gerenciar_Usuario user;
    
    String sql = "select *from usuario order by nome";
    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
    }
    public void PreencherTabela(String sql) throws SQLException{ 
       PreparedStatement stmt = con.prepareStatement(sql);
       ResultSet rs = stmt.executeQuery(); //Resultado do banco de dados
       
       //Gravando as informações da tabela no banco de dados
       DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
       modelo.setNumRows(0);
       
       while(rs.next()) {
          modelo.addRow(new Object[]
          {
              rs.getString("nome"),
              rs.getString("email"),
              rs.getString("eAdmin"),
              rs.getInt("id_usuario"),
              
          });
       
     } //Fim while
      rs.close();
      stmt.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNivel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbAdmin = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        painel2.setBackground(new java.awt.Color(0, 0, 0, 80));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Nível"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("USUÁRIOS");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nome:");

        tfNome.setBackground(new java.awt.Color(0, 0, 0));
        tfNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNome.setForeground(java.awt.Color.white);
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("E-mail:");

        tfEmail.setBackground(new java.awt.Color(0, 0, 0));
        tfEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfEmail.setForeground(java.awt.Color.white);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Nível:");

        tfNivel.setBackground(new java.awt.Color(0, 0, 0));
        tfNivel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNivel.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(tfNome))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 640, 450));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lbAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lbAdmin.setText("Tornar Administrador");
        lbAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAdminMouseClicked(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("Tornar Usuário");
        lbUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbAdmin)
                .addGap(31, 31, 31)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdmin)
                    .addComponent(lbUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/leitor.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        setSize(new java.awt.Dimension(709, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ao abrir a tela:
        conexao = new Conexao_db();

        try {
            con = (Connection) Conexao_db.Conectar();
            tfNome.setEnabled(false);
            tfEmail.setEnabled(false);
            tfNivel.setEnabled(false);
            
            PreencherTabela(sql);
            
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Ao fechar a tela:
        Conexao_db.Desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void tabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseEntered

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // Ao clicar na tabela (quando se clica na linha da tabela aparece os dados completos do uuário)
        int linha = tabela.getSelectedRow();
         
        tfNome.setText(tabela.getValueAt(linha,0).toString());
        tfEmail.setText(tabela.getValueAt(linha,1).toString());
        
        if (Integer.parseInt(tabela.getValueAt(linha,2).toString()) == 1){
          tfNivel.setText("Administrador");  
          
        } else {
          tfNivel.setText("Usuário");  

        }
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void lbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAdminMouseClicked
        // Ao clicar em tornar adminstrador:
        int linha = tabela.getSelectedRow();
        Integer id = Integer.parseInt(tabela.getValueAt(linha,3).toString());
        
        Usuario usuario = new Usuario();
        usuario.setAdmin(true);
        usuario.setId_usuario(id);
        
        user = new Gerenciar_Usuario();
        
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja tornar o usuário administrador?", "Alteração de nível", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        System.out.println("Opcao: " + opcao);
        
        if(opcao == 0){

            try {
                user.NivelUsuario(con,usuario);
                JOptionPane.showMessageDialog(null, "O nível do usuário foi alterado com sucesso!", "Nível Alterado!", 1);
                PreencherTabela(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_lbAdminMouseClicked

    private void lbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseClicked
        // Ao clicar em tornar usuario:
        int linha = tabela.getSelectedRow();
        Integer id = Integer.parseInt(tabela.getValueAt(linha,3).toString());
        
        Usuario usuario = new Usuario();
        usuario.setAdmin(false);
        usuario.setId_usuario(id);
        
        user = new Gerenciar_Usuario();
        
        Object[] options = { "Sim", "Não" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja tornar o usuário comum?", "Alteração de nível", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        System.out.println("Opcao: " + opcao);
        
        if(opcao == 0){

            try {
                user.NivelUsuario(con,usuario);
                JOptionPane.showMessageDialog(null, "O nível do usuário foi alterado com sucesso!", "Nível Alterado!", 1);
                PreencherTabela(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lbUserMouseClicked

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Usuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel painel2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNivel;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
