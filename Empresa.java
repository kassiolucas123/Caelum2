package Capitulo04;

public class Empresa {
	Funcionario[] empregados;
	private String cnpj;
	private int contador = 0;
	
	

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public String getCnpj() {
		return cnpj;
	}

	void adicionaFuncionario(Funcionario f) {
		if (contador < empregados.length) {
			this.empregados[contador] = f;
			f = new Funcionario();
			contador++;
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionario na posição" + i + ", nome: " + empregados[i].getNome() + ", saldo: " + empregados[i].getSalario());
		} 
	}

	public boolean contemFuncioanrio(Funcionario f) {
		for (int i = 0; i < empregados.length; i++){
			if (empregados[i].getNome().equals(f.getNome())){
				System.out.println("Usuario ja cadastrado");
				break;
			}
		}
		return false;
		
	}
	
	//public void aumentar() {
	//	Funcionario[] novosEmpregados = new Funcionario[this.empregados.length * 2];
	//	
	//	for (int i = 0; i < contador; i++) {
	//		novosEmpregados[i] = empregados[i];	
	//	}
	//}
}
