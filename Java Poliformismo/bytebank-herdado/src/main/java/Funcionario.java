public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //Método
    public double getBonificacao(){
        return this.salario * 0.05;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

/* COMENTÁRIOS:
- Funcionário é a Classe mãe/Base class/ Super class!
- Protected - deixa visível para as classes filhas! Está "entre o public e o private" (protected double salario;).
- ao voltar a usar o private em 'protected double salario;', tenho que alterar o método em Gerente. Olhar o comentário lá!
 */