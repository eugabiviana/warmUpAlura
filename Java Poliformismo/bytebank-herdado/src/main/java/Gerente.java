//Gerente é um Funcionário, e por isso, HERDA da classe Funcionario.
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
    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }

}

/* COMENTÁRIOS:
- Classe filha, pois herda os atributos de Funcionario.
- public double getBonificacao(){ -> O método possui a mesma assinatura da Classe mãe. Isto é, a mesma visibilidade,
mesmo retorno, mesmo nome e os mesmos parâmetros de quem ele herdou.
- return super.salario; -> troca o THIS por SUPER, para identificar que o salário vem da classe mãe! Já que o this
identifica um atributo da classe em que ele se encontra!
- Posso chamar métodos na classe com o super! Isso faz com que eu evite a repetição de código e possibilita a alteração
do método em um único lugar, diminuindo a chance de erros e de esquecimento.
- Como mudei 'protected double salario;' para PRIVATE, chamo o GET da classe mãe, e não o atributo diretamente, assim,
tenho acesso à informação, mas sem diminuir a segurança do código!
 */
