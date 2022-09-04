package principal;

import controllers.AlunoController;

public class Program {

	public static void main(String[] args) {

		// instanciando a classe de controle
		AlunoController alunoController = new AlunoController();

		// executar o cadastro do fornecedor
		alunoController.cadastraraluno();

	}

}



