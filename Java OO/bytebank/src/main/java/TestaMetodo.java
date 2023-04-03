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
    }
}
