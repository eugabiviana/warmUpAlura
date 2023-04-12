//Genrente é um Funcionário, e por isso, HERDA da classe Funcionario.
public class Gerente extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }
        return false;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    //Método
//    public double getBonificacao(){
//        return this.salario;
//    }

}
