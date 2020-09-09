package exercicios;

import exercicios.classesExercicio3.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    static Scanner sc = new Scanner(System.in);

    public static Vertice lerVertice(int i){
        double  x = 0, y = 0;
        boolean numeroLido = false;
        while (!numeroLido){
            try {
                System.out.println("Vértice " + i);
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
        return new Vertice(x, y);
    }

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
                Vertice[] verticeCirculo = new Vertice[2];
                verticeCirculo[0] = lerVertice(1);
                verticeCirculo[1] = lerVertice(2);
                Circulo circulo = new Circulo(verticeCirculo);
                System.out.println(circulo);
                break;
            case 2:
                Vertice[] verticeTriangulo = new Vertice[3];
                verticeTriangulo[0] = lerVertice(1);
                verticeTriangulo[1] = lerVertice(2);
                verticeTriangulo[2] = lerVertice(3);
                Triangulo triangulo = new Triangulo(verticeTriangulo);
                System.out.println(triangulo);
                break;
            case 3:
                Vertice[] verticeRetangulo = new Vertice[4];
                verticeRetangulo[0] = lerVertice(1);
                verticeRetangulo[1] = lerVertice(2);
                verticeRetangulo[2] = lerVertice(3);
                verticeRetangulo[3] = lerVertice(4);
                Retangulo retangulo = new Retangulo(verticeRetangulo);
                System.out.println(retangulo);
                break;
            case 4:
                Vertice[] verticeTrapezio = new Vertice[4];
                verticeTrapezio[0] = lerVertice(1);
                verticeTrapezio[1] = lerVertice(2);
                verticeTrapezio[2] = lerVertice(3);
                verticeTrapezio[3] = lerVertice(4);
                Trapezio trapezio = new Trapezio(verticeTrapezio);
                System.out.println(trapezio);
                break;
        }
    }
}
