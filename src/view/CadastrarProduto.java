package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controllers.Conexao;
import controllers.ProdutoDao;
import controllers.FornecedoresDao;
import models.Fornecedores;
import models.Produtos;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextPane;

public class CadastrarProduto extends JFrame {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public Conexao conectar;
	private JPanel contentPane;
	private JTextField textFieldQuantidade;
	private JTextField textFieldEstoqueMinimo;
	private JTextField textFieldCodigodeBarras;
	private JTextField textFieldPrecoVenda;
	private JTextField textFieldNome;
	private JComboBox comboBoxFornecedores;
	private JComboBox comboBoxNome;
	
	Conexao conexao = new Conexao(); 
	
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					CadastrarProduto frame = new CadastrarProduto();
					frame.setVisible(true);		
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarProduto() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TituloProduto = new JLabel("Cadastrar Produtos");
		TituloProduto.setFont(new Font("Arial", Font.PLAIN, 36));
		TituloProduto.setBounds(348, 14, 335, 73);
		contentPane.add(TituloProduto);
		
		JLabel lblEstoqueMinimo = new JLabel("Estoque M\u00EDnimo");
		lblEstoqueMinimo.setFont(new Font("Arial", Font.PLAIN, 24));
		lblEstoqueMinimo.setBounds(36, 267, 194, 38);
		contentPane.add(lblEstoqueMinimo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNome.setBounds(36, 99, 80, 38);
		contentPane.add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Arial", Font.PLAIN, 24));
		lblQuantidade.setBounds(36, 182, 137, 38);
		contentPane.add(lblQuantidade);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldQuantidade.setColumns(10);
		textFieldQuantidade.setBounds(36, 217, 360, 38);
		contentPane.add(textFieldQuantidade);
		
		textFieldEstoqueMinimo = new JTextField();
		textFieldEstoqueMinimo.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldEstoqueMinimo.setColumns(10);
		textFieldEstoqueMinimo.setBounds(36, 300, 360, 38);
		contentPane.add(textFieldEstoqueMinimo);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setFont(new Font("Arial", Font.PLAIN, 24));
		lblFornecedor.setBounds(659, 99, 143, 38);
		contentPane.add(lblFornecedor);
		
		JLabel lblCdigoDeBarras = new JLabel("C\u00F3digo de Barras");
		lblCdigoDeBarras.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCdigoDeBarras.setBounds(657, 182, 194, 38);
		contentPane.add(lblCdigoDeBarras);
		
		textFieldCodigodeBarras = new JTextField();
		textFieldCodigodeBarras.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldCodigodeBarras.setColumns(10);
		textFieldCodigodeBarras.setBounds(657, 217, 360, 38);
		contentPane.add(textFieldCodigodeBarras);
		
		JLabel lblPrecoVenda = new JLabel("Pre\u00E7o de Venda");
		lblPrecoVenda.setFont(new Font("Arial", Font.PLAIN, 24));
		lblPrecoVenda.setBounds(657, 267, 194, 38);
		contentPane.add(lblPrecoVenda);
		
		textFieldPrecoVenda = new JTextField();
		textFieldPrecoVenda.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldPrecoVenda.setColumns(10);
		textFieldPrecoVenda.setBounds(657, 301, 360, 38);
		contentPane.add(textFieldPrecoVenda);
		
		JButton btnSalvarProdutos = new JButton("Salvar");
		btnSalvarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvar();
				new Home().setVisible(true);
			}
			
		});
		btnSalvarProdutos.setFont(new Font("Arial", Font.PLAIN, 28));
		btnSalvarProdutos.setBackground(new Color(154, 205, 50));
		btnSalvarProdutos.setBounds(657, 382, 360, 38);
		contentPane.add(btnSalvarProdutos);
		
		textFieldNome = new JTextField();
		textFieldNome.setForeground(Color.BLACK);
		textFieldNome.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(30, 132, 353, 38);
		contentPane.add(textFieldNome);
			
		comboBoxFornecedores = new JComboBox();
		comboBoxFornecedores.setForeground(Color.BLACK);
		comboBoxFornecedores.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				restaurarDadosComboBox();
				ProdutoDao prod = new ProdutoDao();
				
		}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		comboBoxFornecedores.setModel(new DefaultComboBoxModel(new String[] {"Selecione o fornecedor"}));
		comboBoxFornecedores.setBackground(Color.WHITE);
		comboBoxFornecedores.setBounds(659, 138, 358, 32);
		contentPane.add(comboBoxFornecedores);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroFornecedores().setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(1029, 138, 45, 29);
		contentPane.add(btnNewButton);
		
		
}		 
Vector<Integer> codigoFornecedor = new Vector<Integer>();
private JTextField textTest;
		
		public void restaurarDadosComboBox() {
			
			try {
				
				ProdutoDao objProdutoDao = new ProdutoDao();
				ResultSet rs = objProdutoDao.ListarFornecedores();
				
				while (rs.next()) {
					codigoFornecedor.addElement(rs.getInt(1));
					comboBoxFornecedores.addItem(rs.getString(2));
				}
				
				} catch (SQLException erro) {
				
				 JOptionPane.showMessageDialog(null, "Ocorreu um erro ao listar fornecedores :(" + erro);
				}
	}

		
	public void salvar() {
		conexao.conecta();
		conexao.executaSQL("select * from produtos;");
		try {
			
			String sqlsinsert = " insert into produtos (nome, quantidade, estoquemin, precovenda, fk_codigofornecedor) values ('"
				   + textFieldNome.getText() +" ',' "
				   + textFieldQuantidade.getText() + " ',' "
				   + textFieldEstoqueMinimo.getText() + " ',' "
				   + textFieldPrecoVenda.getText().replace(',', '.') +" ',' " 
				   + comboBoxFornecedores.getSelectedIndex()
				   + "')";
			
		   
			conexao.statement.executeUpdate(sqlsinsert);
		
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!:)");
			
			  textFieldQuantidade.setText("");
			  textFieldEstoqueMinimo.setText("");
			  textFieldCodigodeBarras.setText("");
			  textFieldNome.setText("");
			  textFieldPrecoVenda.setText("");
			  conexao.executaSQL("select * from produtos");
			  conexao.resultset.first();
			  conexao.desconecta();
				
		} catch (SQLException erro) {
			
		 JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
		}
	}		
}
	

	
