package Capitulo04;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		Funcionario kassio = new Funcionario();
		kassio.setNome("kassio");
		kassio.setSalario(1200);
		empresa.adicionaFuncionario(kassio);

		Funcionario lucas = new Funcionario();
		lucas.setNome("lucas");
		lucas.setSalario(1200);
		empresa.adicionaFuncionario(lucas);

		Funcionario leodido = new Funcionario();
		leodido.setNome("leodido");
		leodido.setSalario(1200);
		empresa.adicionaFuncionario(leodido);
		
		empresa.mostraEmpregados();		
		empresa.contemFuncioanrio(kassio);
		//empresa.aumentar();
	}
}
