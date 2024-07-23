package exercModificadores;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    int getNumeroConta() {
        return numeroConta;
    }

    double getSaldo() {
        return saldo;
    }

    String getTitular() {
        return titular;
    }

    void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void setTitular(String titular) {
        this.titular = titular;
    }

}
