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

    /**
     * Lê um vetor e calcula sua média
     * <p>
     *     Executa um menu que irá pedir o tamnanho de um vetor, seus elementos e irá calcular e mostrar a média dos elementos.
     * </p>
     */

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

    /**
     * Lê um número inteiro.
     * <p>
     * Função que repetirá até ler um número inteiro da entrada padrão.
     * </p>
     * @return numeroInteiro Número inteiro lido
     */
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

    /**
     * Lê um número com virgula.
     * <p>
     * Função que repetirá até ler um número com virgula da entrada padrão.
     * </p>
     * @return numero Número com virgula lido
     */

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

    /**
     * Cria um vetor e lê seus elementos.
     * <p>
     * Cria um vetor com o tamanho passado por parâmetro e lê os seus elementos que são do tipo float.
     * </p>
     * @param tamanhoDaLista Tamanho do Vetor
     * @return lista Vetor com elementos
     */

    private static float[] criarELerLista(int tamanhoDaLista) {
        float[] lista = new float[tamanhoDaLista];

        for (int indice = 0; indice < tamanhoDaLista; ++indice) {
            System.out.printf("Digite o número na posição %d: ", indice + 1);
            lista[indice] = lerNumeroFloat();

        }

        return lista;
    }

    /**
     * Calcula a média dos elementos de um vetor.
     * <p>
     *     Recebe um vetor e seu tamanho como parâmetros e retorna a média de seus elementos.
     * </p>
     * @param tamanhoDaLista Tamanho do vetor passado
     * @param lista Vetor que a função irá calcular a média
     * @return media Media dos elementos do vetor.
     */

    private static float calcularMediaLista(int tamanhoDaLista, float[] lista) {
        float media = 0f;

        for (int indice = 0; indice < tamanhoDaLista; ++indice) {
            media += lista[indice];
        }

        media /= tamanhoDaLista;
        return media;

    }




}

