import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainEx5 {
    public static void main(String[] args) {
        
        List<Carro> carros = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        int op;

        char continuarProg;
        
        do{
			
			do{
				
				System.out.println("Digite: ");
				System.out.println("[1] Para adicionar um novo carro");
				System.out.println("[2] Para acelerar um carro");
				System.out.println("[3] Para frear um carro");
                System.out.println("[4] Para exibir informações de um carro");
		
				op = Integer.parseInt(leitor.nextLine());

			}while((op < 1) || (op > 4));

            switch(op){
	
				case 1:

                    char addCarro;

                    do{

                        String marcaAux, modeloAux, placaAux;
                        int anoAux;

                        System.out.println("Digite a marca do carro: ");
                        marcaAux = leitor.nextLine();

                        System.out.println("Digite o modelo do carro: ");
                        modeloAux = leitor.nextLine();

                        System.out.println("Digite o ano do carro: ");
                        anoAux = Integer.parseInt(leitor.nextLine());

                        System.out.println("Digite a plca do carro: ");
                        placaAux = leitor.nextLine();

                        Carro c1 = new Carro(marcaAux, modeloAux, anoAux, placaAux);

                        carros.add(c1);

                        System.out.println("Carro cadastrado com sucesso!!");

                        do {

                            System.out.println("Quer adicionar mais carros?[S/N]: ");
                            addCarro = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addCarro != 's') && (addCarro != 'S') && (addCarro != 'n') && (addCarro != 'N'));

                    }while((addCarro == 's') || (addCarro == 'S'));
        
				break;

                case 2:

                    String placaAux2;
					int encontrado = 0;
					
					System.out.println("Digite a placa do carro que deseja acelerar: ");
                    placaAux2 = leitor.nextLine();

					for(int i = 0; i < carros.size(); i++){
						
						if(carros.get(i).placa.contains(placaAux2)){

							System.out.println("Velocidade antiga do carro " + carros.get(i).marca + " " + carros.get(i).modelo + ": " + carros.get(i).velocidadeAtual);

                            carros.get(i).acelerar();

                            System.out.println("Velocidade atual do carro " + carros.get(i).marca + " " + carros.get(i).modelo + ": " + carros.get(i).velocidadeAtual);

							encontrado++;
							
						}
						
					}

					if(encontrado == 0){
						System.out.println("Carro não encontrado!!");
					}

				break;

                case 3:

                    String placaAux3;
                    int encontrado2 = 0;
                    
                    System.out.println("Digite a placa do carro que deseja frear: ");
                    placaAux3 = leitor.nextLine();

                    for(int i = 0; i < carros.size(); i++){
                        
                        if(carros.get(i).placa.contains(placaAux3)){

                            System.out.println("Velocidade antiga do carro " + carros.get(i).marca + " " + carros.get(i).modelo + ": " + carros.get(i).velocidadeAtual);

                            carros.get(i).frear();

                            System.out.println("Velocidade atual do carro " + carros.get(i).marca + " " + carros.get(i).modelo + ": " + carros.get(i).velocidadeAtual);

                            encontrado2++;
                            
                        }
                        
                    }

                    if(encontrado2 == 0){
                        System.out.println("Carro não encontrado!!");
                    }

                break;

                case 4:

                String placaAux4;
                int encontrado3 = 0;
                
                System.out.println("Digite a placa do carro que deseja exibir as informações: ");
                placaAux4 = leitor.nextLine();

                for(int i = 0; i < carros.size(); i++){
                    
                    if(carros.get(i).placa.contains(placaAux4)){

                        carros.get(i).exibirInfoCarro();

                        encontrado3++;
                        
                    }
                    
                }

                if(encontrado3 == 0){
                    System.out.println("Carro não encontrado!!");
                }
                break;    

            }    
			
	
			System.out.println("Deseja continuar a execução do programa?[S/N]");
			continuarProg = leitor.next().charAt(0);
			leitor.nextLine();
			
		}while((continuarProg == 's') || (continuarProg == 'S'));



    }
}
