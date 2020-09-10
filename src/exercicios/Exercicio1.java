package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Markson Arguello <marksonva@dcc.ufrj.br>
 *
 *
 * Executa o programa pedido no exercício 1.
 */

public class Exercicio1 {
    private static Scanner sc = new Scanner(System.in);

    public static void executar() {
        int tamanhoDaLista = 0;
        float[] lista;
        System.out.print("Digite o tamanho da lista: ");

        while (tamanhoDaLista <= 0) {
            try {
                tamanhoDaLista = lerNumeroInteiro();
                while (tamanhoDaLista == 0) {
                    tamanhoDaLista = lerNumeroInteiro();
                }
                lista = criarELerLista(tamanhoDaLista);

                float mediaDaLista = calcularMediaLista(tamanhoDaLista, lista);

                System.out.printf("A média da lista é %.2f\n", mediaDaLista);

            }
            catch (NegativeArraySizeException e){
                System.out.println("Tamanho não pode ser negativo");

            }

        }
        while (tamanhoDaLista == 0) {
            System.out.println("Tamanho da lista não pode ser 0. Digite novamente.");
            tamanhoDaLista = lerNumeroInteiro();
        }
    }

    private static int lerNumeroInteiro() {
        int numeroInteiro = 0;
        boolean numeroLido = false;

        do {
            try {
                numeroInteiro = sc.nextInt();
                numeroLido = true;

            }
            catch (InputMismatchException e) {
                System.out.println("====O número lido não é um inteiro====");
                sc.next();

            }

        }while (!numeroLido);

        return numeroInteiro;

    }

    private static float lerNumeroFloat() {
        float numero = 0;
        boolean numeroLido = false;

        do {
            try {
                numero = sc.nextFloat();
                numeroLido = true;

            }
            catch (InputMismatchException e){
                System.out.println("====O número lido não é um número real====");
                sc.next();

            }

        }while (!numeroLido);

        return numero;

    }

    private static float[] criarELerLista(int tamanhoDaLista) {
        float[] lista = new float[tamanhoDaLista];

        for (int indice = 0; indice < tamanhoDaLista; ++indice) {
            System.out.printf("Digite o número na posição %d: ", indice + 1);
            lista[indice] = lerNumeroFloat();

        }

        return lista;
    }


    private static float calcularMediaLista(int tamanhoDaLista, float[] lista) {
        float media = 0f;

        for (int indice = 0; indice < tamanhoDaLista; ++indice) {
            media += lista[indice];
        }

        media /= tamanhoDaLista;
        return media;

    }




}

