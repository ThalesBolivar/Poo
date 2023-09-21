package br.com.banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(long n, double limite) {
        super(n);
        if (limite > 0)
         this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public boolean sacar(double v){
        if (v>0 && ((saldo + limite - v ) >= 0) ){
            saldo = saldo - v;
            return true;
        }
        else
            return false;
    }
    public double consultarSaldoTotal(){
        return(saldo + limite);
    }
} // Fim da classe Conta Corrente.


