package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

//import org.postgresql.core.ConnectionFactory;

import models.Fornecedores;


public class FornecedoresDao {
	     Conexao conect = new Conexao(); 
	     Connection con;
		 
		 public List<Fornecedores>listarFornecedores(){
			 
			 conect.conecta();
			 
			try {
			List<Fornecedores> lista = new ArrayList<>();
			String sql = "select * from fornecedores;";
			
			PreparedStatement stmt= con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
 
				 JOptionPane.showMessageDialog(null, "estamos no try :)" );
				 
				 while(rs.next()){
				Fornecedores objFornecedores = new Fornecedores();	 
				objFornecedores.setCodigoFornecedor(rs.getInt("codigofornecedor"));
				objFornecedores.setNome(rs.getString("nome"));
				objFornecedores.setEndereco(rs.getString("endereco"));
				objFornecedores.setTelefone(rs.getString("telefone"));
				
				lista.add(objFornecedores);
				 }
				 return lista;
				
			} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
			 
		}
			return null;
	 }	 		
}


