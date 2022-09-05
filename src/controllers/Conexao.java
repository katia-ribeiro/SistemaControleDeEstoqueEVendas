package controllers;
import java.sql.*;
import javax.swing.*;

public class Conexao {
	   final private String url = "jdbc:postgresql://localhost:5432/SistemaControleEstoqueVendas";
	   final private String usuario = "postgres";
	   final private String senha = "sa";
	   final private String driver = "org.postgresql.Driver";
	   public Connection conexao;
	   public Statement statement;
	   public ResultSet resultset;
	   
	   public Connection conectaBD() {
		   Connection conn = null;
		   try {
			   String url =  "jdbc:postgresql://localhost:5432/SistemaControleEstoqueVendas?user=postgres&password=sa";
			   conn = DriverManager.getConnection(url);
			   
		   }catch (SQLException erro) {
		    	JOptionPane.showMessageDialog(null, "Erro de conexão :( ");
		   }
		    	return conn;
		   		   
	   }
	   
	   public boolean conecta() {
		   boolean result = true;
	    try {
	      Class.forName(driver);
	      conexao = DriverManager.getConnection(url, usuario, senha);
	      JOptionPane.showMessageDialog(null, "Conexão ok!");
	  
	    }
	    catch (ClassNotFoundException Fonte) {
	    	JOptionPane.showMessageDialog(null, "Drive não localizado :( ");
	    	result = false;
	    	
	    }catch (SQLException Fonte) {
		    	JOptionPane.showMessageDialog(null, "Erro de conexão :( ");
		    	result = false;
	    }
	    return result;
	    } 
	   public void desconecta() {
		   boolean result = true;
		   try {
			   conexao.close();
			   JOptionPane.showMessageDialog(null, "Conexão fechada");
			   
		 }catch (SQLException fech) {
			 JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados" + fech);
			 result = false;
		 }
	}
	   public void executaSQL (String sql) {
		   try {
			   statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			   resultset = statement.executeQuery(sql);
		   }catch (SQLException sqlex) {
			 JOptionPane.showMessageDialog(null, "Não foi possível execultar o comando sql" + sqlex + "O comando passado foi" + sql);
		   }
	   }
}
