package Capitulo04;

import javax.swing.JOptionPane;

public class TestaFibonacci {
	public static void main(String[] args) {
		String armazenar = " ";
		String aux = JOptionPane.showInputDialog("Quantos termos: ");
		int n = Integer.parseInt(aux);
		for (int i =0; i < n; i++){
			armazenar += Fibonacci.fibonacci(i) + " ";
		}
		
		
		JOptionPane.showMessageDialog(null, armazenar);
	}
}
