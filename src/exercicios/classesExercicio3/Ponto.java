package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Classe para representar um ponto de um vértice.
 */


public class Ponto {
    private double x;
    private double y;

    /**
     * Construtor de um objeto do tipo Ponto
     * @param x Valor do x
     * @param y Valor do y
     */

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Calcula a distância entre dois pontos
     *
     *
     * @param a Ponto a
     * @param b Ponto b
     * @return A distância entre os pontos a e b
     */

    public static double distanciaEntreDoisPontos(Ponto a, Ponto b){
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2.0) + Math.pow(Math.abs(a.y - b.y), 2.0));
    }


}
