package LeituraDadosComRepticao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		Integer dados;
		for (int i = 0; i < 10; i++) {
			dados = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor: "));
			JOptionPane.showMessageDialog(null, "Dado " + (i+1) + ": " + dados);
		}

	}

}
