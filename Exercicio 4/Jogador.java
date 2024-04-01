public class Jogador {
    
    String nome;
    double pontuacao;
    int nivel;

    Jogador(String name, double pont, int nvl){

        this.nome = name;
        this.pontuacao = pont;
        this.nivel = nvl;

    }

    void exibirInfo(){

        System.out.println("Nome jogador: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);

    }

    void aumentarPontuacao(){

        int aumentar = 10;

        this.setPontuacao(this.getPontuacao() + aumentar);

    }

    void aumentarNivel(){

        this.setNivel(this.getNivel() + 1);
        
    }

    void setPontuacao(double pont){

        this.pontuacao = pont;

    }

    void setNivel(int nvl){
        
        this.nivel = nvl;

    }

    double getPontuacao(){

        return this.pontuacao;

    }

    int getNivel(){

        return this.nivel;

    }

}
