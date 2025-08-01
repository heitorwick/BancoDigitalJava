public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        interfaceConta cc = new contaCorrente(venilton);
        interfaceConta poupanca = new contaPoupança(venilton);

        System.out.println("Depositando 100 na Conta Corrente...");
        cc.depositar(100);

        System.out.println("Transferindo 100 da Conta Corrente para a Poupança...");
        cc.transferir(100, poupanca);

        System.out.println("\n--- EXTRATOS FINAIS ---");
        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}