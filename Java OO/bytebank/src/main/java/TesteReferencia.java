public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " +primeiraConta.saldo);

        //nesse caso NÃO CRIO uma segunda conta! A segunda conta só referencia à primeira, ela nem copia os valores.
        //Aqui, só aponto a segunda conta para os valores da primeira. Só tenho UM objeto, já que NÃO CRIEI nada novo!
        Conta segundaConta = primeiraConta;
        System.out.println("Salda da Segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Somando 100 à segundaConta.saldo: " + segundaConta.saldo);
        //Como a segundaConta é uma REFERÊNCIA à primeiraConta, o valor da primeira passa a ser 400 também, porque só
        // tenho UMA CONTA CRIADA!
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        //teste se as contas são a mesma:
        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta!"); //agora fazendo o MESMO teste em CriaConta
        }

    }
}
