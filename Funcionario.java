package Capitulo04;
//exercicio 4.2 - Orientação a objetos

import org.omg.Messaging.SyncScopeHelper;

public class Funcionario {
	private String nome;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	public String Funcionario(String nome) {
		return this.nome = nome;
	}
	
	public Funcionario(){
		//construtor sem argumentos;
	}

		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	//void mostra() {
	//	System.out.println("Nome :" + nome);
	//	System.out.println("Salario: " + salario);
	//	System.out.println(this.dataEntrada.dia + ":" + this.dataEntrada.mes + ":" + this.dataEntrada.ano);
	//}
}
