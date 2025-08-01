public class contaCorrente extends Conta {

    public contaCorrente(Cliente cliente) {
        super(cliente); // Chama o construtor da classe pai (Conta)
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}