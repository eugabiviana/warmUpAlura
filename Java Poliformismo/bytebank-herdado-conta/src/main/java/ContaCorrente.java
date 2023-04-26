public class ContaCorrente extends Conta{

    //Construtor específico da Classe mãe
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }
}

/*
- Quando você extende uma Classe, você herda os MÉTODOS, mas não os CONSTRUTORES! Estes são exclusivos de cada Classe.
Por isso a Classe começou com um erro quando extendi de Conta. Preciso copiar o construtor pra cá! Trouxe o Construtor
específico! O programa já cria pra mim.
 */
