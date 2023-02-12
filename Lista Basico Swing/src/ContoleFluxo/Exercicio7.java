package ContoleFluxo;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		Double[] notas = new Double[3];
		Double soma = Double.valueOf(0);
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.valueOf(JOptionPane.showInputDialog("Digite a nota" + (i+1) + ":"));
			soma += notas[i];
		}
		Double media = Double.valueOf(soma/notas.length);
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado");
		}
		else if((media >=4) && (media < 6)) {
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação");
		}
		else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado");
		}
	}
}
