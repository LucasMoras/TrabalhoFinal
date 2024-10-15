package br.com.DAO;

import br.com.DTO.ClientesDTO;
import br.com.views.TelaCliente;
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

public void inserirCliente(ClientesDTO objClientesDTO) {
        String sql = "insert into tb_clientes (id_cliente, cliente, endereco, telefone, email, cpf, cnpj)" + "values (?, ?, ?, ?, ?, ? ,?)";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);       
            pst.setInt(1, objClientesDTO.getId_cliente());
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
        String sql = "select * from tb_clientes where id_cliente = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientesDTO.getId_cliente());
            
            rs = pst.executeQuery();
            if (rs.next()) {
                TelaCliente.txtNomeCli.setText(rs.getString(2));
                TelaCliente.txtEnderecoCli.setText(rs.getString(3));
                TelaCliente.txtTelefoneCli.setText(rs.getString(4));
                TelaCliente.txtEmailCli.setText(rs.getString(5));
                TelaCliente.txtCPFcli.setText(rs.getString(6));
                TelaCliente.txtCNPJcli.setText(rs.getString(7));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from tb_clientes";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaCliente.TbClientes.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_cliente");
                String nome = rs.getString("cliente");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                String cnpj = rs.getString("cnpj");
                model.addRow(new Object[]{id, nome, endereco, telefone, email, cpf, cnpj});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }

    public void editar(ClientesDTO objClientesDTO) {
        String sql = "update tb_clientes set cliente = ?, endereco= ?, telefone = ?, email = ?, CPF = ?, CNPJ = ? where id_cliente = ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(7, objClientesDTO.getId_cliente());
            pst.setString(1, objClientesDTO.getNome_cliente());
            pst.setString(2, objClientesDTO.getEndereço_cliente());
            pst.setString(3, objClientesDTO.getTelefone_cliente());        
            pst.setString(4, objClientesDTO.getEmail_cliente());
            pst.setString(5, objClientesDTO.getCpf_cliente());
            pst.setString(6, objClientesDTO.getCnpj_cliente());
            int add = pst.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar " + e);
        }
    }

    public void deletar(ClientesDTO objClientesDTO) {
        String sql = "delete from tb_clientes where id_cliente = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientesDTO.getId_cliente());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Cliente deletado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }
    public void limparCampos() {
        TelaCliente.txtIdCli.setText(null);
        TelaCliente.txtNomeCli.setText(null);
        TelaCliente.txtEnderecoCli.setText(null);
        TelaCliente.txtTelefoneCli.setText(null);
        TelaCliente.txtEmailCli.setText(null);
        TelaCliente.txtCPFcli.setText(null);
        TelaCliente.txtCNPJcli.setText(null);
    }
}