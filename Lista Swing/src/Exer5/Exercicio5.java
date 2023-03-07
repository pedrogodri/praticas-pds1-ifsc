package Exer5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtH;
	private JTextField txtCA;
	private JTextField txtCO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtH = new JTextField();
		txtH.setBounds(10, 58, 86, 20);
		contentPane.add(txtH);
		txtH.setColumns(10);

		txtCA = new JTextField();
		txtCA.setBounds(338, 58, 86, 20);
		contentPane.add(txtCA);
		txtCA.setColumns(10);

		txtCO = new JTextField();
		txtCO.setBounds(172, 58, 86, 20);
		contentPane.add(txtCO);
		txtCO.setColumns(10);

		JLabel lblH = new JLabel("H");
		lblH.setBounds(10, 42, 46, 14);
		contentPane.add(lblH);

		JLabel lblNewLabel = new JLabel("CO");
		lblNewLabel.setBounds(172, 42, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CA");
		lblNewLabel_1.setBounds(338, 42, 46, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnDescobrir = new JButton("Descubra");
		btnDescobrir.setBounds(172, 158, 89, 23);
		contentPane.add(btnDescobrir);

		JLabel lblNewLabel_2 = new JLabel("Qual tipo de triangulo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(148, 133, 139, 14);
		contentPane.add(lblNewLabel_2);

		btnDescobrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorHTxt = txtH.getText();
				String valorCOTxt = txtCO.getText();
				String valorCATxt = txtCA.getText();

				if (valorHTxt.isEmpty() || valorCOTxt.isEmpty() || valorCATxt.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campo não preenchido");

				} else {

					Double valorH = Double.valueOf(valorHTxt.trim());
					Double valorCO = Double.valueOf(valorCOTxt.trim());
					Double valorCA = Double.valueOf(valorCATxt.trim());

					if ((valorH.equals(valorCO)) && (valorCO.equals(valorCA))) {
						JOptionPane.showMessageDialog(null, "Triãngulo Equilátero ");
					} else if (valorH.equals(valorCO) || valorH.equals(valorCA) || valorCO.equals(valorCA)) {
						JOptionPane.showMessageDialog(null, "Triãngulo Isósceles");
					} else if (valorH != valorCO && valorCO != valorCA) {
						JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
					}
				}
			}

		});
	}
}
