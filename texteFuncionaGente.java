public class texteFuncionaGente {
    public static void main(String[] args) {
        Funcionario welberson = new Funcionario();

        welberson.setNome("Robeson");
        welberson.setSalario(3500);
        

        System.out.println("Exibir detalhes de " + welberson.getNome() + ":");
        System.out.println("\nSalario: " + welberson.getSalario());

         gerente jonas = new gerente();

        jonas.setNome("Jonas");
        jonas.setSalario(3500);
        jonas.setDepartamento("Finanças");
        
        

        System.out.println("\nExibir detalhes de " + jonas.getNome() + ":");
        System.out.println("\nSalario: " + jonas.getSalario());
        System.out.println("Departamento de: " + jonas.getdepartamento());
        jonas.gerenciar();
        
        
    }
}
