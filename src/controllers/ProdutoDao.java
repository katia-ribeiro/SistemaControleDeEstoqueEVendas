package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import models.Produtos;
public class ProdutoDao {
	 Connection conn;
	 Conexao conect;
	 ResultSet rs;
	 PreparedStatement pstm;
	 ArrayList<Produtos> listaProdutos = new ArrayList<>();
	 
	 public ArrayList<Produtos> PesquisarProdutos(){
		 conect.conecta();
		 String sql = "select * from produtos";
		 
		 try {
			 pstm = conn.prepareStatement(sql);
			 rs = pstm.executeQuery();
			 
			 while(rs.next()){
			Produtos objProdutos = new Produtos();	 
			objProdutos.setCodigoproduto(rs.getInt("codigoproduto"));
			objProdutos.setNome(rs.getString("nome"));
			objProdutos.setEstoquemin(rs.getInt("estoquemin"));
			objProdutos.setCodigobarras(rs.getString("codigobarras"));
			objProdutos.setPrecovenda(rs.getDouble("precovenda"));
			objProdutos.setQuantidade(rs.getInt("quantidade"));
			
			listaProdutos.add(objProdutos);
			 }
			 
		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
			
		}
		 return listaProdutos;
		 
	
	 }
//	 public void cadastrarcodigobarras(Produtos objProduto) {
//	 String sql = "insert into produtos (nome, quantidade, estoquemin, precovenda, codigobarras, fk_codigofornecedor) values(?,?,?,?,?,?)";
//	 conn =  new Conexao().conectaBD();
//	 try {
//		pstm = conn.prepareStatement(sql);
//		pstm.setString(1,objProduto.getNome());
//		pstm.setInt(2,objProduto.getQuantidade());
//		pstm.setInt(3,objProduto.getEstoquemin());
//		pstm.setDouble(4,objProduto.getPrecovenda());
//		pstm.setInt(5,objProduto.getCodigobarras());
//		pstm.setInt(6,objProduto.getFk_codigofornecedor());
	 
	 
//	 Random random = new Random();
//	 String codigo;
//	 int numeroInteiroAleatorio = random.nextInt(999999999);
//        	       
//        if(numeroInteiroAleatorio < 999999999)
//        	{ codigo = String.valueOf(numeroInteiroAleatorio);
//        	System.out.println("Número inteiro aleatório de : " + codigo);
//        	}	
//		return codigo;
//		 
//		pstm.execute();
//		pstm.close();
//		
//	} catch (Exception erro) {
//		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
//	}
//	 }
	 
	 public ResultSet ListarFornecedores(){
		 
		 conn = new Conexao().conectaBD();
		 String sql = "select * from fornecedores order by nome;";
		 String sqlr = " insert into produtos (codigobarras) value (?);";
		 
		 JOptionPane.showMessageDialog(null, "seleção realizada :)" );
		 
		 Random random = new Random();
		 String codigo;
		 int numeroInteiroAleatorio = random.nextInt(999999999);
	        	       
	        if(numeroInteiroAleatorio < 999999999)
	        	{ codigo = "0" + String.valueOf(numeroInteiroAleatorio);
	        	System.out.println("Número inteiro aleatório de : " + codigo);
	        	}	
		 
		 try {
			 pstm = conn.prepareStatement(sql);
			 return pstm.executeQuery();
			 
		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
		return null;
			}
		
		
		}	
 public ResultSet ListarProdutos(){
		 
		 conn = new Conexao().conectaBD();
		 String sql = "select * from produtos order by nome;";
		 JOptionPane.showMessageDialog(null, "seleção realizada :)" );
		 
		 try {
			 pstm = conn.prepareStatement(sql);
			 return pstm.executeQuery();			 
		        
			 
		} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
		return null;
			}
 	}
} 
