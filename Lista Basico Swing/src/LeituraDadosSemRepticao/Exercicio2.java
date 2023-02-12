package LeituraDadosSemRepticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade: "));
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
	}
}
