package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Home extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 605);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produtos");
		btnCadastrarProduto.setFont(new Font("Arial", Font.PLAIN, 28));
		btnCadastrarProduto.setBackground(Color.WHITE);
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastrarProduto().setVisible(true);
			}
		});
		btnCadastrarProduto.setBounds(21, 187, 334, 85);
		contentPane.add(btnCadastrarProduto);
		
		JLabel lblTituloPrincipal = new JLabel("Sistema de Controle de Estoque e Vendas");
		lblTituloPrincipal.setFont(new Font("Arial", Font.PLAIN, 36));
		lblTituloPrincipal.setBounds(47, 6, 686, 67);
		contentPane.add(lblTituloPrincipal);
		
		JButton btnListas = new JButton("Listas");
		btnListas.setBackground(Color.WHITE);
		btnListas.setFont(new Font("Arial", Font.PLAIN, 28));
		btnListas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Listas().setVisible(true);
			}
		});
		btnListas.setBounds(747, 187, 334, 85);
		contentPane.add(btnListas);
		
		JButton btnCadastrarVendas= new JButton("Cadastrar Vendas");
		btnCadastrarVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastrarVenda().setVisible(true);
			}
		});
		btnCadastrarVendas.setBackground(Color.WHITE);
		btnCadastrarVendas.setFont(new Font("Arial", Font.PLAIN, 28));
		btnCadastrarVendas.setBounds(384, 187, 334, 85);
		contentPane.add(btnCadastrarVendas);
		
		textField = new JTextField();
		textField.setBounds(786, 21, 297, 39);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
