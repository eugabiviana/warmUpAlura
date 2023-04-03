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
        //alterando a agencia
        segundaConta.agencia = 25;
        System.out.println("Agora a segunda conta está na agência: " + segundaConta.agencia);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta!");
        } else {
            System.out.println("Não são a mesma conta!");
        }


    }
}
