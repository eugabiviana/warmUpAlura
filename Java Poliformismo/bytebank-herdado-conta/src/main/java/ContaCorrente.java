public class ContaCorrente extends Conta{

    //Construtor específico da Classe mãe
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}

/*
- Quando você extende uma Classe, você herda os MÉTODOS, mas não os CONSTRUTORES! Estes são exclusivos de cada Classe.
Por isso a Classe começou com um erro quando extendi de Conta. Preciso copiar o construtor pra cá! Trouxe o Construtor
específico! O programa já cria pra mim.
-  @Override: annotation para sobreescrever um método. Faz com que o compilador entenda que estou usando um método existente,
mas com novas regras. Nesse caso, defini que cada saque cobra uma taxa de R$0,20 centavos.
 */
