/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author s.lucas
 */
public class FRUPDUsuario extends javax.swing.JDialog {
    private int codigo;
    private String senhaUsuario;
    
    public String getSenhaUsuario(){
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public void setPkUsuario(int codigo) {
        this.codigo = codigo;
    }
    
    public FRUPDUsuario(java.awt.Frame parent, boolean modal) {
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
        txtNomeDono = new javax.swing.JTextField();
        txtNomePet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ckbAtivo = new javax.swing.JCheckBox();
        txtDataNasc = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnAlterarImagem = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Caladea", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Cadastro do Pet");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Nome do Dono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtNomeDono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtNomeDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeDonoKeyPressed(evt);
            }
        });
        jPanel1.add(txtNomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 402, -1));

        txtNomePet.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtNomePet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomePetKeyPressed(evt);
            }
        });
        jPanel1.add(txtNomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 402, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("Nome do Pet ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setText("Data de Nascimento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, -1));

        ckbAtivo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ckbAtivo.setText("Ativo");
        ckbAtivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ckbAtivoKeyPressed(evt);
            }
        });
        jPanel1.add(ckbAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataNasc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataNascKeyPressed(evt);
            }
        });
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 270, -1));

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        btnAlterar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
        });
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnAlterarKeyReleased(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 143, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lápis.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnDeletar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lixo_1.png"))); // NOI18N
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 50, 40));

        lbCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbCodigo.setText("Código: ");
        jPanel1.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 190, -1));

        txtTelefone.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 402, -1));

        btnAlterarImagem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAlterarImagem.setText("Alterar Imagem");
        btnAlterarImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarImagemMouseClicked(evt);
            }
        });
        btnAlterarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarImagemActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDonoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtNomePet.requestFocus();
        }
    }//GEN-LAST:event_txtNomeDonoKeyPressed

    private void txtNomePetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePetKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        }
    }//GEN-LAST:event_txtNomePetKeyPressed

    private void ckbAtivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ckbAtivoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnAlterar.requestFocus();
        }
    }//GEN-LAST:event_ckbAtivoKeyPressed

    private void txtDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNascKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ckbAtivo.requestFocus();
        }
    }//GEN-LAST:event_txtDataNascKeyPressed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked

        if(verificaCampos() == false){
            return;
        }

        //Salvar no banco de dados
        Usuario usu = new Usuario();
        usu.setPkUsuario(codigo);
        usu.setNomeDono(txtNomeDono.getText());
        usu.setTelefone(txtTelefone.getText());
        usu.setNomePet(txtNomePet.getText());
        usu.setAtivo(ckbAtivo.isSelected());
        
        Date data = Utils.converterStringToDate(
            txtDataNasc.getText());
        usu.setDataNasc(data);
        

        UsuarioController controller = new UsuarioController();
        if(controller.AlterarUsuario(usu)){
            this.dispose();
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnAlterarMouseClicked(null);
        }
    }//GEN-LAST:event_btnAlterarKeyPressed

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null,
                "Deseja excluir o usuário?" , 
                "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            UsuarioController controller = new UsuarioController();
            if(controller.excluirUsuario(codigo)){
                this.dispose();
            }
        }
        
    
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void btnAlterarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarImagemActionPerformed

    private void btnAlterarImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarImagemMouseClicked
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha um arquivo");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
            "Imagens", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filtro);

        // Configuração para permitir a seleção de apenas um arquivo
        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            Icon icon = Utils.fileParaIcon(arquivo);

            ImageIcon iconRedimensionado = Utils.redimensionarIcon(
                icon, 100, 100);

            lblFoto.setIcon(iconRedimensionado);
        }
    }//GEN-LAST:event_btnAlterarImagemMouseClicked

    private void btnAlterarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarKeyReleased

     private boolean verificaCampos(){
        if(txtNomeDono.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo 'NomeDono' em branco");
            return false;
        }
        
        if(!txtNomeDono.getText().matches("^[\\p{L} ]+$")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'NomeDono' possui caracteres inválidos");
            return false;
        }
        
        if(txtNomePet.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'NomePet' em branco");
            return false;
        }
        if(!txtTelefone.getText().matches(
                "^[0-9]{11}$")){
            JOptionPane.showMessageDialog(null,
                    "Campo 'Telefone' possui formato inválido");
            return false;
        }
        
        if(!txtDataNasc.getText().matches(
                "^[0-9]{2}/[0-9]{2}/[0-9]{4}$")){
            JOptionPane.showMessageDialog(null,
             "Campo 'Data Nascimento' possui formato inválido."
                +" Ex: 01/01/2000");
            return false;
        }
        
        
        return true;
    }
    
    public void carregarUsuario(){
        UsuarioController controller = new UsuarioController();
        Usuario usu = controller.readForPk(codigo);
        
        String codigo = String.valueOf(usu.getPkUsuario());
        
        txtCodigo.setText(codigo);
        txtNomeDono.setText(usu.getNomeDono());
        txtTelefone.setText(usu.getTelefone());
        txtNomePet.setText(usu.getNomePet());
        txtDataNasc.setText(Utils.converterDateToString(usu.getDataNasc()));
        ckbAtivo.setSelected(usu.isAtivo());
        lblFoto.setIcon(usu.getImagem());
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
            java.util.logging.Logger.getLogger(FRUPDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRUPDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRUPDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRUPDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRUPDUsuario dialog = new FRUPDUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarImagem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JCheckBox ckbAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtNomeDono;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
