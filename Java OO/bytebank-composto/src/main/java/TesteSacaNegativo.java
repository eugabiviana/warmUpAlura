public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));



//        //proibido, não quero que meu código faça isso, por motivo de segurança:
//        conta.saldo = conta.saldo - 101;
//        System.out.println(conta.saldo);

        conta.saca(101);
        System.out.println(conta.getSaldo());

    }
}
