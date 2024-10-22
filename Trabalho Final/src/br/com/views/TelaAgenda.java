package br.com.views;

import br.com.DAO.AgendaDAO;
import br.com.DTO.AgendaDTO;

public class TelaAgenda extends javax.swing.JInternalFrame {

    public TelaAgenda() {
        initComponents();
        AgendaDAO ojbAgendaDAO = new AgendaDAO();
        ojbAgendaDAO.PesquisarAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtAssunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgenda = new javax.swing.JTable();
        bntAgendar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        bntExcluir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Cliente");

        jLabel2.setText("Data");

        jLabel3.setText("Hora");

        jLabel4.setText("Assunto");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        txtAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssuntoActionPerformed(evt);
            }
        });

        tbAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Data", "Hora", "Assunto"
            }
        ));
        tbAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAgenda);

        bntAgendar.setText("Agendar");
        bntAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgendarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bntAgendar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntExcluir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgendarActionPerformed
            
        String nome = txtNome.getText();
        String data= txtData.getText();
        String hora = txtHora.getText();
        String assunto = txtAssunto.getText();

        AgendaDTO objAgendaDTO = new AgendaDTO();
        objAgendaDTO.setNome(nome);
        objAgendaDTO.setData(data);
        objAgendaDTO.setHora(hora);
        objAgendaDTO.setAssunto(assunto);

        AgendaDAO objAgendaDAO = new AgendaDAO();
        objAgendaDAO.Agendar(objAgendaDTO);
            
    }//GEN-LAST:event_bntAgendarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssuntoActionPerformed
        
    }//GEN-LAST:event_txtAssuntoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
         
        String nome = txtNome.getText();
        AgendaDTO objAgendaDTO = new AgendaDTO();
        objAgendaDTO.setNome(nome);
        
        AgendaDAO objAgendaDAO = new AgendaDAO();
        objAgendaDAO.deletar(objAgendaDTO);
        
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void tbAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAgendaMouseClicked
         
            int linhaSel = tbAgenda.getSelectedRow();
            if(linhaSel != -1 ){
            String nome = tbAgenda.getValueAt(linhaSel, 0).toString();
            String data = tbAgenda.getValueAt(linhaSel, 1).toString();
            String hora = tbAgenda.getValueAt(linhaSel, 2).toString();
            String assunto = tbAgenda.getValueAt(linhaSel, 3).toString();
            
            txtNome.setText(nome);
            txtData.setText(data);
            txtHora.setText(hora);
            txtAssunto.setText(assunto);
        }
    }//GEN-LAST:event_tbAgendaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgendar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbAgenda;
    public static javax.swing.JTextField txtAssunto;
    public static javax.swing.JTextField txtData;
    public static javax.swing.JTextField txtHora;
    public static javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
