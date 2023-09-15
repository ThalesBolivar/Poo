
package Investimento;

public class Investimento {

    private double investimentoInicial;
    private double taxaRendimento;
    private int numeroMeses;

    public Investimento(double investimentoInicial, double taxaRendimento, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numeroMeses = numeroMeses;
    }

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void calcularRendimento() {
        double montante = investimentoInicial * Math.pow(1 + taxaRendimento / 100, numeroMeses);
        double rendimento = montante - investimentoInicial;

        System.out.printf("Após %d meses, o rendimento será de: R$ %.2f%n", numeroMeses, rendimento);



    }
}






