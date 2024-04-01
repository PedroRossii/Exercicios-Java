public class Carro {
    
    String marca;
    String modelo;
    int ano;
    String placa;
    int velocidadeAtual;

    Carro(String ma, String mo, int an, String plc){

        this.marca = ma;
        this.modelo = mo;
        this.ano = an;
        this.placa = plc;
        this.velocidadeAtual = 0;

    }

    void exibirInfoCarro(){

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade: " + this.velocidadeAtual + "Km/h");

    }

    void acelerar(){

        int aumentar = 5;

        this.setVelocidade(this.getVelocidade() + aumentar);

    }

    void frear(){

        int diminuir = 5;

        this.setVelocidade(this.getVelocidade() - diminuir);

    }

    void setVelocidade(int vel){

        this.velocidadeAtual = vel;

    }

    int getVelocidade(){
        
        return this.velocidadeAtual;

    }



}
