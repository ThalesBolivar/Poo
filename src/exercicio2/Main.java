package exercicio2;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionarios = new Funcionario[5];
        listaFuncionarios[0] = new Funcionario("Thales", "thales@email.com", "1111-1111", "Financeiro", 2000.00, "01/01/2020", "12345");


        for (Funcionario f : listaFuncionarios) {
            f.mostrarDados();
        }

        Empresa empresa = new Empresa("mecmar Ltda", "12.345.678/0001-99");
        for (Funcionario f : listaFuncionarios) {
            empresa.adicionarFuncionario(f);
        }
    }
}
