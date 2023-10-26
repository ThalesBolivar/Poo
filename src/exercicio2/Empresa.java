package exercicio2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtde_de_funcionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = 0;
        this.funcionarios = new Funcionario[100];  // capacidade para 100 funcionários
    }

    public void adicionarFuncionario(Funcionario f) {
        if (qtde_de_funcionario < 100) {
            funcionarios[qtde_de_funcionario] = f;
            qtde_de_funcionario++;
        } else {
            System.out.println("Máximo de funcionários atingido.");
        }
    }
}
