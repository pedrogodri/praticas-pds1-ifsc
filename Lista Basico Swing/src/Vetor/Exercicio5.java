package Vetor;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		Integer maior = Integer.MIN_VALUE; 
		Integer menor = Integer.MAX_VALUE;
		Integer[] vetor = new Integer[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor: "));
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
			
		}
		JOptionPane.showMessageDialog(null, "Maior = " + maior + "\nMenor = " + menor);
	}

}
