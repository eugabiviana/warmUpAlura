//Editor de vídeo é um Funcionário, e por isso, HERDA da classe Funcionario.
public class EditorVideo extends Funcionario{

    //Método
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do Editor de Vídeos");
        return 150;
    }

}

