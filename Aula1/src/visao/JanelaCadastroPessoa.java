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
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JButton btnLimparCampos;

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
		setBounds(100, 100, 450, 300);
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
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido");
				}
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
			}
		});


		btnSalvar.setForeground(new Color(0, 0, 255));
		btnSalvar.setBackground(new Color(255, 128, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSalvar.setBounds(102, 103, 136, 23);
		contentPane.add(btnSalvar);
		
		btnLimparCampos = new JButton("Limpar");
		btnLimparCampos.setForeground(new Color(128, 128, 255));
		btnLimparCampos.setBackground(new Color(255, 128, 192));
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtCPF.setText("");
				
			}
		});
		btnLimparCampos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimparCampos.setBounds(129, 137, 89, 23);
		contentPane.add(btnLimparCampos);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(248, 28, 176, 98);
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);
		
		JLabel lblNomePanel = new JLabel("Nome");
		lblNomePanel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomePanel.setBounds(27, 11, 127, 36);
		panelInfo.add(lblNomePanel);
		
		JLabel lblCPFPanel = new JLabel("CPF");
		lblCPFPanel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPFPanel.setBounds(27, 58, 127, 29);
		panelInfo.add(lblCPFPanel);
		
		JButton btnMostrarDados = new JButton("Mostrar Dados");
		btnMostrarDados.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMostrarDados.setForeground(new Color(128, 128, 255));
		btnMostrarDados.setBackground(new Color(255, 128, 192));
		btnMostrarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInfo.setVisible(true);
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				lblCPFPanel.setText(cpf);
				lblNomePanel.setText(nome);
				
			}
		});
		btnMostrarDados.setBounds(271, 137, 130, 23);
		contentPane.add(btnMostrarDados);
		
		panelInfo.setVisible(false);
	}
}
