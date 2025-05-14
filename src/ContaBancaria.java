public class ContaBancaria {

    // encapsulamento
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter para obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Setter para modificar o número da conta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para realizar um depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // metodo de saque
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

}
