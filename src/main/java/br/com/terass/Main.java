package br.com.terass;

import br.com.terass.dao.FuncionarioDAO;
import br.com.terass.model.Funcionario;
import br.com.terass.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();
        FuncionarioService service = new FuncionarioService();

        Funcionario novo = new Funcionario();
        novo.setNome("Arthur Alves");
        novo.setCargo("Desenvolvedor Back-End");
        novo.setSalario(20000);

        try {
            service.cadastrar(novo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro :" + e.getMessage());
        }
        System.out.println("Funcionários ativos: ");
        service.listarTodos().forEach(f ->
                System.out.println(
                        f.getId() + " | " +
                        f.getNome() + " | " +
                        f.getCargo() + " | R$ " +
                        f.getSalario()
                )
        );
    }
}
