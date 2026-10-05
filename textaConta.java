public class textaConta {
    public static void main(String[] args) {
        contaBancaria welberson = new contaBancaria();

        welberson.setTitular("Diretor");
        welberson.getSaldo();
        welberson.depositar(1000);
        welberson.depositar(1000);
        welberson.depositar(1000);
        welberson.depositar(1000);
        welberson.depositar(1000);
        welberson.depositar(1000);
        welberson.sacar(1000);
        welberson.sacar(1000);
        welberson.sacar(1000);


        System.out.println("Exibir detalhes:");
        System.out.println("\nTituar: " + welberson.getTitular());
        System.out.println("Saldo: " + welberson.getSaldo());

        
    }
}
