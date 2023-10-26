package exercicio2;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }

    public void bonificar(double aumento) {
        this.salario += aumento;
    }

    public void demitir() {
        this.estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());

        System.out.println("Está na empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
    }
}
