package repositories;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Aluno;
import factories.ConnectionFactory;

public class AlunoRepository {

	private Aluno obj;

	public void create(Aluno obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection
				.prepareStatement("insert into aluno(nome, matricula, cpf) values(?, ?, ?)");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getMatricula());
		statement.setString(3, obj.getCpf());
		statement.execute();

		connection.close();
	}

	public void update(Aluno obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection
				.prepareStatement("update aluno set nome=?, matricula=?, cpf=? where idaluno=?");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getMatricula());
		statement.setString(3, obj.getCpf());
		statement.execute();

		connection.close();
	}

	public void delete(Aluno obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("delete from aluno where idaluno=?");
		statement.setInt(1, obj.getIdAluno());
		statement.execute();

		connection.close();
	}
	
	public List<Aluno> findAll(Aluno obj) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from aluno");
		ResultSet resultSet = statement.executeQuery();

		List<Aluno> lista = new ArrayList<Aluno>();

		while (resultSet.next()) {

			Aluno aluno = new Aluno();
			statement.setString(1, obj.getNome());
			statement.setString(2, obj.getMatricula());
			statement.setString(3, obj.getCpf());
			statement.execute();
			lista.add(aluno);
		}

		connection.close();
		return lista;

	}

	public Aluno findById(Integer id) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from aluno where idaluno=?");
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery();

		Aluno aluno = null;

		if (resultSet.next()) {

			aluno = new Aluno();
			statement.setString(1, obj.getNome());
			statement.setString(2, obj.getMatricula());
			statement.setString(3, obj.getCpf());

		}

		connection.close();
		return aluno;
	}


}
