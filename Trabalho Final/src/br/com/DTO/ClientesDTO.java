package br.com.DTO;

public class ClientesDTO {
     private int id_cliente;
    private String nome_cliente, endereço_cliente, telefone_cliente, email_cliente, cpf_cliente, cnpj_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEndereço_cliente() {
        return endereço_cliente;
    }

    public void setEndereço_cliente(String endereço_cliente) {
        this.endereço_cliente = endereço_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getCnpj_cliente() {
        return cnpj_cliente;
    }

    public void setCnpj_cliente(String cnpj_cliente) {
        this.cnpj_cliente = cnpj_cliente;
    }
    
}
