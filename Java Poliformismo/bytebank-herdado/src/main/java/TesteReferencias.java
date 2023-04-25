public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Regious");
        String nome = g1.getNome();

        g1.autentica(22222);

        System.out.println(nome);


    }
}
/* COMENTÁRIOS:
- Posso criar o Gerente de duas formas:
       -> Gerente g1 = new Gerente(); e
       -> Funcionario g1 = new Gerente();
A segunda forma é possível, porque todo gerente é um funcionário.
Porém, não posso fazer o inverso:

        -> Gerente g1 = new Funcionario();

Porque nem todo funcionário é um gerente! Mas ao criar um Gerente instanciando a classe Funcionario, não consigo chamar
método que estejam APENAS na classe Gerente, como é o caso do método autentica, pois ele só existe em Gerente e não em
Funcionario.
A essa possibilidade de diferentes formas de criar um Gerente, damos o nome de Polimorfismo!


 */