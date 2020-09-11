import java.util.InputMismatchException;
import java.util.Scanner;

import exercicios.Exercicio1;
import exercicios.Exercicio2;
import exercicios.Exercicio3;
/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Classe principal do programa.
 */

public class Main {
    static Scanner sc = new Scanner(System.in);
    /**
     * Executa o menu.
     * <p>
     * Executa o menu e lê a opção para rodar qual exercício o usuário quiser.
     * </p>
     *
     */
    public static void executarMenu() {
        int opcao;
        do{
            System.out.println("Qual exercício deseja testar? (1,2,3)");
            opcao = lerOpcao();
            while (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida\n(1, 2, 3)");
                opcao = lerOpcao();
            }

            switch (opcao) {
                case 1:
                    Exercicio1.executar();
                    break;
                case 2:
                    Exercicio2.executar();
                    break;
                case 3:
                    Exercicio3.executar();
                    break;
            }
            System.out.println("Deseja continuar?\n1 - sim\n2 - não");
            opcao = lerOpcao();
            while (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida\n1 - sim\n2 - não");
                opcao = lerOpcao();
            }


        }while (opcao != 2);
    }
    /**
     * Lê uma opção.
     * <p>
     * Lê uma opção como número inteiro.
     * Executa diversas vezes até ser um número inteiro maior que 0.
     * Lança um InputMismatchException caso não seja digitado um inteiro
     * </p>
     *
     * @return Número inteiro maior que 0.
     */
    public static int lerOpcao() {
        int numeroInteiro = 0;

        boolean numeroLido = false;
        do {
            try  {

                numeroInteiro = sc.nextInt();
                numeroLido = true;
            }
            catch (InputMismatchException e){
                System.out.println("====O número lido não é um inteiro====");
                sc.next();
            }
        }while (!numeroLido);

        return numeroInteiro;
    }
    /**
     * Função principal.
     * <p>
     * Metodo que chama o menu principal do programa.
     * </p>
     * @param args Argumentos
     */
    public static void main(String[] args) {
        executarMenu();
    }
}
