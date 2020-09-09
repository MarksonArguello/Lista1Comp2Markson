import java.util.InputMismatchException;
import java.util.Scanner;

import exercicios.Exercicio1;
import exercicios.Exercicio2;

public class Main {
    static Scanner sc = new Scanner(System.in);

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
            }
            System.out.println("Deseja continuar?\n1 - sim\n2 - não");
            opcao = lerOpcao();
            while (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida\n1 - sim\n2 - não");
                opcao = lerOpcao();
            }


        }while (opcao != 2);
    }

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

    public static void main(String[] args) {
        executarMenu();
    }
}
