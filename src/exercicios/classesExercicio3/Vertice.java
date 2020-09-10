package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello <marksonva@dcc.ufrj.br>
 *
 *
 * Classe para representar um vértice.
 */


public class Vertice {
    private double x;
    private double y;

    public Vertice(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distanciaEntreDoisPontos(Vertice a, Vertice b){
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2.0) + Math.pow(Math.abs(a.y - b.y), 2.0));
    }


}
