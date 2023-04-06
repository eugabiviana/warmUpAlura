public class Conta {
    //atributos:
   private double saldo;
   private int agencia;
   private int numero;
    Cliente titular;

    //Criando um método
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false; //<- posso ocultar o else{}, pois ele já vai cair aqui se não acontecer o if de cima, porque o
        //return encerra o método!
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
        this.numero = numero;
        //numero é variável TEMPORÁRIA! por isso pode ter o mesmo nome do atributo, mas são coisas doferentes! Tanto é
        // que têm cores diferentes.
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}

//As cores de saldo e valor diferem, porque saldo é um ATRIBUTO da classe Conta e valor é uma VARIÁVEL temporária, ou seja,
// fechou o } ela "morre";
//this se refere ao ATRIBUTO SALDO da Classe! Por isso usamos no método, para deixar isso claro!