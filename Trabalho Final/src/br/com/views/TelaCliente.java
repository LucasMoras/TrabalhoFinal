package br.com.views;

import br.com.DAO.ClienteDAO;
import br.com.DAO.ConexaoDAO;
import br.com.DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TelaCliente extends javax.swing.JInternalFrame {

        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
    public TelaCliente() {
        initComponents();
         conexao = ConexaoDAO.conector();
        ClienteDAO ojbCliDAO = new ClienteDAO();
        ojbCliDAO.pesquisaAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuCreate = new javax.swing.JButton();
        btnUsuread = new javax.swing.JButton();
        btnUsuUpdate = new javax.swing.JButton();
        btnUsuDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        txtNomeCli = new javax.swing.JTextField();
        txtEnderecoCli = new javax.swing.JTextField();
        txtTelefoneCli = new javax.swing.JTextField();
        txtEmailCli = new javax.swing.JTextField();
        txtCPFcli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCNPJcli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);

        btnUsuCreate.setText("Criar");
        btnUsuCreate.setToolTipText("Adicionar");
        btnUsuCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuCreate.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCreateActionPerformed(evt);
            }
        });

        btnUsuread.setText("Pesquisar");
        btnUsuread.setToolTipText("Pesquisar");
        btnUsuread.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsureadActionPerformed(evt);
            }
        });

        btnUsuUpdate.setText("Editar");
        btnUsuUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuUpdateActionPerformed(evt);
            }
        });

        btnUsuDelete.setText("Excluir");
        btnUsuDelete.setToolTipText("Excluir");
        btnUsuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuDeleteActionPerformed(evt);
            }
        });

        TbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Endereço", "Telefone", "Email", "CPF", "CNPJ"
            }
        ));
        TbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TbClientes);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        txtIdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCliActionPerformed(evt);
            }
        });

        txtNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCliActionPerformed(evt);
            }
        });

        txtEnderecoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoCliActionPerformed(evt);
            }
        });

        txtTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneCliActionPerformed(evt);
            }
        });

        txtEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCliActionPerformed(evt);
            }
        });

        txtCPFcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFcliActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jLabel6.setText("CPF");

        txtCNPJcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJcliActionPerformed(evt);
            }
        });

        jLabel7.setText("CNPJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)))
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCPFcli, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEmailCli, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEnderecoCli)
                                            .addComponent(txtTelefoneCli)
                                            .addComponent(txtNomeCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(txtCNPJcli, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 191, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuread, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCPFcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCNPJcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnUsuread, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(btnUsuUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCreateActionPerformed

        int id_usuario = Integer.parseInt(txtIdCli.getText());
        String nome_cli = txtNomeCli.getText();
        String endereco_cli = txtEnderecoCli.getText();
        String telefone_cli = txtTelefoneCli.getText();
        String email_cli = txtTelefoneCli.getText();
        String cpf_cli = txtTelefoneCli.getText();
        String cnpj_cli = txtTelefoneCli.getText();

        ClientesDTO objCliDTO = new ClientesDTO();
        objCliDTO.setId_cliente(id_usuario);
        objCliDTO.setNome_cliente(nome_cli);
        objCliDTO.setEndereço_cliente(endereco_cli);
        objCliDTO.setTelefone_cliente(telefone_cli);
        objCliDTO.setEmail_cliente(email_cli);
        objCliDTO.setCpf_cliente(cpf_cli);
        objCliDTO.setCnpj_cliente(cnpj_cli);

        ClienteDAO objCliDAO = new ClienteDAO();
        objCliDAO.inserirCliente(objCliDTO);

    }//GEN-LAST:event_btnUsuCreateActionPerformed

    private void btnUsureadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsureadActionPerformed

        int id_cliente = Integer.parseInt(txtIdCli.getText());
        String nome_cliente = txtNomeCli.getText();
        String endereco_cliente = txtEnderecoCli.getText();
        String telefone_cliente = txtTelefoneCli.getText();
        String email_cliente = txtTelefoneCli.getText();
        String cpf_cliente = txtTelefoneCli.getText();
        String cnpj_cliente = txtTelefoneCli.getText();

        ClientesDTO objCliDTO = new  ClientesDTO();
         objCliDTO.setId_cliente(id_cliente);
         objCliDTO.setNome_cliente(nome_cliente);
         objCliDTO.setEndereço_cliente(endereco_cliente);
         objCliDTO.setTelefone_cliente(telefone_cliente);
         objCliDTO.setEmail_cliente(email_cliente);
         objCliDTO.setCpf_cliente(cpf_cliente);
         objCliDTO.setCnpj_cliente(cnpj_cliente);

        ClienteDAO objCliDAO = new ClienteDAO();
        objCliDAO.pesquisar(objCliDTO);

    }//GEN-LAST:event_btnUsureadActionPerformed

    private void btnUsuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuUpdateActionPerformed

        int id_cli = Integer.parseInt(txtIdCli.getText());
        String nome_cliente = txtNomeCli.getText();
        String endereco_cli = txtEnderecoCli.getText();
        String telefone_cli = txtTelefoneCli.getText();
        String email_cli = txtTelefoneCli.getText();
        String cpf_cli = txtTelefoneCli.getText();
        String cnpj_cli = txtTelefoneCli.getText();

        ClientesDTO objCliDTO = new ClientesDTO();
        objCliDTO.setId_cliente(id_cli);
        objCliDTO.setNome_cliente(nome_cliente);
        objCliDTO.setEndereço_cliente(endereco_cli);
        objCliDTO.setTelefone_cliente(telefone_cli);
        objCliDTO.setEmail_cliente(email_cli);
        objCliDTO.setCpf_cliente(cpf_cli);
        objCliDTO.setCnpj_cliente(cnpj_cli);
        
        ClienteDAO objCliDAO = new ClienteDAO ();
        objCliDAO.editar(objCliDTO);

    }//GEN-LAST:event_btnUsuUpdateActionPerformed

    private void btnUsuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuDeleteActionPerformed

        int id_usuario = Integer.parseInt(txtIdCli.getText());
         ClientesDTO objCliDTO = new ClientesDTO();
        objCliDTO.setId_cliente(id_usuario);

        ClienteDAO objUsuarioDAO = new ClienteDAO();
        objUsuarioDAO.deletar(objCliDTO);
        
    }//GEN-LAST:event_btnUsuDeleteActionPerformed

    private void TbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbClientesMouseClicked

            int linhaSel = TbClientes.getSelectedRow();
            if(linhaSel != -1 ){
            String id_cliente = TbClientes.getValueAt(linhaSel, 0).toString();
            String nome_cliente = TbClientes.getValueAt(linhaSel, 1).toString();
            String endereco_cliente = TbClientes.getValueAt(linhaSel, 2).toString();
            String telefone_cliente = TbClientes.getValueAt(linhaSel, 3).toString();
            String email_cliente = TbClientes.getValueAt(linhaSel, 4).toString();
            String cpf_cliente = TbClientes.getValueAt(linhaSel, 5).toString();
            String cnpj_cliente = TbClientes.getValueAt(linhaSel, 6).toString();

            txtIdCli.setText(id_cliente);
            txtNomeCli.setText(nome_cliente);
            txtEnderecoCli.setText(endereco_cliente);
            txtTelefoneCli.setText(telefone_cliente);
            txtEmailCli.setText(email_cliente);
            txtCPFcli.setText(cpf_cliente);
            txtCNPJcli.setText(cnpj_cliente);
        }
    }//GEN-LAST:event_TbClientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ClienteDAO objCliDAO = new ClienteDAO();
        objCliDAO.limparCampos();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCliActionPerformed

    }//GEN-LAST:event_txtIdCliActionPerformed

    private void txtEnderecoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoCliActionPerformed

    }//GEN-LAST:event_txtEnderecoCliActionPerformed

    private void txtCPFcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFcliActionPerformed

    }//GEN-LAST:event_txtCPFcliActionPerformed

    private void txtCNPJcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJcliActionPerformed

    }//GEN-LAST:event_txtCNPJcliActionPerformed

    private void txtEmailCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCliActionPerformed

    }//GEN-LAST:event_txtEmailCliActionPerformed

    private void txtTelefoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneCliActionPerformed

    }//GEN-LAST:event_txtTelefoneCliActionPerformed

    private void txtNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCliActionPerformed

    }//GEN-LAST:event_txtNomeCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TbClientes;
    private javax.swing.JButton btnUsuCreate;
    private javax.swing.JButton btnUsuDelete;
    private javax.swing.JButton btnUsuUpdate;
    private javax.swing.JButton btnUsuread;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtCNPJcli;
    public static javax.swing.JTextField txtCPFcli;
    public static javax.swing.JTextField txtEmailCli;
    public static javax.swing.JTextField txtEnderecoCli;
    public static javax.swing.JTextField txtIdCli;
    public static javax.swing.JTextField txtNomeCli;
    public static javax.swing.JTextField txtTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
