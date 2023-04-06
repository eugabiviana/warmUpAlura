public class testaClienteSemConta {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);

        contaDaMarcela.titular = new Cliente();//sem criar o cliente, dá nullpointerexception
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
