package Tela;

import Conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DesktopUsu extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DesktopUsu() {
        initComponents();
        conexao = ConexaoBanco.Conector();     
   }    

    public void Pesquisar() {
        String sql = "select * from tb_usuarios where id_usuario = ? ";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtIdUsu.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtNomeUsu.setText(rs.getString(2));
                txtEmailUsu.setText(rs.getString(3));
                txtLoginUsu.setText(rs.getString(4));
                txtSenhaUsu.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tela usuário" + e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BntExcluir = new javax.swing.JButton();
        BntEditar = new javax.swing.JButton();
        BntPesquisar = new javax.swing.JButton();
        BntAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JTextField();
        txtNomeUsu = new javax.swing.JTextField();
        txtEmailUsu = new javax.swing.JTextField();
        txtSenhaUsu = new javax.swing.JTextField();
        txtLoginUsu = new javax.swing.JTextField();

        BntExcluir.setText("Excluir");
        BntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntExcluirActionPerformed(evt);
            }
        });

        BntEditar.setText("Editar");
        BntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntEditarActionPerformed(evt);
            }
        });

        BntPesquisar.setText("Pesquisar");
        BntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntPesquisarActionPerformed(evt);
            }
        });

        BntAdd.setText("Adicionar");
        BntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Senha");

        jLabel5.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BntAdd)
                        .addGap(18, 18, 18)
                        .addComponent(BntPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(BntEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BntExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginUsu)
                            .addComponent(txtSenhaUsu)
                            .addComponent(txtEmailUsu)
                            .addComponent(txtIdUsu)
                            .addComponent(txtNomeUsu))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BntExcluir)
                    .addComponent(BntEditar)
                    .addComponent(BntPesquisar)
                    .addComponent(BntAdd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAddActionPerformed

    }//GEN-LAST:event_BntAddActionPerformed

    private void BntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntPesquisarActionPerformed
        Pesquisar();
    }//GEN-LAST:event_BntPesquisarActionPerformed

    private void BntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntEditarActionPerformed

    }//GEN-LAST:event_BntEditarActionPerformed

    private void BntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntExcluirActionPerformed

    }//GEN-LAST:event_BntExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntAdd;
    private javax.swing.JButton BntEditar;
    private javax.swing.JButton BntExcluir;
    private javax.swing.JButton BntPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmailUsu;
    private javax.swing.JTextField txtIdUsu;
    private javax.swing.JTextField txtLoginUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JTextField txtSenhaUsu;
    // End of variables declaration//GEN-END:variables
}
