package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controllers.Conexao;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class CadastroFornecedores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldTelefone;
	Conexao conexao = new Conexao(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedores frame = new CadastroFornecedores();
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
	public CadastroFornecedores() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarFornecedores = new JLabel("Cadastrar Fornecedores");
		lblCadastrarFornecedores.setFont(new Font("Arial", Font.PLAIN, 36));
		lblCadastrarFornecedores.setBounds(348, 14, 419, 73);;
		contentPane.add(lblCadastrarFornecedores);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNome.setBounds(379, 101, 80, 38);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(379, 131, 353, 38);
		contentPane.add(textFieldNome);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o");
		lbEndereco.setFont(new Font("Arial", Font.PLAIN, 24));
		lbEndereco.setBounds(379, 198, 201, 38);
		contentPane.add(lbEndereco);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(379, 228, 353, 38);
		contentPane.add(textFieldEndereco);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 24));
		lblTelefone.setBounds(379, 304, 201, 38);
		contentPane.add(lblTelefone);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(379, 334, 353, 38);
		contentPane.add(textFieldTelefone);
		
		JButton btnSalvarFornecedores = new JButton("Salvar");
		btnSalvarFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvar();
				new Home().setVisible(true);
			}
		});
		btnSalvarFornecedores.setFont(new Font("Arial", Font.PLAIN, 28));
		btnSalvarFornecedores.setBackground(new Color(154, 205, 50));
		btnSalvarFornecedores.setBounds(379, 421, 360, 38);
		contentPane.add(btnSalvarFornecedores);
	}
	public void salvar() {
		conexao.conecta();
		conexao.executaSQL("select * from fornecedores");
		try {
			String sqlsinsert = " insert into fornecedores (nome, endereco, telefone) values ('"
				   + textFieldNome.getText() +" ',' "
				   + textFieldEndereco.getText() + " ',' "
				   + textFieldTelefone.getText() +  "')";
			
					conexao.statement.executeUpdate(sqlsinsert);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso!:)");
					textFieldNome.setText("");
					textFieldEndereco.setText("");
					textFieldTelefone.setText("");
			 
					  conexao.executaSQL("select * from fornecedores");
					  conexao.resultset.first();
					  conexao.desconecta();
				
		} catch (SQLException erro) {
			
		 JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados :(" + erro);
		}
		
	}
}

