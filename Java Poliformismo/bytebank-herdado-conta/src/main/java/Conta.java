public abstract class Conta {
    //atributos:
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas; //static quer dizer da CLASSE Conta, não do objeto! Estou criando essa variável
    // para somar as contas quando elas forem abertas na agencia.


    //Criando um método
    public abstract void deposita(double valor);

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false; //<- posso ocultar o else{}, pois ele já vai cair aqui se não acontecer o if de cima, porque o
        //return encerra o método!
    }

    //Constructor - dita a regra de criação do objeto.
    public Conta(int agencia, int numero){
        Conta.totalDeContas++; //soma das contas abertas. Posso escrever sem o 'Conta.', mas assim é melhor pra entender do que se trata.
        System.out.println("O total de contas abertas no banco é: " + Conta.totalDeContas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando a conta de número: " + this.numero);
    }
    //Getters and Setters
    //método obrigatório para ver o saldo, já que agora a variável é PRIVATE!
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
       if (numero <= 0){
           System.out.println("Número inválido! Menor ou igual a Zero.");
           return;
       }
        this.numero = numero;
        //numero é variável TEMPORÁRIA! por isso pode ter o mesmo nome do atributo, mas são coisas doferentes! Tanto é
        // que têm cores diferentes.
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Número inválido! Menor ou igual a Zero.");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}

//As cores de saldo e valor diferem, porque saldo é um ATRIBUTO da classe Conta e valor é uma VARIÁVEL temporária, ou seja,
// fechou o } ela "morre";
//this se refere ao ATRIBUTO SALDO da Classe! Por isso usamos no método, para deixar isso claro!