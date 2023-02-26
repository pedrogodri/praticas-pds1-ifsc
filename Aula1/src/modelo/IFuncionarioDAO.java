package modelo;

import java.util.ArrayList;

public interface IFuncionarioDAO {

	public boolean criarFuncionario(Funcionario funcionario);

	public ArrayList<Funcionario> listarFuncionario();
}
