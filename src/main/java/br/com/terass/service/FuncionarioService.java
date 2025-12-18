package br.com.terass.service;

import br.com.terass.dao.FuncionarioDAO;
import br.com.terass.model.Funcionario;

public class FuncionarioService {

    private final FuncionarioDAO funcionarioDAO;

    public FuncionarioService() {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public void cadastrar(Funcionario funcionario) {

        //Validações (regra de negócio)
        if (funcionario.getNome() == null || funcionario.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome do funcionário é obrigatório.");
        }

        if (funcionario.getSalario() <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero.");
        }
        //Se passou nas regras, delega para o DAO
        funcionarioDAO.inserir(funcionario);
    }
    public List<Funcionario> listarTodos() {
        return funcionarioDAO.listar();
    }
}
