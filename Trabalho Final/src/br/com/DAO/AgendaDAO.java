package br.com.DAO;

import br.com.DTO.AgendaDTO;
import br.com.views.TelaAgenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgendaDAO {
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        public void deletar(AgendaDTO objAgendaDTO){
         String sql = "delete from tb_agenda where nome = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objAgendaDTO.getNome());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Deletado");
                PesquisarAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }
        
        public void Pesquisar(AgendaDTO objAgendaDTO){
             String sql = "select * from tb_agenda where nome = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objAgendaDTO.getNome());
            
            rs = pst.executeQuery();
            if (rs.next()) {
                TelaAgenda.txtNome.setText(rs.getString(1));
                TelaAgenda.txtData.setText(rs.getString(2));
                TelaAgenda.txtHora.setText(rs.getString(3));
                TelaAgenda.txtAssunto.setText(rs.getString(4));

                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente sem agendamentos");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }       
        
        public void PesquisarAuto(){
             String sql = "select  *  from tb_agenda" ;
             conexao = ConexaoDAO.conector();
             
         try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();            
             DefaultTableModel model = (DefaultTableModel) TelaAgenda.tbAgenda.getModel();
            model.setNumRows(0);  
            
            while (rs.next()){       
            String nome = rs.getString("nome");
            String data = rs.getString("dataa") ;
            String hora = rs.getString("hora");
            String assunto = rs.getString("assunto");   
            model.addRow(new Object[]{nome, data, hora, assunto});        
            }
             conexao.close();
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, " gendamentos" + e);    
             }
          }
         public void limparCampos() {
        TelaAgenda.txtNome.setText(null);
        TelaAgenda.txtData.setText(null);
        TelaAgenda.txtHora.setText(null);
        TelaAgenda.txtAssunto.setText(null);
        }
         
         public void Agendar(AgendaDTO objAgendaDTO){       
         String sql = "insert into tb_agenda (nome, dataa, hora, assunto)" + "values (?, ?, ?, ?)";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objAgendaDTO.getNome());
            pst.setString(2, objAgendaDTO.getData());
            pst.setString(3, objAgendaDTO.getHora());
            pst.setString(4, objAgendaDTO.getAssunto());
            int add  = pst.executeUpdate();
            if (add > 0) {
                PesquisarAuto();
                pst.close();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Cliente agendado");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Método Inserir " + e);
        }
    }
}
         




