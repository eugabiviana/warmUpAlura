public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Dani");
        g1.setSalario(5000);
        g1.setCpf("888888888-88");
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        //testando a senha
        g1.setSenha(12345);
        boolean autenticou = g1.autentica(12345);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());



    }
}
