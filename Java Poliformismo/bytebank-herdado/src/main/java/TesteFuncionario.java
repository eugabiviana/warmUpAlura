public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente gabi = new Gerente();
        gabi.setNome("Gabi");
        gabi.setCpf("999999999-88");
        gabi.setSalario(5000);

        System.out.println(gabi.getNome() + " recebe de bonificação: R$" + gabi.getBonificacao());


    }
}
