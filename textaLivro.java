

public class textaLivro {

    public static void main(String[] args) {
        livro welberson = new livro();

        welberson.setTitulo("I Have No Mouth, and I Must Scream");
        welberson.setAutor("Harlan Ellison");
        welberson.setPaginas(20);

        System.out.println("Exibir detalhes:");
        System.out.println("\nTítulo: " + welberson.getTitulo());
        System.out.println("Autor: " + welberson.getAutor());
        System.out.println("Páginas: " + welberson.getPaginas());
    }
}