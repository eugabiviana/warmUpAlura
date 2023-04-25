public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Regious");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());



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

- Aqui criamos os funcionários a partir da classe Funcionario para poder usar o Poliformismo no controle de bonificação.
Faço o registro do funcionário em um método geral e o programa calcula de acordo com a classe do funcionário.

 */