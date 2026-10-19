public class produto {
    
    private String nome;
    private double  preco;
    private int quantidadeEstoque;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double  getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        if(preco > 0){
            this.preco = preco;
        }
        else{
            System.out.println("ERRO, em utras palavras tá de graça");
        }
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidade(s) adicionada(s) ao estoque.");
        } else {
            System.out.println("Erro: A quantidade para adicionar deve ser maior que zero.");
        }
    }


    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade a ser removida deve ser maior que zero.");
        } else if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidade(s) removida(s) do estoque.");
        } else {
            System.out.println("Erro: Estoque insuficiente! Estoque atual: " + this.quantidadeEstoque);
        }
    }

}
