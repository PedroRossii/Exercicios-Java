import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEx4 {
    public static void main(String[] args) {

        List<Jogador> jogadores = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        int op;

        char continuarProg;
        
        do{
			
			do{
				
				System.out.println("Digite: ");
				System.out.println("[1] Para adicionar um novo jogador");
				System.out.println("[2] Para aumentar a pontuação de um jogador");
				System.out.println("[3] Para aumentar o nível de um jogador");
                System.out.println("[4] Para exibir informações de um jogador");
		
				op = Integer.parseInt(leitor.nextLine());

			}while((op < 1) || (op > 4));

            switch(op){
	
				case 1:

                    char addConta;

                    do{

                        String nomeAux;
                        double pontuacaoAux;
                        int nivelAux;

                        System.out.println("Digite o nome do jogador: ");
                        nomeAux = leitor.nextLine();

                        System.out.println("Digite a pontuação do jogador: ");
                        pontuacaoAux = Double.parseDouble(leitor.nextLine());

                        System.out.println("Digite o nivel do jogador: ");
                        nivelAux = Integer.parseInt(leitor.nextLine());

                        Jogador j1 = new Jogador(nomeAux, pontuacaoAux, nivelAux);

                        jogadores.add(j1);

                        System.out.println("Jogador cadastrado com sucesso!!");

                        do {

                            System.out.println("Quer adicionar mais jogadores?[S/N]: ");
                            addConta = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addConta != 's') && (addConta != 'S') && (addConta != 'n') && (addConta != 'N'));

                    }while((addConta == 's') || (addConta == 'S'));
        
				break;

                case 2:

                    String nomeAux2;
					int encontrado = 0;
					
					System.out.println("Digite o nome do jogador que deseja aumentar a pontuação: ");
                    nomeAux2 = leitor.nextLine();

					for(int i = 0; i < jogadores.size(); i++){
						
						if(jogadores.get(i).nome.contains(nomeAux2)){

							System.out.println("Pontuação antiga do jogador " + jogadores.get(i).nome + ": " + jogadores.get(i).pontuacao);

                            jogadores.get(i).aumentarPontuacao();

                            System.out.println("Pontuação atual do jogador " + jogadores.get(i).nome + ": " + jogadores.get(i).pontuacao);

							encontrado++;
							
						}
						
					}

					if(encontrado == 0){
						System.out.println("Jogador não encontrado!!");
					}

				break;

                case 3:

                    String nomeAux3;
                    int encontrado2 = 0;
                    
                    System.out.println("Digite o nome do jogador que deseja aumentar o nível: ");
                    nomeAux3 = leitor.nextLine();

                    for(int i = 0; i < jogadores.size(); i++){
                        
                        if(jogadores.get(i).nome.contains(nomeAux3)){

                            System.out.println("Nível antigo do jogador " + jogadores.get(i).nome + ": " + jogadores.get(i).nivel);

                            jogadores.get(i).aumentarNivel();

                            System.out.println("Nível atual do jogador " + jogadores.get(i).nome + ": " + jogadores.get(i).nivel);

                            encontrado2++;
                            
                        }
                        
                    }

                    if(encontrado2 == 0){
                        System.out.println("Jogador não encontrado!!");
                    }

                break;

                case 4:

                    String nomeAux4;
                    int encontrado3 = 0;
                    
                    System.out.println("Digite o nome do jogador que deseja exibir as informações: ");
                    nomeAux4 = leitor.nextLine();

                    for(int i = 0; i < jogadores.size(); i++){
                        
                        if(jogadores.get(i).nome.contains(nomeAux4)){

                            jogadores.get(i).exibirInfo();

                            encontrado3++;
                            
                        }
                        
                    }

                    if(encontrado3 == 0){
                        System.out.println("Jogador não encontrado!!");
                    }

                break;    

            }    
			
	
			System.out.println("Deseja continuar a execução do programa?[S/N]");
			continuarProg = leitor.next().charAt(0);
			leitor.nextLine();
			
		}while((continuarProg == 's') || (continuarProg == 'S'));

    }
}
