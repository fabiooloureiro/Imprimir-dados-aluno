package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Aluno {
	
	private Integer idAluno;
	private String nome;
	private String matricula;
	private String cpf;
	public void cadastraraluno() {
		// TODO Auto-generated method stub
		
	}

}
