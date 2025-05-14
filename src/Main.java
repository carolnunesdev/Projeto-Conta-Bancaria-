public class Main {
    public static void main(String[] args) {

        // criação primeira conta
        ContaBancaria c1 = new ContaBancaria(1345, "Ana Silva", 500.0);

        // mostrar saldo inicial
        System.out.println("Saldo inicial (c1): " + c1.getSaldo());
        // realização de deposito
        c1.depositar(150.0);
        System.out.println("Após depósito de 150: " + c1.getSaldo());
        // tentativa de saque com saldo insuficiente
        boolean ok1 = c1.sacar(700.0);
        if (ok1) {
            System.out.println("Saque de 700 realizado com sucesso.");
        } else {
            System.out.println("Saque de 700 falhou por saldo insuficiente.");
        }

        System.out.println("Saldo final (c1): " + c1.getSaldo());
        System.out.println();
        // criação segunda conta
        ContaBancaria c2 = new ContaBancaria(525, "Carlos Lima", 300.0);
        System.out.println("Saldo inicial (c2): " + c2.getSaldo());
        // realização de deposito
        c2.depositar(200.0);
        System.out.println("Após depósito de 200: " + c2.getSaldo());
        // realização de saque
        boolean ok2 = c2.sacar(100.0);
        if (ok2) {
            System.out.println("Saque de 100 realizado com sucesso.");
        } else {
            System.out.println("Saque de 100 falhou por saldo insuficiente.");
        }

        System.out.println("Saldo final (c2): " + c2.getSaldo());
    }

}
