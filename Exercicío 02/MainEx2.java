import java.util.*;
import java.io.*;
public class MainEx2 {

    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        List<LivrosEx2> livros = new ArrayList<>();

        int resp;

        char continuarProg;

        do {
            do {
                System.out.println("Digite: ");
                System.out.println("[1] Para adicionar um livro");
                System.out.println("[2] Para imprimir a lista de todos os livros");

                resp = Integer.parseInt(leitor.nextLine());

                if ((resp < 1) || (resp > 2)) {

                    System.out.println("Resposta inválida!!");
                }

            } while ((resp < 1) || (resp > 2));

            switch (resp) {

                case 1:

                    LivrosEx2 livro1 = new LivrosEx2();

                    char addLivro;

                    do {

                        System.out.println("Digite o titulo do livro: ");
                        livro1.titulo = leitor.nextLine();

                        System.out.println("Digite o autor do livro: ");
                        livro1.autor = leitor.nextLine();

                        System.out.println("Digite o ano de publicação do livro: ");
                        livro1.anoPub = Integer.parseInt(leitor.nextLine());

                        do {

                            System.out.println("Quer adicionar mais livros?[S/N]: ");
                            addLivro = leitor.next().charAt(0);
                            leitor.nextLine();

                        } while ((addLivro != 's') && (addLivro != 'S') && (addLivro != 'n') && (addLivro != 'N'));

                        livros.add(livro1);

                    } while ((addLivro == 's') || (addLivro == 'S'));

                    break;

                case 2:

                    for (int i = 0; i < livros.size(); i++) {

                        System.out.println("Titulo livro " + (i + 1) + ": " + livros.get(i).titulo);

                        System.out.println("Autor livro " + (i + 1) + ": " + livros.get(i).autor);

                        System.out.println("Ano de publicação livro " + (i + 1) + ": " + livros.get(i).anoPub + "\n");
                    }

                    break;
            }

            System.out.println("Deseja continuar a execução do programa?[S/N]");
            continuarProg = leitor.next().charAt(0);
            leitor.nextLine();

        } while ((continuarProg == 's') || (continuarProg == 'S'));

    }
}
