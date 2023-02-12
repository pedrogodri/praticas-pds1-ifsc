package LeituraDadosSemRepticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		Double precoLitro = Double.valueOf(JOptionPane.showInputDialog("Digite o preço do litro: "));
		Integer qtdLitro = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de litros: "));
		Double totalPagamento = precoLitro * qtdLitro;
		JOptionPane.showMessageDialog(null, "Preço do pagamento: R$" + totalPagamento);
	}

}
