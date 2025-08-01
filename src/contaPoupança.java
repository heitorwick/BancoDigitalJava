public class contaPoupança extends Conta {

    public contaPoupança(Cliente cliente) {
        super(cliente); // Chama o construtor da classe pai (Conta)
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns(); // Reutiliza o método da classe pai
    }
}