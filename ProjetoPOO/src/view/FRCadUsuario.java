/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.event.KeyEvent;
import java.io.File;
import utils.Utils;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Usuario;

/**
 *
 * @author aluno.saolucas
 */
public class FRCadUsuario extends javax.swing.JDialog {

    /**
     * Creates new form FRCadUsuario
     */
    public FRCadUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ckbAtivo = new javax.swing.JCheckBox();
        txtDataNasc = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnAlterarImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Pets");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        jLabel3.setText("Nome do Dono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        txtNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 358, -1));

        txtEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 358, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        jLabel4.setText("Telefone: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        jLabel5.setText("Nome do Pet:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        jLabel6.setText("Data de Nascimento do Pet:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        ckbAtivo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ckbAtivo.setText("Ativo");
        ckbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAtivoActionPerformed(evt);
            }
        });
        ckbAtivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ckbAtivoKeyPressed(evt);
            }
        });
        jPanel1.add(ckbAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataNasc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataNascKeyPressed(evt);
            }
        });
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 180, -1));

        btnCancelar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        txtSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 358, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gato.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cachorro.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mais.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblFoto.setText("jLabel2");
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, 100));

        btnAlterarImagem.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnAlterarImagem.setText("Escolher Imagem");
        btnAlterarImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarImagemMouseClicked(evt);
            }
        });
        jPanel1.add(btnAlterarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //Verificar campos
        if(verificaCampos() == false){
            return;
        }
        
        //Salvar no banco de dados
        Usuario usu = new Usuario();
        usu.setNome(txtNome.getText());
        usu.setEmail(txtEmail.getText());
        
        String senha = new String(txtSenha.getPassword());
        senha = Utils.calcularMD5(senha);
        usu.setSenha(senha);
        usu.setAtivo(ckbAtivo.isSelected());
        
        Date data = Utils.converterStringToDate(
                txtDataNasc.getText());
        usu.setDataNasc(data);
        
        UsuarioController controller = new UsuarioController();
        if(controller.adicionarUsuario(usu)){
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed

    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNascKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           ckbAtivo.requestFocus();
        }
    }//GEN-LAST:event_txtDataNascKeyPressed

    private void ckbAtivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ckbAtivoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btnSalvar.requestFocus();
        }
    }//GEN-LAST:event_ckbAtivoKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btnSalvarMouseClicked(null);
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void ckbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbAtivoActionPerformed

    private void btnAlterarImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarImagemMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha um arquivo");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filtro);
        
        fileChooser.setMultiSelectionEnabled(false);
        
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION){
            File arquivo = fileChooser.getSelectedFile();
            Icon icon = Utils.fileParaIcon(arquivo);
                    
            ImageIcon iconRedimensionado = Utils.redimensionarIcon(icon, 100, 100);
            lblFoto.setIcon(iconRedimensionado); 
;        }
    }//GEN-LAST:event_btnAlterarImagemMouseClicked

    private boolean verificaCampos(){
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo 'Nome' em branco");
            return false;
        }
        
        if(!txtNome.getText().matches("^[\\p{L} ]+$")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'Nome' possui caracteres inválidos");
            return false;
        }
        
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' em branco");
            return false;
        }
        if(!txtEmail.getText().matches(
                "^[a-zA-Z._]+@[a-zA-Z._]+.[a-zA-Z._]+$")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' possui formato inválido");
            return false;
        }
        
        if(!txtDataNasc.getText().matches(
                "^[0-9]{2}/[0-9]{2}/[0-9]{4}$")){
            JOptionPane.showMessageDialog(null,
             "Campo 'Data Nascimento' possui formato inválido."
                +" Ex: 01/01/2000");
            return false;
        }
        
        String senha = new String(txtSenha.getPassword());
        
        if(senha.length() < 8){
            JOptionPane.showMessageDialog(null,
                    "Campo 'Senha' deve ser maior que 8 caracteres");
            return false;
        }
        
        
        
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(FRCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRCadUsuario dialog = new FRCadUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterarImagem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckbAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
