public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 47567);

        //Com o construtor, não precisa mais desse código!
//        //conta está inconsistente
//        conta.setAgencia(-50);
//        conta.setNumero(-330);

        System.out.println(conta.getAgencia());
    }
}
