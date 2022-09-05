package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastrarVenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNomeVenda;
	private JTextField textFieldQuantVendas;
	private JTextField textFieldValorVenda;
	private JTextField textFieldCodBarras;
	private JTextField textFieldFornecedor;
	private JTextField textFieldTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarVenda frame = new CadastrarVenda();
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
	public CadastrarVenda() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloCadastroVenda = new JLabel("Cadastrar Vendas");
		lblTituloCadastroVenda.setFont(new Font("Arial", Font.PLAIN, 36));
		lblTituloCadastroVenda.setBounds(415, 10, 319, 36);
		contentPane.add(lblTituloCadastroVenda);
		
		JLabel lblNomeVenda = new JLabel("Nome");
		lblNomeVenda.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNomeVenda.setBounds(57, 111, 80, 38);
		contentPane.add(lblNomeVenda);
		
		textFieldNomeVenda = new JTextField();
		textFieldNomeVenda.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldNomeVenda.setColumns(10);
		textFieldNomeVenda.setBounds(50, 148, 360, 38);
		contentPane.add(textFieldNomeVenda);
		
		JLabel lblQuantidadeVendas = new JLabel("Quantidade");
		lblQuantidadeVendas.setFont(new Font("Arial", Font.PLAIN, 24));
		lblQuantidadeVendas.setBounds(57, 214, 137, 38);
		contentPane.add(lblQuantidadeVendas);
		
		textFieldQuantVendas = new JTextField();
		textFieldQuantVendas.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldQuantVendas.setColumns(10);
		textFieldQuantVendas.setBounds(50, 249, 360, 38);
		contentPane.add(textFieldQuantVendas);
		
		JLabel lblValorVendas = new JLabel("Valor");
		lblValorVendas.setFont(new Font("Arial", Font.PLAIN, 24));
		lblValorVendas.setBounds(57, 317, 137, 38);
		contentPane.add(lblValorVendas);
		
		textFieldValorVenda = new JTextField();
		textFieldValorVenda.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldValorVenda.setColumns(10);
		textFieldValorVenda.setBounds(50, 350, 360, 38);
		contentPane.add(textFieldValorVenda);
		
		JLabel lblCdigoDeBarrasVendas = new JLabel("C\u00F3digo de Barras");
		lblCdigoDeBarrasVendas.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCdigoDeBarrasVendas.setBounds(704, 111, 194, 38);
		contentPane.add(lblCdigoDeBarrasVendas);
		
		textFieldCodBarras = new JTextField();
		textFieldCodBarras.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldCodBarras.setColumns(10);
		textFieldCodBarras.setBounds(699, 148, 360, 38);
		contentPane.add(textFieldCodBarras);
		
		JLabel lblFornecedorVendas = new JLabel("Fornecedor");
		lblFornecedorVendas.setFont(new Font("Arial", Font.PLAIN, 24));
		lblFornecedorVendas.setBounds(704, 214, 143, 38);
		contentPane.add(lblFornecedorVendas);
		
		textFieldFornecedor = new JTextField();
		textFieldFornecedor.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldFornecedor.setColumns(10);
		textFieldFornecedor.setBounds(699, 249, 360, 38);
		contentPane.add(textFieldFornecedor);
		
		JLabel lblValorTotal = new JLabel("Total");
		lblValorTotal.setFont(new Font("Arial", Font.PLAIN, 24));
		lblValorTotal.setBounds(704, 317, 137, 38);
		contentPane.add(lblValorTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setFont(new Font("Arial", Font.PLAIN, 24));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(699, 350, 360, 38);
		contentPane.add(textFieldTotal);
		
		JButton btnSalvarVendas = new JButton("Salvar");
		btnSalvarVendas.setFont(new Font("Arial", Font.PLAIN, 28));
		btnSalvarVendas.setBackground(new Color(154, 205, 50));
		btnSalvarVendas.setBounds(386, 472, 360, 38);
		contentPane.add(btnSalvarVendas);
	}
}
