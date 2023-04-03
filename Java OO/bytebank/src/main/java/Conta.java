public class Conta{
    //atributos: 
    double saldo;
    int agencia;
    int numero;
    String titular;

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
}

//As cores de saldo e valor diferem, porque saldo é um ATRIBUTO da classe Conta e valor é uma VARIÁVEL temporária, ou seja,
// fechou o } ela "morre";
//this se refere ao ATRIBUTO SALDO da Classe! Por isso usamos no método, para deixar isso claro!