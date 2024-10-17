package br.com.views;

import java.text.DateFormat;
import java.util.Date;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblUsuarioPrincipal = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        subMenuUsuarios = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Agenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(604, 500));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblUsuarioPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuarioPrincipal.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setText("Data");

        MenuCadastro.setText("Cadastro");

        subMenuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        subMenuUsuarios.setText("Usuários");
        subMenuUsuarios.setEnabled(false);
        subMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuUsuariosActionPerformed(evt);
            }
        });
        MenuCadastro.add(subMenuUsuarios);

        Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(Cliente);

        Menu.add(MenuCadastro);

        Agenda.setText("Agenda");
        Agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgendaMouseClicked(evt);
            }
        });
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        Menu.add(Agenda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblUsuarioPrincipal))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblUsuarioPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(929, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuUsuariosActionPerformed

        TelaUsuario tlUsu = new TelaUsuario();
        tlUsu.setVisible(true);
        Desktop.add(tlUsu);
        
    }//GEN-LAST:event_subMenuUsuariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        
        TelaCliente tlCli = new TelaCliente();
        tlCli.setVisible(true);
        Desktop.add(tlCli);
        
    }//GEN-LAST:event_ClienteActionPerformed

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        
    }//GEN-LAST:event_AgendaActionPerformed

    private void AgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendaMouseClicked
       TelaAgenda tlAge = new TelaAgenda();
        tlAge.setVisible(true);
        Desktop.add(tlAge);
    }//GEN-LAST:event_AgendaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agenda;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    public static javax.swing.JMenu MenuCadastro;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuarioPrincipal;
    public static javax.swing.JMenuItem subMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}
