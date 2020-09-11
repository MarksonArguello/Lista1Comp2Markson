package exercicios;

import exercicios.classesExercicio3.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Executa o programa pedido no exercício 3.
 */


public class Exercicio3 {
    static Scanner sc = new Scanner(System.in);

    /**
     * Lê um ponto de um vértice.
     * <p>
     * Lê dois inteiros x e y e retorna um novo ponto com esses atributos.
     * </p>
     * @param i Posição do ponto (Se é o 1º, 2º, 3º...)
     * @return Um objeto do tipo Ponto
     */

    public static Ponto lerPonto(int i){
        double  x = 0, y = 0;
        boolean numeroLido = false;
        while (!numeroLido){
            try {
                System.out.println("Ponto " + i);
                System.out.print("Digite x: ");
                x = sc.nextDouble();
                System.out.print("Digite y: ");
                y = sc.nextDouble();
                System.out.println();
                numeroLido = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Digite um número real");
                System.out.println();
                sc.next();
            }
        }
        return new Ponto(x, y);
    }
    /**
     * Executa o programa para o exercício 3.
     * <p>
     * Executa o menu e pede os pontos de acordo com a figura geométrica escolhida.
     * Após isso calcula e mostra na tela a área e perimetro da figura escolhida de acordo com seus vértices.
     * </p>
     *
     */
    public static void executar(){
        System.out.println("Qual polígono?");
        System.out.println("1 - Circulo");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Trapézio");
        System.out.print("Opção: ");
        int opcao = 0;

        boolean numeroLido = false;
        do {
            try  {

                opcao = sc.nextInt();
                while(opcao < 0 || opcao > 4){
                    System.out.println("Opção inválida");
                    opcao = sc.nextInt();
                }
                numeroLido = true;
            }
            catch (InputMismatchException e){
                System.out.println("====O número lido não é um inteiro====");
                sc.next();
            }
        }while (!numeroLido );
        switch (opcao) {
            case 1:
                Ponto[] pontoCirculo = new Ponto[2];
                for(int indice = 0; indice < 2; indice++)
                    pontoCirculo[indice] = lerPonto(indice+1);
                Circulo circulo = new Circulo(pontoCirculo);
                System.out.println(circulo);
                break;
            case 2:
                Ponto[] pontoTriangulo = new Ponto[3];
                for(int indice = 0; indice < 3; indice++)
                    pontoTriangulo[indice] = lerPonto(indice+1);
                Triangulo triangulo = new Triangulo(pontoTriangulo);
                System.out.println(triangulo);
                break;
            case 3:
                Ponto[] pontoRetangulo = new Ponto[4];
                for(int indice = 0; indice < 4; indice++)
                    pontoRetangulo[indice] = lerPonto(indice+1);
                Retangulo retangulo = new Retangulo(pontoRetangulo);
                System.out.println(retangulo);
                break;
            case 4:
                Ponto[] pontoTrapezio = new Ponto[4];
                for(int indice = 0; indice < 4; indice++)
                    pontoTrapezio[indice] = lerPonto(indice+1);
                Trapezio trapezio = new Trapezio(pontoTrapezio);
                System.out.println(trapezio);
                break;
        }
    }
}
