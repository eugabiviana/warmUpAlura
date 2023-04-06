public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "999.999.999-99";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome); //aqui mostra o nome do cliente
        System.out.println(contaDoPaulo.titular); //aqui mostra o endereço criado pelo Java
        System.out.println(paulo); //aqui mostra a mesma coisa que o anterior, pois só criei um cliente
        System.out.println(paulo.cpf); //posso referenciar com o nome da variável paulo
    }
}
