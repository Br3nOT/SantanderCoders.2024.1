package org.example;
public class ContaPoupanca extends Conta {

    protected double rendimentoMensal = 0.005;
    protected double rendimentoAposUmAno = Math.pow((1 + rendimentoMensal), 12);

    public ContaPoupanca(String numeroDaConta, String dataDeAbertura, double saldo, int agencia) {
        super(numeroDaConta, dataDeAbertura, saldo, agencia);
    }

    public void saldoContaPoupanca() {

        System.out.printf("Com o saldo de: R$ " + getSaldo() + ". O rendimento em 12 meses sera de:%.2f" , rendimentoAposUmAno * 100);

    }

    @Override
    public String toString() {
        return "ContaPoupanca [rendimentoMensal= 0,5%" + ", rendimentoAposUmAno=" + rendimentoAposUmAno + " " + super.toString() + "]";
    }
}
