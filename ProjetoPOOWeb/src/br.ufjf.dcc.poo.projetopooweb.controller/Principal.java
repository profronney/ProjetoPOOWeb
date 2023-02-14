package br.ufjf.dcc.poo.projetopooweb.controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.ufjf.dcc.poo.model.Cliente;

public class Principal {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		try {
			
			ConexaoMySQl conexaoMySQl = new ConexaoMySQl();
			Connection con = conexaoMySQl.criarConexao();
			String sql = "";
			
			/*
			 * Cliente cliente = new Cliente();
			 * cliente.setCod_cliente(JOptionPane.showInputDialog(null,"Entre com o código")
			 * ); cliente.setNome(JOptionPane.showInputDialog(null,"Entre com o nome"));
			 * cliente.setEnd_rua(JOptionPane.showInputDialog(null,"Entre com a rua"));
			 * cliente.setEnd_numero(Integer.parseInt(JOptionPane.showInputDialog(
			 * null,"Entre com o numero")));
			 * cliente.setEnd_complemento(JOptionPane.showInputDialog(
			 * null,"Entre com o complemento"));
			 * 
			 * sql = "INSERT INTO clientes (cod_cliente, nome, end_rua, end_numero," +
			 * "end_complemento) VALUES ('" + cliente.getCod_cliente() + "', '" +
			 * cliente.getNome() + "', '" + cliente.getEnd_rua() + "', " +
			 * cliente.getEnd_numero() + ", '" + cliente.getEnd_complemento() + "')";
			 * 
			 * if(conexaoMySQl.operacaoBanco(con, sql) == 0) {
			 * JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Erro", 0, null);
			 * }else{ JOptionPane.showMessageDialog(null, "Operação executada com sucesso",
			 * "Sucesso", 1, null); };
			 */
			
			sql = "SELECT * FROM clientes ORDER BY nome";
		    ResultSet rs = conexaoMySQl.executarSelect(con, sql);
		    ArrayList<Cliente>clientes = new ArrayList<>();
		    while (rs.next()){
		    	Cliente cliente = new Cliente();
		    	cliente.setCod_cliente(rs.getString("cod_cliente"));
		    	cliente.setNome(rs.getString("nome"));
		    	cliente.setEnd_rua(rs.getString("end_rua"));
		    	cliente.setEnd_numero(Integer.parseInt(rs.getString("end_numero")));
		    	cliente.setEnd_complemento(rs.getString("end_complemento"));
		    	
		        clientes.add(cliente);
		    }
		    
		    for(Cliente cliente : clientes){
		         System.out.println("Código Cliente: " + cliente.getCod_cliente());
		         System.out.println("Nome: " + cliente.getNome());
		         System.out.println("Endereço - Rua: " + cliente.getEnd_rua());
		         System.out.println("Endereço - Número: " + cliente.getEnd_numero());
		         System.out.println("Endereço - Complemento: " + cliente.getEnd_complemento()+ "\n");
		    }
		    //st.close();
		    			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Erro", 0, null);
			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Fim do programa", "Erro", 1, null);
		}
	}

}
