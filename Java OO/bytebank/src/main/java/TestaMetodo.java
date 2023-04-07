public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;

        //Método deposita
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        //Método saca
        boolean conseguiuRetirar = contaDoPaulo.saca(25);
        System.out.println("Saque feito! Seu saldo é: " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        //Método transfere
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

//        contaDaMarcela.transfere(300, contaDoPaulo);
        //outra forma de escrever
//        if (contaDaMarcela.transfere(300, contaDoPaulo)){
//            System.out.println("Transferência com sucesso!");
//        } else {
//            System.out.println("Saldo insuficiente!");
//        }

        //mais outra forma de escrever:
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        if (sucessoTransferencia){
            System.out.println("Transferido com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }


        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }
}

//esse if funciona, porque ele é um método boolean!
