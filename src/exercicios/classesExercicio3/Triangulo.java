package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Classe para representar um triângulo.
 */


public class Triangulo {
    public Ponto[] pontos;

    /**
     * Construtor do triângulo
     * @param pontos Pontos dos vértices
     */

    public Triangulo(Ponto[] pontos){
        this.pontos = pontos;
    }

    /**
     * Calcula a área do triângulo
     * @return area
     */
    public double calculaArea(){
        double det = 0;
        double diagPrin1, diagPrin2, diagPrin3, diagSec1, diagSec2, diagSec3;
        double[][] mat = {{pontos[0].getX(), pontos[0].getY(), 1.0}, {pontos[1].getX(), pontos[1].getY(), 1.0}, {pontos[2].getX(), pontos[2].getY(), 1.0}};


        diagPrin1 = mat[0][0] * mat[1][1] * mat[2][2];
        diagPrin2 = mat[0][1] * mat[1][2] * mat[2][0];
        diagPrin3 = mat[0][2] * mat[1][0] * mat[2][1];

        diagSec1 = mat[2][0] * mat[1][1] * mat[0][2];
        diagSec2 = mat[2][1] * mat[1][2] * mat[0][0];
        diagSec3 = mat[2][2] * mat[1][0] * mat[0][1];

        det = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);
        return Math.abs(det)/2.0;
    }

    /**
     * Calcula o perimetro do triângulo
     * @return perimetro
     */
    public double calcularPerimetro(){
        double perimetro = Ponto.distanciaEntreDoisPontos(pontos[0], pontos[1]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[1], pontos[2]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[2], pontos[0]);
        return perimetro;
    }
    /**
     * Retorna uma string com informações do triângulo
     * @return String com área e perímetro
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do triangulo é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do triangulo é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
