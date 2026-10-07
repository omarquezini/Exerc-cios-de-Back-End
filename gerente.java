public class gerente extends Funcionario{
    private String departamento;

    public String getdepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void gerenciar(){
        System.out.print("O gerente " + this.nome + " está gerenciando o departamento:" + this.departamento);
    }
}
