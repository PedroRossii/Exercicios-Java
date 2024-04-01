import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEx8 {
    public static void main(String[] args) {
        
        List<Pizza> pizzas = new ArrayList<>();

        String[] ingredientes1 = {"Queijo", "Azeitona", "Molho de tomate"};
        Pizza p1 = new Pizza("Queijo", 40, ingredientes1);
        pizzas.add(p1);

        String[] ingredientes2 = {"Calabresa", "Cebola", "Azeitona", "Molho de tomate"};
        Pizza p2 = new Pizza("Calabresa", 45, ingredientes2);
        pizzas.add(p2);

        String[] ingredientes3 = {"Frango", "Catupiry", "Azeitona", "Molho de tomate"};
        Pizza p3 = new Pizza("Frango com catupiry", 50, ingredientes3);
        pizzas.add(p3);

        String[] ingredientes4 = {"Chocolate preto", "Chocolate granulado"};
        Pizza p4 = new Pizza("Chocolate", 40, ingredientes4);
        pizzas.add(p4);

        List<Pedido> pedidos = new ArrayList<>();

        int pedidosFeitos = 0;

        Scanner leitor = new Scanner(System.in);

        int op;

        char continuarProg;
        
        do{
			
			do{
				
				System.out.println("Digite: ");
				System.out.println("[1] Para adicionar um novo pedido");
				System.out.println("[2] Para cancelar um pedido");
				System.out.println("[3] Para exibir detlhes sobre um pedido");
                System.out.println("[4] Para gerar um relatório dos pedidos: ");
		
				op = Integer.parseInt(leitor.nextLine());

			}while((op < 1) || (op > 4));

            switch(op){
	
				case 1:

                    char addPedido;
                    int pizzaEscolhida;

                    int nPedidoAux;
                    String tipoPizzaAux, enderecoAux;
                    char tamanhoAux;
                    float valorAux;
                        
                    do{

                        pedidosFeitos++;

                        nPedidoAux = pedidosFeitos;

                        System.out.println("Seu número de pedido é: " + nPedidoAux + "\n");

                        System.out.println("\n==============================");
                        System.out.println("Cardápio de Pizzas");
                        System.out.println("==============================\n");

                        do{

                            for(int i = 0; i < pizzas.size(); i++){

                                System.out.println("Digite: ");
                                System.out.println("[" + (i + 1) + "] Para " + pizzas.get(i).nome);
                                System.out.println("Valor: " + pizzas.get(i).valor);

                            }

                            pizzaEscolhida = Integer.parseInt(leitor.nextLine());

                        }while((pizzaEscolhida < 1) || (pizzaEscolhida > 4));

                        switch (pizzaEscolhida) {

                            case 1:

                               tipoPizzaAux = pizzas.get(0).nome;

                                do{

                                    System.out.println("Digite o tamanho da pizza: ");
                                    System.out.println("P: 4 pedaços");
                                    System.out.println("M: 8 pedaços");
                                    System.out.println("G: 12 pedaços");

                                    tamanhoAux = leitor.next().charAt(0);
                                    leitor.nextLine();

                                }while((tamanhoAux != 'p') && (tamanhoAux != 'P') && (tamanhoAux != 'm') && (tamanhoAux != 'M') && (tamanhoAux != 'g') && (tamanhoAux != 'G'));

                                if((tamanhoAux == 'p') || (tamanhoAux == 'P')){

                                    valorAux = (float) pizzas.get(0).valor / 2;

                                }
                                else if((tamanhoAux == 'm') || (tamanhoAux == 'M')){

                                    valorAux = pizzas.get(0).valor;

                                }
                                else{
                                    valorAux = (pizzas.get(0).valor + (pizzas.get(0).valor / 2));
                                }
                                
                                    
                                System.out.println("Digite o endereço de entrega com o número: ");
                                enderecoAux = leitor.nextLine();

                                Pedido ped1 = new Pedido(nPedidoAux, tipoPizzaAux, tamanhoAux, valorAux, enderecoAux);

                                pedidos.add(ped1);
                                
                            break;

                            case 2:

                               tipoPizzaAux = pizzas.get(1).nome;

                                do{

                                    System.out.println("Digite o tamanho da pizza: ");
                                    System.out.println("P: 4 pedaços");
                                    System.out.println("M: 8 pedaços");
                                    System.out.println("G: 12 pedaços");

                                    tamanhoAux = leitor.next().charAt(0);
                                    leitor.nextLine();

                                }while((tamanhoAux != 'p') && (tamanhoAux != 'P') && (tamanhoAux != 'm') && (tamanhoAux != 'M') && (tamanhoAux != 'g') && (tamanhoAux != 'G'));

                                if((tamanhoAux == 'p') || (tamanhoAux == 'P')){

                                    valorAux = (float) pizzas.get(1).valor / 2;

                                }
                                else if((tamanhoAux == 'm') || (tamanhoAux == 'M')){

                                    valorAux = pizzas.get(1).valor;

                                }
                                else{
                                    valorAux = (pizzas.get(1).valor + (pizzas.get(1).valor / 2));
                                }

                                System.out.println("Digite o endereço de entrega com o número: ");
                                enderecoAux = leitor.nextLine();

                                Pedido ped2 = new Pedido(nPedidoAux, tipoPizzaAux, tamanhoAux, valorAux, enderecoAux);

                                pedidos.add(ped2);
                                
                            break;

                            case 3:

                               tipoPizzaAux = pizzas.get(2).nome;

                                do{

                                    System.out.println("Digite o tamanho da pizza: ");
                                    System.out.println("P: 4 pedaços");
                                    System.out.println("M: 8 pedaços");
                                    System.out.println("G: 12 pedaços");

                                    tamanhoAux = leitor.next().charAt(0);
                                    leitor.nextLine();

                                }while((tamanhoAux != 'p') && (tamanhoAux != 'P') && (tamanhoAux != 'm') && (tamanhoAux != 'M') && (tamanhoAux != 'g') && (tamanhoAux != 'G'));

                                if((tamanhoAux == 'p') || (tamanhoAux == 'P')){

                                    valorAux = (float) pizzas.get(2).valor / 2;

                                }
                                else if((tamanhoAux == 'm') || (tamanhoAux == 'M')){

                                    valorAux = pizzas.get(2).valor;

                                }
                                else{
                                    valorAux = (pizzas.get(2).valor + (pizzas.get(2).valor / 2));
                                }

                                System.out.println("Digite o endereço de entrega com o número: ");
                                enderecoAux = leitor.nextLine();

                                Pedido ped3 = new Pedido(nPedidoAux, tipoPizzaAux, tamanhoAux, valorAux, enderecoAux);

                                pedidos.add(ped3);
                                
                            break;

                            case 4:

                               tipoPizzaAux = pizzas.get(3).nome;

                                do{

                                    System.out.println("Digite o tamanho da pizza: ");
                                    System.out.println("P: 4 pedaços");
                                    System.out.println("M: 8 pedaços");
                                    System.out.println("G: 12 pedaços");

                                    tamanhoAux = leitor.next().charAt(0);
                                    leitor.nextLine();

                                }while((tamanhoAux != 'p') && (tamanhoAux != 'P') && (tamanhoAux != 'm') && (tamanhoAux != 'M') && (tamanhoAux != 'g') && (tamanhoAux != 'G'));

                                if((tamanhoAux == 'p') || (tamanhoAux == 'P')){

                                    valorAux = (float) pizzas.get(3).valor / 2;

                                }
                                else if((tamanhoAux == 'm') || (tamanhoAux == 'M')){

                                    valorAux = pizzas.get(3).valor;

                                }
                                else{
                                    valorAux = (pizzas.get(3).valor + (pizzas.get(3).valor / 2));
                                }

                                System.out.println("Digite o endereço de entrega com o número: ");
                                enderecoAux = leitor.nextLine();

                                Pedido ped4 = new Pedido(nPedidoAux, tipoPizzaAux, tamanhoAux, valorAux, enderecoAux);

                                pedidos.add(ped4);
                                
                            break;
                
                    
                        }

                        do {

                            System.out.println("Quer adicionar mais pedidos?[S/N]: ");
                            addPedido = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addPedido != 's') && (addPedido != 'S') && (addPedido != 'n') && (addPedido != 'N'));

                    }while((addPedido == 's') || (addPedido == 'S'));
        
				break;

                case 2:

                    int nPedidoAux2;
					int encontrado = 0;
                    char remover;
					
					System.out.println("Digite o número do pedido que deseja cancelar: ");
                    nPedidoAux2 = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < pedidos.size(); i++){
						
						if(pedidos.get(i).nPedido == nPedidoAux2){

							System.out.println("Número Pedido: " + pedidos.get(i).nPedido);
                            System.out.println("Sabor da pizza: " + pedidos.get(i).tipoPizza);
                            System.out.println("Tamanho da pizza: " + pedidos.get(i).tamanho);
                            System.out.println("Valor: " + pedidos.get(i).valor);

                            System.out.println("Realmente deseja cancelar o pedido?[S/N]");
                            remover = leitor.next().charAt(0);
                            leitor.nextLine();
    
                            if((remover == 's') || (remover == 'S')){
    
                                pedidos.remove(pedidos.get(i));
    
                                System.out.println("Pedido cancelado com sucesso!");
    
                            }

							encontrado++;
							
						}
						
					}

					if(encontrado == 0){
						System.out.println("Pedido não encontrado!!");
					}

				break;

                case 3:

                    int nPedidoAux3;
					int encontrado2 = 0;
					
					System.out.println("Digite o número do pedido que deseja exibir as informações: ");
                    nPedidoAux3 = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < pedidos.size(); i++){
						
						if(pedidos.get(i).nPedido == nPedidoAux3){

							System.out.println("Número Pedido: " + pedidos.get(i).nPedido);
                            System.out.println("Sabor da pizza: " + pedidos.get(i).tipoPizza);
                            System.out.println("Tamanho da pizza: " + pedidos.get(i).tamanho);
                            System.out.println("Valor: " + pedidos.get(i).valor);
                            System.out.println("Endereço de entrega: " + pedidos.get(i).endereco);

							encontrado2++;
							
						}
						
					}

					if(encontrado2 == 0){
						System.out.println("Pedido não encontrado!!");
					}

                break;

                case 4:

                    float mediaValorPedidos = 0, somaValores = 0;

                    for(int i = 0; i < pedidos.size(); i++){

                        somaValores += pedidos.get(i).valor;

                    }

                    mediaValorPedidos = somaValores / (float) pedidos.size();

                    System.out.println("\n==============================");
                    System.out.println("     HISTÓRICO DE PEDIDOS");
                    System.out.println("==============================\n");

                    System.out.println("Total de pedidos realizados: " + pedidos.size());
                    System.out.println("Média de valor dos pedidos: " + mediaValorPedidos + "\n\n");

                    for(int i = 0; i < pedidos.size(); i++){

                        System.out.println("Número Pedido: " + pedidos.get(i).nPedido);
                        System.out.println("Sabor da pizza: " + pedidos.get(i).tipoPizza);
                        System.out.println("Tamanho da pizza: " + pedidos.get(i).tamanho);
                        System.out.println("Valor: " + pedidos.get(i).valor);
                        System.out.println("Endereço de entrega: " + pedidos.get(i).endereco + "\n");

                    }

                break;   

            }    
			
	
			System.out.println("Deseja continuar a execução do programa?[S/N]");
			continuarProg = leitor.next().charAt(0);
			leitor.nextLine();
			
		}while((continuarProg == 's') || (continuarProg == 'S'));



    }   

}
