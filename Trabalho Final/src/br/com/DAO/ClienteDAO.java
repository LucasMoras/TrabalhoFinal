package br.com.DAO;

import br.com.DTO.ClientesDTO;
import br.com.views.TelaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

public void inserirUsuario(ClientesDTO objClientesDTO) {
        String sql = "insert into tb_usuarios (id_usuario, usuario, login, senha, perfil)" + "values (?, ?, ?, ?, ?)";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(2, objClientesDTO.getNome_cliente());
            pst.setString(3, objClientesDTO.getEndereço_cliente());
            pst.setString(4, objClientesDTO.getTelefone_cliente());
            pst.setString(5, objClientesDTO.getEmail_cliente());
            pst.setString(6, objClientesDTO.getCpf_cliente());
            pst.setString(7, objClientesDTO.getCnpj_cliente());

            int add  = pst.executeUpdate();
            if (add > 0) {
                pesquisaAuto();
                pst.close();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso! ");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Método Inserir " + e);
        }
    }

    public void pesquisar(ClientesDTO objClientesDTO) {
        String sql = "select * from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientesDTO.);
            rs = pst.executeQuery();
            if (rs.next()) {
                TelaUsuario.txtNomeUsu.setText(rs.getString(2));
                TelaUsuario.txtLoginUsu.setText(rs.getString(3));
                TelaUsuario.txtSenhaUsu.setText(rs.getString(4));
                TelaUsuario.cboPerfilUsu.setSelectedItem(rs.getString(5));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from tb_usuarios";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaUsuario.TbUsuarios.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nome = rs.getString("usuario");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                String perfil = rs.getString("perfil");
                model.addRow(new Object[]{id, nome, login, senha, perfil});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }

    public void editar(ClientesDTO objClientesDTO) {
        String sql = "update tb_usuarios set usuario = ?, login = ?, senha = ?, perfil = ? where id_usuario = ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objClientesDTO.getId_uauario());
            pst.setString(4, objClientesDTO.getPerfil_usuario());
            pst.setString(3, objClientesDTO.getSenha_usuario());
            pst.setString(2, objClientesDTO.getLogin_usuario());
            pst.setString(1, objClientesDTO.getNome_usuario());
            int add = pst.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar " + e);
        }
    }

    public void deletar(ClientesDTO objClientesDTO) {
        String sql = "delete from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientesDTO.getId_uauario());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Usuário deletado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }
    public void limparCampos() {
        TelaUsuario.txtIdUsu.setText(null);
        TelaUsuario.txtLoginUsu.setText(null);
        TelaUsuario.txtNomeUsu.setText(null);
        TelaUsuario.txtSenhaUsu.setText(null);
        TelaUsuario.cboPerfilUsu.setSelectedItem(1);
    }
}