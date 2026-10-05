public class textaCarro {
    public static void main(String[] args) {
        carro welberson = new carro();

        welberson.getmarca();
        welberson.getmodelo();
        welberson.getportas();
        

        System.out.println("Exibir detalhes:");
        System.out.println("\nTítulo: " + welberson.getmarca());
        System.out.println("Autor: " + welberson.getmodelo());
        System.out.println("Páginas: " + welberson.getportas());
    }
}
