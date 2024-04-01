import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEx3 {
    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();
	
		int contasCriadas = 0;

		Scanner leitor = new Scanner(System.in);

		int op;

		char continuarProg;

		do{
			
			do{
				
				System.out.println("Digite: ");
				System.out.println("[1] Para adicionar uma nova conta");
				System.out.println("[2] Para fazer um deposito");
				System.out.println("[3] Para fazer um saque");
				System.out.println("[4] Para consultar saldo de uma conta");
		
				op = Integer.parseInt(leitor.nextLine());

			}while((op < 1) || (op > 4));
			
	
			switch(op){
	
				case 1:

                    char addConta;

                    do{

                        contasCriadas ++;

                        ContaBancaria conta = new ContaBancaria();
					
                        System.out.println("Digite o nome do titular para criar a conta: ");
                        conta.nomeTitular = leitor.nextLine();

                        conta.nConta = contasCriadas;
        
                        conta.saldo = 0;
        
                        contas.add(conta);
        
                        System.out.println("Conta criada com sucesso!!");
                        System.out.println("Numero da conta: " + conta.nConta);
                        System.out.println("Saldo atual: R$" + conta.saldo);

                        do {

                            System.out.println("Quer adicionar mais contas?[S/N]: ");
                            addConta = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addConta != 's') && (addConta != 'S') && (addConta != 'n') && (addConta != 'N'));

                    }while((addConta == 's') || (addConta == 'S'));
        
				break;

				case 2:

					int contaAux, encontrado = 0;
					double valorAux;
					
					System.out.println("Digite o número da conta que deseja fazer o deposito: ");
					contaAux = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < contas.size(); i++){
						
						if(contas.get(i).nConta == contaAux){

							System.out.println("Digite o valor que deseja depositar: ");
							valorAux = Double.parseDouble(leitor.nextLine());
							contas.get(i).saldo += valorAux;

                            System.out.println("Titular da conta: " + contas.get(i).nomeTitular);
                            System.out.println("Número da conta: " + contas.get(i).nConta);
							System.out.println("Saldo atual: " + contas.get(i).saldo);

                            System.out.println("\nDepósito concluido!!");

							encontrado++;
							
						}
						
					}

					if(encontrado == 0){
						System.out.println("Conta não encontrada!!");
					}

				break;

				case 3:

					int contaAux2, encontrado2 = 0;
					double valorAux2;

					System.out.println("Digite o número da conta que deseja fazer o saque: ");
					
					contaAux2 = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < contas.size(); i++){

						if(contas.get(i).nConta == contaAux2){

							System.out.println("Digite o valor que deseja sacar: ");
							valorAux2 = Double.parseDouble(leitor.nextLine());
							contas.get(i).saldo -= valorAux2;

                            System.out.println("Titular da conta: " + contas.get(i).nomeTitular);
                            System.out.println("Número da conta: " + contas.get(i).nConta);
							System.out.println("Saldo atual: " + contas.get(i).saldo);

                            System.out.println("\nSaque concluido!!");

							encontrado2++;
							
						}

					}

					if(encontrado2 == 0){
						System.out.println("Conta não encontrada!!");
					}

				break;

				case 4:

					int contaAux3, encontrado3 = 0;

					System.out.println("Digite o número da conta que deseja consultar o saldo: ");

					contaAux3 = Integer.parseInt(leitor.nextLine());

					for(int i = 0; i < contas.size(); i++){

						if(contas.get(i).nConta == contaAux3){

                            System.out.println("Titular da conta: " + contas.get(i).nomeTitular);
							System.out.println("Número da Conta: " + contas.get(i).nConta);
							System.out.println("Saldo: " + contas.get(i).saldo);

							encontrado3++;

						}

					}

					if(encontrado3 == 0){
						System.out.println("Conta não encontrada!!");
					}

				break;
					
			}

			System.out.println("Deseja continuar a execução do programa?[S/N]");
			continuarProg = leitor.next().charAt(0);
			leitor.nextLine();
			
		}while((continuarProg == 's') || (continuarProg == 'S'));
        
    }
}
