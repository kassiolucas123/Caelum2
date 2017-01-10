package Capitulo04;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario novo = new Funcionario();
		Funcionario novo2 = new Funcionario();
		Data data = new Data();
		novo.dataEntrada = data;
		
		novo.setNome("kassio lucas");
		novo.setRg("36.194-92");
		novo.setSalario(100);
		
		novo.dataEntrada.dia = 10;
		novo.dataEntrada.ano = 2010;
		novo.dataEntrada.mes = 12;
		
		
		novo2.setNome("kassio lucas");
		novo2.setRg("36.194-92");
		novo2.setSalario(100);
		
		System.out.println("Salario mensal: " + novo.getSalario());
		System.out.println("Salario anual: " + novo.calculaGanhoAnual());
		//novo.mostra();
		
		if (novo == novo2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		
		Funcionario novo3 = new Funcionario();
		novo = novo3;
		
		if (novo == novo3) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		
	}
}
