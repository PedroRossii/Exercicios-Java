public class Produto {
    
    String nome;
    int codigo;
    int quantidade;
    float preco;

    Produto(String nm, int cod, int qtd, float prc){

        this.nome = nm;
        this.codigo = cod;
        this.quantidade = qtd;
        this.preco = prc;

    }

    void atualizarQuantidade(int qtd2){
        this.quantidade = qtd2;
    }

}
