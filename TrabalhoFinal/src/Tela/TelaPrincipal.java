package Tela;

import Conexao.ConexaoBanco;
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.plaf.DesktopPaneUI;
import javax.swing.DesktopManager;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaPrincipal() {
        initComponents();
      conexao = ConexaoBanco.Conector();    

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastroUsu = new javax.swing.JMenuItem();
        CadastroCli = new javax.swing.JMenuItem();
        MenuAge = new javax.swing.JMenu();
        Agenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);
        Desktop1.setLayout(Desktop1Layout);
        Desktop1Layout.setHorizontalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        Desktop1Layout.setVerticalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        CadastroUsu.setText("Cadastrar Usuario");
        CadastroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroUsu);

        CadastroCli.setText("Cadastrar Cliente");
        CadastroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCliActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroCli);

        jMenuBar1.add(jMenu1);

        MenuAge.setText("Agenda");

        Agenda.setText("Abrir");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        MenuAge.add(Agenda);

        jMenuBar1.add(MenuAge);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuActionPerformed
        DesktopUsu du1 = new DesktopUsu();
        Desktop1.add(du1);
        du1.setVisible(true);

    }//GEN-LAST:event_CadastroUsuActionPerformed

    private void CadastroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCliActionPerformed
        DesktopCli dc1 = new DesktopCli();
        Desktop1.add(dc1);
        dc1.setVisible(true);
    }//GEN-LAST:event_CadastroCliActionPerformed

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        DesktopAge da1 = new DesktopAge();
        Desktop1.add(da1);
        da1.setVisible(true);
    }//GEN-LAST:event_AgendaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agenda;
    private javax.swing.JMenuItem CadastroCli;
    private javax.swing.JMenuItem CadastroUsu;
    private javax.swing.JDesktopPane Desktop1;
    private javax.swing.JMenu MenuAge;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

