package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author  Markson Arguello <marksonva@dcc.ufrj.br>
 *
 *
 * Executa o programa pedido no exercício 2.
 */


public class Exercicio2 {
    private static Scanner sc = new Scanner(System.in);
    /**
     * Lê e ordena palavras.
     * <p>
     * Lê várias palavras em uma linha separadas por espaço, ordena e mostra na tela a lista ordenada.
     * </p>
     *
     */

    public static void executar(){

        System.out.println("Digite as palavras: ");

        ArrayList<String> lista = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));

        Collections.sort(lista, String::compareToIgnoreCase);
        for (String palavra: lista) {
            System.out.println(palavra);
        }
        System.out.println();
    }
}
