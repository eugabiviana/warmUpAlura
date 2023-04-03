public class CriaConta {
    public static void main(String[] args) {
        //instancialização/ inicialização através do new
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunra conta: " + segundaConta.saldo);

        //por padrão, o Java cria tudo zerado
        System.out.println("Saldo da primeira conta: " + primeiraConta.agencia);


    }
}
