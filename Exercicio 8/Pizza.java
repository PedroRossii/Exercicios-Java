public class Pizza {
    
    String nome;
    float valor;
    String ingredientes[];

    Pizza(String nm, float vl, String... ingre){

        this.nome = nm;
        this.valor = vl;
        this.ingredientes = ingre;

    }

}
