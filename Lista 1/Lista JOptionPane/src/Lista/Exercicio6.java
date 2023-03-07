package Lista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>(); 
		for (int i = 0; i < 10; i++) {
			lista.add(JOptionPane.showInputDialog("Digite um valor para a lista: "));
		}
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, "Valor " + (i+1) + ": " + lista.get(i) + "\n");
		}
		JOptionPane.showMessageDialog(null, "Valor: " + lista);
	}
}
