public class Conta{
    //atributos: 
    double saldo;
    int agencia;
    int numero;
    String titular;

    //Criando um método
    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
}

//As cores de saldo e valor diferem, porque saldo é um ATRIBUTO da classe Conta e valor é uma VARIÁVEL temporária, ou seja,
// fechou o } ela "morre";
//this se refere ao ATRIBUTO SALDO da Classe! Por isso usamos no método, para deixar isso claro!