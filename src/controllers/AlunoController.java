package controllers;

import javax.swing.JOptionPane;

import entities.Aluno;
import repositories.AlunoRepository;

public class AlunoController {
	
	//método para realizar o cadastro do fornecedor
	public void cadastraraluno() {
		
		try {
			
			System.out.println("\n ***CADASTRAR ALUNO *** \n");
			
			Aluno aluno = new Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog("Entre com o nome do aluno:"));
			aluno.setMatricula(JOptionPane.showInputDialog("Entre com a matricula:"));
			aluno.setCpf(JOptionPane.showInputDialog("Entre com o cpf:"));

			
			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.create(aluno);
			
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			
		}
		catch(Exception e) {
			System.out.println("\nErro:" + e.getMessage());
		}
	}

}
