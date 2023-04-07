public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 47567);

        //Com o construtor, não precisa mais desse código!
//        //conta está inconsistente
//        conta.setAgencia(-50);
//        conta.setNumero(-330);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 50987);
        Conta conta3 = new Conta(1337, 60980);

        System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
    }
}
