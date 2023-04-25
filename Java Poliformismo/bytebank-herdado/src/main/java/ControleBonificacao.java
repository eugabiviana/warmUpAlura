public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}

/*
- Deletei os métodos que eram criados para cada tipo de funcionário e mantive apenas o genérico. Quando eu chamar o
funcionário específico, ele usará o método definido na classe do funcionário em questão.
 */