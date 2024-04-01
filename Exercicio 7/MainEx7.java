import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEx7 {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
    
        Scanner leitor = new Scanner(System.in);

        int op;

        char continuarProg;
        
        do{
			
			do{
				
				System.out.println("Digite: ");
				System.out.println("[1] Para adicionar um novo produto");
				System.out.println("[2] Para alterar quantidade de um produto");
				System.out.println("[3] Para remover um produto do estoque");
                System.out.println("[4] Para gerar um relatório dos produtos disponíveis: ");
		
				op = Integer.parseInt(leitor.nextLine());

			}while((op < 1) || (op > 4));

            switch(op){
	
				case 1:

                    char addProduto;

                    do{

                        String nomeAux;
                        int codAux, qtdAux;
                        float precoAux;
                        int flag;

                        System.out.println("Digite o nome do produto: ");
                        nomeAux = leitor.nextLine();

                        do{

                            flag = 0;

                            System.out.println("Digite o código do produto: ");
                            codAux = Integer.parseInt(leitor.nextLine());

                            for(int i = 0; i < produtos.size(); i++){

                                if(produtos.get(i).codigo == codAux){

                                    System.out.println("Código de produto já utilizado!");

                                    flag++;

                                }

                            }

                        }while(flag != 0);

                        System.out.println("Digite a quantidade do produto no estoque: ");
                        qtdAux = Integer.parseInt(leitor.nextLine());

                        System.out.println("Digite o preço do produto: ");
                        precoAux = Float.parseFloat(leitor.nextLine());

                        Produto p1 = new Produto(nomeAux, codAux, qtdAux, precoAux);

                        produtos.add(p1);

                        System.out.println("Produto cadastrado com sucesso!!");

                        do {

                            System.out.println("Quer adicionar mais produtos?[S/N]: ");
                            addProduto = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addProduto != 's') && (addProduto != 'S') && (addProduto != 'n') && (addProduto != 'N'));

                    }while((addProduto == 's') || (addProduto == 'S'));
        
				break;

                case 2:

                    int codAux2, novaQtd;
					int encontrado = 0;
					
					System.out.println("Digite o código do produto que deseja alterar a quantidade: ");
                    codAux2 = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < produtos.size(); i++){
						
						if(produtos.get(i).codigo == codAux2){

							System.out.println("Produto: " + produtos.get(i).nome);
                            System.out.println("Quantidade atual: " + produtos.get(i).quantidade);

                            System.out.println("Digite a nova quantidade: ");
                            novaQtd = Integer.parseInt(leitor.nextLine());

                            produtos.get(i).atualizarQuantidade(novaQtd);

                            System.out.println("Quantidade atualizada com sucesso!");

							encontrado++;
							
						}
						
					}

					if(encontrado == 0){
						System.out.println("Produto não encontrado!!");
					}

				break;

                case 3:

                int codAux3;
                int encontrado2 = 0;
                char remover;
                
                System.out.println("Digite o código do produto que deseja remover: ");
                codAux3 = Integer.parseInt(leitor.nextLine());

                for(int i = 0; i < produtos.size(); i++){
                    
                    if(produtos.get(i).codigo == codAux3){

                        System.out.println("Produto: " + produtos.get(i).nome);
                        
                        System.out.println("Realmente deseja remover o produto?[S/N]");
                        remover = leitor.next().charAt(0);
                        leitor.nextLine();

                        if((remover == 's') || (remover == 'S')){

                            produtos.remove(produtos.get(i));

                            System.out.println("Produto removido com sucesso!");

                        }

                        encontrado2++;
                        
                    }
                    
                }

                if(encontrado2 == 0){

                    System.out.println("Produto não encontrado!!");

				}

                break;

                case 4:

                System.out.println("\n==============================");
                System.out.println("     PRODUTOS EM ESTOQUE");
                System.out.println("==============================\n");

                for(int i = 0; i < produtos.size(); i++){

                    System.out.println("Produto: " + produtos.get(i).nome);
                    System.out.println("Quantidade disponível: " + produtos.get(i).quantidade);
                    System.out.println("Valor total em estoque: R$" + ((float) produtos.get(i).quantidade * produtos.get(i).preco) + "\n");


                }

                break;   

            }    
			
	
			System.out.println("Deseja continuar a execução do programa?[S/N]");
			continuarProg = leitor.next().charAt(0);
			leitor.nextLine();
			
		}while((continuarProg == 's') || (continuarProg == 'S'));
        
    }
}
