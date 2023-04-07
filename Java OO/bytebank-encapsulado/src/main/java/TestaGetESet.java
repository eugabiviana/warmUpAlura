public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 47567);
        //Isso  não funciona mais, por causa do construtor:
//        conta.numero = 1337;
//        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo; <- assim não funciona mais, porque Cliente agora é PRIVATE!

        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo); //estou REFERENCIANDO o titular
        System.out.println("Sem o getNome após getTitular:");
        System.out.println(conta.getTitular());
        System.out.println("Com o getNome após getTitular:");
        System.out.println(conta.getTitular().getNome());

        //Em uma linha:
        conta.getTitular().setProfissao("Produtor de Eventos");
        //Agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        //Os três mostram a mesma coisa, pois são REFERENCIAS para a mesma conta:
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}
