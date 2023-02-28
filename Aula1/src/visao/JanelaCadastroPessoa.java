package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;


public class JanelaCadastroPessoa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomedoFuncionario = new JLabel("Nome:");
		lblNomedoFuncionario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNomedoFuncionario.setForeground(new Color(255, 255, 255));
		lblNomedoFuncionario.setBounds(28, 28, 56, 14);
		contentPane.add(lblNomedoFuncionario);
		
		txtCPF = new JTextField();
		txtCPF.setBackground(new Color(128, 64, 64));
		txtCPF.setForeground(new Color(255, 255, 255));
		txtCPF.setBounds(102, 72, 136, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(255, 255, 255));
		txtNome.setBackground(new Color(128, 64, 64));
		txtNome.setBounds(102, 27, 136, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(28, 67, 32, 27);
		contentPane.add(lblNewLabel);
		
		FuncionarioDAO dbFuncionario = FuncionarioDAO.getInstanciaFuncionario();
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Funcionario funcionario = new Funcionario();
				
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				else {
					funcionario.setNome(nome);
				}
				
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum cpf preenchido!");
				}
				else {
					funcionario.setCpf(cpf);
				}
				
				dbFuncionario.criarFuncionario(funcionario);
				System.out.println("Salvou");
			}
		});
		btnSalvar.setBounds(28, 118, 210, 23);
		contentPane.add(btnSalvar);
		
		ArrayList<Funcionario> listaFuncionario = dbFuncionario.listarFuncionario();
		
		JButton btnListarFuncioanrio = new JButton("Listar Funcionarios");
		btnListarFuncioanrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Funcionario funcionario : listaFuncionario) {
					System.out.println("Nome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() );
				}
			}
		});
		btnListarFuncioanrio.setBounds(28, 169, 210, 23);
		contentPane.add(btnListarFuncioanrio);
		
		
	}
}
