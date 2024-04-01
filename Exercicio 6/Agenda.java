import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
    
        List<Contato> contatos = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        char addContato;

        int op;

        char continuarProg;
            
        do{
                
            do{
                    
                System.out.println("Digite: ");
                System.out.println("[1] Para adicionar um novo contato");
                System.out.println("[2] Para remover um contato");
                System.out.println("[3] Para buscar um contato");
            
                op = Integer.parseInt(leitor.nextLine());

            }while((op < 1) || (op > 3));

            switch(op){
        
                case 1:

                    do{

                        String nomeAux;
                        long telAux;

                        System.out.println("Digite o nome: ");
                        nomeAux = leitor.nextLine();
                
                        System.out.println("Digite o número de telefone: ");
                        telAux = Long.parseLong(leitor.nextLine());

                        Contato c1 = new Contato(nomeAux, telAux);
                
                        contatos.add(c1);
                
                        System.out.println("Contato cadastrado com sucesso!!");
                
                        do {
                
                            System.out.println("Quer adicionar mais contatos?[S/N]: ");
                            addContato = leitor.next().charAt(0);
                            leitor.nextLine();
                
                        } while ((addContato != 's') && (addContato != 'S') && (addContato != 'n') && (addContato != 'N'));
                
                    }while((addContato == 's') || (addContato == 'S'));
            
                break;

                case 2:
                    
                    String nomeAux2;
                    int encontrado = 0;

                    System.out.println("Digite o nome do contato que deseja remover: ");
                    nomeAux2 = leitor.nextLine();

                    for(int i = 0; i < contatos.size(); i++){

                        if(contatos.get(i).nome.contains(nomeAux2)){

                            contatos.remove(contatos.get(i));

                            System.out.println("Contato removido com sucesso!");

                            encontrado++;

                        }

                    }

                    if(encontrado == 0){

                        System.out.println("Contato não encontrado!");

                    }

                break;

                case 3:

                    String nomeAux3;
                    int encontrado2 = 0;

                    System.out.println("Digite o nome do contato que deseja buscar: ");
                    nomeAux3 = leitor.nextLine();

                    for(int i = 0; i < contatos.size(); i++){

                        if(contatos.get(i).nome.contains(nomeAux3)){

                            System.out.println("Nome: " + contatos.get(i).nome);

                            System.out.println("Telefone: " + contatos.get(i).telefone);

                            encontrado2++;

                        }

                    }

                    if(encontrado2 == 0){

                        System.out.println("Contato não encontrado!");

                    }

                break;
                
            }
        
            System.out.println("Deseja continuar a execução do programa?[S/N]");
            continuarProg = leitor.next().charAt(0);
            leitor.nextLine();
                
        } while((continuarProg == 's') || (continuarProg == 'S'));

    }

}
