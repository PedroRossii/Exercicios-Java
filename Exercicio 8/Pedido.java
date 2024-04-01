public class Pedido {
    
    int nPedido;
    String tipoPizza;
    char tamanho;
    float valor;
    String endereco;

    Pedido(int nPed, String sabor, char tam, float val, String end){

        this.nPedido = nPed;
        this.tipoPizza = sabor;
        this.tamanho = tam;
        this.valor = val;
        this.endereco = end;

    }

}
