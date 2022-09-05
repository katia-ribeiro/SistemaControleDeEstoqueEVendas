package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listas frame = new Listas();
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
	public Listas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloListas = new JLabel("Listas Produtos, Estoques e Vendas");
		lblTituloListas.setFont(new Font("Arial", Font.PLAIN, 36));
		lblTituloListas.setBounds(255, 6, 586, 67);
		contentPane.add(lblTituloListas);
		
		JButton btnListasProdutos = new JButton("Listas Produtos");
		btnListasProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListasProdutos().setVisible(true);
			}
		});
		btnListasProdutos.setFont(new Font("Arial", Font.PLAIN, 28));
		btnListasProdutos.setBackground(Color.WHITE);
		btnListasProdutos.setBounds(18, 277, 334, 85);
		contentPane.add(btnListasProdutos);
		
		JButton btnListasVendas = new JButton("Listas Vendas");
		btnListasVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListasVendas().setVisible(true);
			}
		});
		btnListasVendas.setFont(new Font("Arial", Font.PLAIN, 28));
		btnListasVendas.setBackground(Color.WHITE);
		btnListasVendas.setBounds(381, 277, 334, 85);
		contentPane.add(btnListasVendas);
		
		JButton btnListasFornecedores = new JButton("Listas Fornecedores");
		btnListasFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListasFornecedores().setVisible(true);
			}
		});
		btnListasFornecedores.setFont(new Font("Arial", Font.PLAIN, 28));
		btnListasFornecedores.setBackground(Color.WHITE);
		btnListasFornecedores.setBounds(744, 277, 334, 85);
		contentPane.add(btnListasFornecedores);
	}
}
