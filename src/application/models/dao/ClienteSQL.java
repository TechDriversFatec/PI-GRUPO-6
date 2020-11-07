package application.models.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import application.models.Cliente;

public class ClienteSQL extends ConnectionBase {
	
	public void create(Cliente cliente) {
	
		open();
		
		try {
			String sql = "INSERT INTO cliente ";
			sql += " (nome_cli, cpf_cnpj_cli, rua_cli, numero_cli, complemento_cli, bairro_cli, cidade_cli, estado_cli, cep_cli, telefone_cli) ";
			sql += "VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stm = conexao.prepareStatement(sql);
			
			stm.setString(1, cliente.getNome_cli());
			stm.setString(2, cliente.getCpf_cnpj_cli());
			stm.setString(3, cliente.getRua_cli());
			stm.setInt(4, cliente.getNumero_cli());
			stm.setString(5, cliente.getComplemento_cli());
			stm.setString(6, cliente.getBairro_cli());
			stm.setString(7, cliente.getCidade_cli());
			stm.setString(8, cliente.getEstado_cli());
			stm.setString(9, cliente.getCep_cli());
			stm.setString(10, cliente.getTelefone_cli());
			
			stm.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			close();
		}
	}
		

}
	