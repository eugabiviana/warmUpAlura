public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        //Isso  não funciona mais, por causa do encapsulamento:
//        conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
    }
}
