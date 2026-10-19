public class TesteProduto {
 
    public static void main(String[] args) {
        produto welberson = new produto();

        welberson.setNome("churrasqueira");
        welberson.setPreco(200);
        

        System.out.println("Exibir detalhes:");
        System.out.println("\n Nome:" + welberson.getNome());
        welberson.adicionarEstoque(300);
        welberson.removerEstoque(200);
        System.out.println("\n estoque" + welberson.getQuantidadeEstoque());
        System.out.println("\n preço:" + welberson.getPreco());

        


        
    }

}
