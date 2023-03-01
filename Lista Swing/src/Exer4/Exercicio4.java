package Exer4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(10, 47, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(10, 22, 46, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(378, 22, 46, 14);
		contentPane.add(lblY);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(338, 47, 86, 20);
		contentPane.add(txtNumero2);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.setBounds(95, 85, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnSubtracao = new JButton("Subtração");
		btnSubtracao.setBounds(251, 85, 89, 23);
		contentPane.add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("Multiplicação");
		btnMultiplicacao.setBounds(232, 134, 108, 23);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("Divisão");
		btnDivisao.setBounds(95, 134, 89, 23);
		contentPane.add(btnDivisao);
		
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numeroTxt1 = txtNumero1.getText();
				String numeroTxt2 = txtNumero1.getText();
				
				Double numero1 = Double.parseDouble(numeroTxt1);
				Double numero2 = Double.parseDouble(numeroTxt2);
				
				Double soma = numero1 + numero2;
				System.out.println(soma);
;				
			}
		});
		
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroTxt1 = txtNumero1.getText();
				String numeroTxt2 = txtNumero1.getText();
				
				Double numero1 = Double.parseDouble(numeroTxt1);
				Double numero2 = Double.parseDouble(numeroTxt2);
				
				Double soma = numero1 - numero2;
				System.out.println(soma);
;				
			}
		});
		
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroTxt1 = txtNumero1.getText();
				String numeroTxt2 = txtNumero1.getText();
				
				Double numero1 = Double.parseDouble(numeroTxt1);
				Double numero2 = Double.parseDouble(numeroTxt2);
				
				Double soma = numero1 / numero2;
				System.out.println(soma);
;				
			}
		});
		
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroTxt1 = txtNumero1.getText();
				String numeroTxt2 = txtNumero1.getText();
				
				Double numero1 = Double.parseDouble(numeroTxt1);
				Double numero2 = Double.parseDouble(numeroTxt2);
				
				Double soma = numero1 * numero2;
				System.out.println(soma);
;				
			}
		});
	}

}
