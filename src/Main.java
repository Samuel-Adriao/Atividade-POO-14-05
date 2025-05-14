public class Main {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta = new ContaBancaria();
        ContaBancaria conta1 = new ContaBancaria(1234, "Samuel", 80.00);
        ContaBancaria conta2 = new ContaBancaria(4321, "Guilherme", 120.00);

        //TESTANDO CONTA 1
        System.out.println("---------------------------------------------");
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.depositar(30.00);
        System.out.println("Saldo após um depósito de 30.00 R$: " + conta1.getSaldo());
        conta1.sacar(300.00); ///Tentativa de sacar 300.00
        System.out.println("---------------------------------------------");

        System.out.println();

        //TESTANDO CONTA 2
        System.out.println("---------------------------------------------");
        System.out.println("Saldo: " + conta2.getSaldo());
        conta2.depositar(372.25);
        System.out.println("Saldo após um depósito de 372.25: " + conta2.getSaldo());
        conta2.sacar(45.15); //Tentativa de sacar 45.15        
        System.out.println("---------------------------------------------");






    }
}
