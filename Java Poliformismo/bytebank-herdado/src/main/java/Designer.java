//Designer é um Funcionário, e por isso, HERDA da classe Funcionario.
public class Designer extends Funcionario{

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do Designer");
        return 200;
    }

}

